package Stack;

public class MyStack {
	// LIFO
	int capacity = 2;
	int stack[] = new int[capacity];
	int size = 0;
	
	public MyStack() {}
	public MyStack(int capacity) {
		this.capacity = capacity;
	}
	boolean isEmpty() {
		return size == 0;
	}
	boolean isFull() {
		return size == capacity;
	}
	void push(int data) {
		if(isFull()) {
			exceed();
		}
		stack[size] = data;
		size++;
	}
	int pop() {
		int data = stack[size-1];
		stack[size-1] = 0;
		size--;
		return data;
	}
	int peek() {
		int data = stack[size-1];
		return data;
	}
	void exceed() {
		this.capacity = capacity * 2;
		int temp[] = new int[capacity];
		for(int i = 0; i < size; i++) {
			temp[i] = stack[i];
		}
		stack = temp;
	}
	void show() {
		System.out.print("[");
		for(int i = 0; i < size; i++) {
			System.out.print(stack[i]);
			if(i != size -1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
