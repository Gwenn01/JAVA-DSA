package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(15);
		tree.insert(10);
		tree.insert(20);
		tree.insert(17);
		tree.insert(5);
		tree.insert(2);
		tree.display();
		System.out.println(tree.height()); 
		
	}

}
