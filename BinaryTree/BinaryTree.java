package BinaryTree;

public class BinaryTree {
	class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	private Node root;
	
	public BinaryTree(){
	}
	// Insert Root
	public void insertRoot(int val) {
		root = new Node(val);
	}
	// Insert left
	public void insertLeft(int index, int val) {
		 insertLeft(root, index, val);
	}
	// overloading
	public void insertLeft(Node node, int index, int val) {
		if(node == null) {
			return;
		}
		if(node.val == index) {
			node.left = new Node(val);
			return;
		}
		insertLeft(node.left, index, val);
		insertLeft(node.right, index, val);
	}
	// Insert right
	public void insertRight(int index, int val) {
		 insertRight(root, index, val);
	}
	// overloading
	public void insertRight(Node node, int index, int val) {
		if(node == null) {
			return;
		}
		if(node.val == index) {
			node.right = new Node(val);
			return;
		}
		insertRight(node.right, index, val);
		insertRight(node.left, index, val);
		
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
