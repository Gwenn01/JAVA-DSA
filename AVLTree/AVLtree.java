package AVLTree;
public class AVLtree {
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
		
		if(!balanced(node)){
		  return selfBalance(node);
		}else {
		  return node;
		}
	}
	// SELF BALANCE 
	public Node selfBalance(Node node) {
		if(node.left != null && node.left.left != null) {
			// its a left left
			return leftLeftRotate(node);
		}else if(node.left != null && node.left.right != null) {
			// its a left right 
			return leftRightRotate(node);
		}else if(node.right != null && node.right.right != null) {
			// its a right right
			return rightRightRotate(node);
		}else if(node.right != null && node.right.left != null) {
			// its a right left
			return rightLeftRotate(node);
		}
		
		return node;
	}
	// left left rotate
	public Node leftLeftRotate(Node p) {
		Node c = p.left;
		Node t = c.right;
		c.right = p;
		p.left = t;
		
		p.height = Math.max(height(p.left), height(p.right)) + 1;
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		
		return c;
	}
	// right right rotate
	public Node rightRightRotate(Node p) {
		Node c = p.right;
		Node t = c.left;
		c.left = p;
		p.right = t;
		
		p.height = Math.max(height(p.left), height(p.right)) + 1;
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		
		return c;
	}
	// left right rotation
	public Node leftRightRotate(Node p) {
		Node g = p.left.right;
		Node c = p.left;
		Node t1 = g.left;
		Node t2 = g.right;
		
		g.left = c;
		g.right = p;
		c.right = t1;
		p.left = t2;
		
		p.height = Math.max(height(p.left), height(p.right)) + 1;
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		g.height = Math.max(height(g.left), height(g.right)) + 1;
		
		
		return g;
	}
	public Node rightLeftRotate(Node p) {
		Node g = p.right.left;
		Node c = p.right;
		Node t1 = g.left;
		Node t2 = g.right;
		
		g.right = c;
		g.left = p;
		c.left = t2;
		p.right = t1;
		
		p.height = Math.max(height(p.left), height(p.right)) + 1;
		c.height = Math.max(height(c.left), height(c.right)) + 1;
		g.height = Math.max(height(g.left), height(g.right)) + 1;
		
		return g;
	}
	// check if balanced
	public boolean balanced() {
		return balanced(root);
	}
	public boolean balanced(Node node) {
		if(node == null) {
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
	}
	// get height
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
