package br.com.wanderarce.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runners.MethodSorters;

import br.com.wanderarce.entities.Node;
import br.com.wanderarce.entities.TreeNode;
import br.com.wanderarce.services.EngineService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeJUnitTests {

	TreeNode tree;
	Node root;
	EngineService engineService = new EngineService();; 
	

	private void initializeValues() {
		root = engineService.init();
		tree = new TreeNode(root);
	}

	@Test
    public void stage1_treeStarterNull() {
		assertEquals(tree, null);
    }
	
	@Test
	public void stage2_initializeTreeStart() {
		initializeValues();
		assertEquals(tree.getRoot(), root);
	}
	
	@Test
	public void stage3_firstNodeIsNotDish() {
		initializeValues();
		assertNotEquals(tree.getRoot().isDish(), true);
	}
	
	@Test
	public void stag4_firstChildNodeUpdate() {
		initializeValues();
		Node nodeTemp =tree.getRoot().getRightNode();
		Node nodeAux = engineService.updateNode(nodeTemp, "Doce", "Pudim", nodeTemp.isDish());
		assertEquals(nodeTemp.getNodeValue(), nodeAux.getNodeValue());
	}
}
