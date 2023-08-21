package Queue;

public class MyQueue {
	// FIFO
	int capacity = 5;
	int queue[] = new int[capacity];
	int size = 0;
	int start = 0;
	int end = 0;
	
	
	public MyQueue() {}
	public MyQueue(int capacity) {
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
		queue[end] = data;
		end++;
		end = end % queue.length;
		size++;
	}
	int pop() {
		int data = queue[start];
		start++;
		start = start % queue.length;
		size--;
		return data;
	}
	int peek() {
		int data = queue[start];
		return data;
	}
	void exceed() {
		this.capacity = capacity * 2;
		int temp[] = new int[capacity];
		int i = start;
		int j = 0;
		do {
			temp[j] = queue[i];
			i++;
			j++;
			i = i % queue.length;
		}while(i != end);
		start = 0;
		end = size;
		queue = temp;
	}
	void show() {
		System.out.print("[");
		int i = start;
		do {
			System.out.print(queue[i]);
			i++;
			i = i % queue.length;
			if(i != end) {
				System.out.print(", ");
			}
		}while(i != end);
		
		System.out.print("]");
	}
}
