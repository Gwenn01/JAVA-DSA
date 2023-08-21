package BinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree tre = new BinaryTree();
		tre.insertRoot(5);
		tre.insertLeft(5, 10);
		tre.insertRight(5, 20);
		
		tre.insertLeft(10, 3);
		tre.insertRight(10, 4);
		
		tre.insertLeft(20, 18);
		tre.insertRight(20, 15);
		tre.display();
		
		
	}
}
