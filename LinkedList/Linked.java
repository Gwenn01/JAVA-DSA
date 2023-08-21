package LinkedList;

public class Linked {

	private Node head;
	private int size;
	
	Linked(){
		size = 0;
	}
	boolean isEmpty() {
		return size == 0;
	}
	void add(int val) {
		Node node = new Node(val);
		if(isEmpty()) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	private class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
}
