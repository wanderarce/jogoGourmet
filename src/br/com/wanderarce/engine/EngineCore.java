package br.com.wanderarce.engine;

import javax.swing.JOptionPane;

import br.com.wanderarce.entities.Node;
import br.com.wanderarce.entities.TreeNode;
import br.com.wanderarce.services.EngineService;

public class EngineCore {

	TreeNode tree;
	int hits;

	EngineService engineService = new EngineService();

	public EngineCore() {
		tree = new TreeNode();
	}

	private void init() {
		Node root = engineService.init();
		tree = new TreeNode(root);
		hits = 0;
	}

	public void load() {
		init();
		start();
	}

	public void start() {
		//if (tree.getRoot() == null || tree.getRoot().getNodeLeft() == null) {
			showInitialDialog();
		//}
		opine(tree.getRoot());
	}

	private int showInitialDialog() {
		Object[] options = { "Ok" };
		return JOptionPane.showOptionDialog(null, "Pense em um prato que gosta.", "Jogo Gourmet",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	}

	public void opine(Node node) {
		String question = "O prato que você pensou é " + node.getNodeValue() + "?";
		int answer = JOptionPane.showConfirmDialog(null, question, "Jogo Gourmet", JOptionPane.YES_NO_OPTION);
		
		if (answer == JOptionPane.OK_OPTION) {
			if (node.isDish()) {
				winner();
			} else {
				opine(node.getNodeLeft());
			}
		} else {
			if (node.getRightNode() == null) {
				showQuestion(node);
				start();
			} else if (node.getRightNode() != null) {
				opine(node.getRightNode());
			} else {
				opine(node.getNodeLeft());
			}
		}

	}

	private void showQuestion(Node node) {
		String playerThinked = JOptionPane.showInputDialog("Qual prato você pensou?");
		if (playerThinked == null || playerThinked.trim().isEmpty()) {
			finish();
			showQuestion(node);
		}
		showQuestionParticulars(node, playerThinked);
	}

	private void showQuestionParticulars(Node node, String playerThinked) {
		String hint = requestInformations(playerThinked + " é _________ mas " + node.getNodeValue() + " não.");
		if (hint == null || hint.trim().isEmpty()) {
			finish();
			showQuestionParticulars(node, playerThinked);
		}
		if (playerThinked != null && hint != null)
			updateNode(node, hint, playerThinked, node.isDish());
	}

	private String requestInformations(String message) {
		return JOptionPane.showInputDialog(message);
	}

	private void winner() {
		hits++;
		if (hits < 2) {
			JOptionPane.showMessageDialog(null, "Acertei!");
		} else {
			JOptionPane.showMessageDialog(null, "Acertei de novo!");
		}
		start();
	}

	private void updateNode(Node node, String hint, String value, boolean isDish) {
		node = engineService.updateNode(node, hint, value, isDish);
	}
	
	private void finish() {
		int close = JOptionPane.showConfirmDialog(null, "Deseja encerrar o jogo?", "Jogo Gourmet", JOptionPane.YES_NO_OPTION);
		if(close ==0) {
			System.exit(1);
		}
	}
		

}
