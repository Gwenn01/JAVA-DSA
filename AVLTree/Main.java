package AVLTree;

public class Main {

	public static void main(String[] args) {
		//Self balancing tree
		AVLtree tree = new AVLtree();
		
		for(int i = 1; i <= 10; i++) {
			tree.insert(i);
		}
		tree.display();
		System.out.println(tree.height());

	}

}
