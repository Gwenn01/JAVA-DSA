package ArrayList;

public class MyArrayList {
	private int[] data;
	private int capacity;
	private int size;
	
	public MyArrayList() {
		this.size = 0;
		this.capacity = 10;
		data = new int[capacity];
	}
	boolean isEmpty() {
		return size == 0;
	}
	void add(int val) {
		if(size == capacity) {
			doubleSize();
		}
		data[size] = val;
		size += 1;
	}
	void add(int index, int val) {
		if(size == capacity) {
			doubleSize();
		}
		for(int i = size; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = val;	
		size +=1;
	}
	void remove() {
		data[size] = 0;
		size -= 1;
	}
	void remove(int index) {
		for(int i = index; i <= size; i++) {
			data[i] = data[i+1];
		}
		data[size] = 0;
		size -= 1;
	}
	void doubleSize() {
		this.capacity *= 2;
		int temp[] = new int[capacity];
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		this.data = temp;
	}
	String ToString() {
		String result = "";
		result += "[";
		for(int i = 0; i < size; i++) {
			result += data[i];
			if(i != size-1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	
}
