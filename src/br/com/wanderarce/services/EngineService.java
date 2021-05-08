package br.com.wanderarce.services;

import br.com.wanderarce.entities.Node;
import br.com.wanderarce.entities.TreeNode;
import br.com.wanderarce.interfaces.IEngine;

public class EngineService implements IEngine {

	TreeNode tree;
	@Override
	public TreeNode insertNode(Node parent, Node children) {    
		if (parent == null) {
			parent = children;
			tree.setRoot(children);
		}
		return tree;
	}
	
	@Override
	public Node init() {

		Node root = new Node("Massa", null, null, false);
		root.setNodeLeft(new Node("Lasanha", null, null, true));
		root.setnodeRight(new Node("Bolo de Chocolate", null, null, true));
		return root;
	}
	
	@Override
	public Node updateNode(Node node, String hint, String value, boolean isDish) {
        System.out.println(hint);
        System.out.println(value);
        System.out.println("Dish: " + isDish);
        System.out.println(node.getNodeValue() +"-"+ node.isDish());
		String hunch = node.getNodeValue();
        node.setDish(hint);
        node.setDish(false);
        node.setNodeLeft(new Node(value, null, null, isDish));
        node.setnodeRight(new Node(hunch,  null, null, isDish));
        return node;
    }
}
