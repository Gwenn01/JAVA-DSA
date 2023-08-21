package Queue;

public class Main {

	public static void main(String[] args) {
		MyQueue que = new MyQueue();
		
		que.push(1);
		que.push(2);
		que.push(3);
		que.push(4);
		que.push(5);
		que.pop();
		que.pop();
		que.push(1);
		que.push(2);
		que.push(4);
		System.out.println(que.capacity);
		que.show();

	}

}
