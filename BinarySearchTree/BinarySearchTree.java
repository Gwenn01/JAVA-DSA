package BinarySearchTree;

public class BinarySearchTree {
	class Node{
		int val;
		int height = 0;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
	// Inserting
	public void insert(int val){
	  if(root == null) {
		  root = new Node(val);
	  }
	  root = insert(root, val);
	}
	public Node insert(Node node, int val) {
		if(node == null) {
			return new Node(val);
		}
		
		if(val < node.val) {
			node.left = insert(node.left, val);
		}
		if(val > node.val) {
			node.right = insert(node.right, val);
		}
		
		node.height = Math.max(height(node.left), height(node.right)) + 1; 
		
		return node;
	}
	public int height() {
		return height(root);
	}
	public int height(Node node) {
		if(node == null) {
			return -1;
		}
		return node.height;
	}
	// Display
	public void display() {
		String details = "Root Node: ";
		display(root, details);
	}
	public void display(Node node, String details) {
		if(node == null) {
			return;
		}
		System.out.println(details + node.val);
		display(node.left, "Left Child of " + node.val + " : ");
		display(node.right, "Right Child of " + node.val + " : ");
	}
}
