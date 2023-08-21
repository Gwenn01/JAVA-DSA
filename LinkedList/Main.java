package LinkedList;

public class Main {

	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst(5);
		list.addLast(2);
		list.addLast(4);
		list.addLast(6);
		list.addLast(8);
		list.addFirst(1);
		list.addIndex(1, 3);
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeIndex(3));
		
		list.display();

	}

}
