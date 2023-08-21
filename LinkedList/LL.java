package LinkedList;

public class LL {
	
	private Node head;
	private int size;
	
	public LL() {
		size = 0;
	}
	public void addLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}else {
			Node temp =head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}
	public void addFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		size++;
	}
	public void addIndex(int index, int data) {
		Node temp = head;
		if(index == 0) {
			addFirst(data);
		}
		if(index == size) {
			addLast(data);
		}
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		size++;
		Node node = new Node(data, temp.next);
		temp.next = node;
	}
	public int removeFirst(){
		if(head.next == null) {
			head = null;
		}
		int data = head.val;
		head = head.next;
		size--;
		return data;
		
	}
	public int removeLast() {
		if(head.next == null) {
			head = null;
		}
		Node temp = head;
		Node prev = null;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		int data = prev.val;
		prev.next = null;
		size--;
		return data;
	}
	public int removeIndex(int index) {
		if(head.next == null) {
			head = null;
		}
		Node temp = head;
		Node prev = null;
		for(int i = 0; i < index; i++) {
			prev = temp;
			temp = temp.next;
		}
		int data = temp.val;
		prev.next = temp.next;
		return data;
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}
	boolean isEmpty() {
		return size == 0;
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
