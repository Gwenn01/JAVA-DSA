package ArrayList;

public class Main {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(10);
		list.add(5);
		list.add(6);
		list.add(324);
		list.add(432);
		list.add(32);
		list.add(21);
		list.add(43);
		list.add(12);
		list.add(35);
		list.add(65);
		list.add(98);
		list.remove();
		list.add(3, 50);
		list.remove(2);
		
		System.out.println(list.ToString());
	}

}
