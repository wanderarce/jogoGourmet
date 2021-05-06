package br.com.wanderarce.interfaces;

import br.com.wanderarce.entities.Node;
import br.com.wanderarce.entities.TreeNode;

public interface IEngine {

	TreeNode insertNode(Node parent, Node children);
	
	Node init();
	
	Node updateNode(Node node, String hint, String value, boolean isDish);
}
