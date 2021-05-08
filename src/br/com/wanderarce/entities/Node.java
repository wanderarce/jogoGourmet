package br.com.wanderarce.entities;

public class Node {

	private String nodeValue;
	private Node nodeLeft;
	private Node nodeRight;
	private boolean isDish;
	
	public Node() {}
	
	public Node(String nodeValue, Node nodeLeft, Node nodeRight, boolean isDish) {
		this.nodeValue = nodeValue;
		this.nodeLeft = nodeLeft;
		this.nodeRight = nodeRight;
		this.isDish = isDish;
	}
	
	public String getNodeValue() {
		return nodeValue;
	}
	
	public void setDish(String nodeValue) {
		this.nodeValue = nodeValue;
	}
		
	public Node getNodeLeft() {
		return nodeLeft;
	}
	
	public void setNodeLeft(Node nodeLeft) {
		this.nodeLeft = nodeLeft;
	}
	
	public Node getRightNode() {
		return nodeRight;
	}
	
	public void setnodeRight(Node nodeRight) {
		this.nodeRight = nodeRight;
	}
	
	public boolean isDish() {
		return isDish;
	}

	public void setDish(boolean isDish) {
		this.isDish = isDish;
	}

	public boolean withoutChildren() {
		return this.nodeRight == null && this.nodeLeft == null;
	}
}
