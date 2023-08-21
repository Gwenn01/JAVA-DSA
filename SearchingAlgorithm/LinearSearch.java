package SearchingAlgorithm;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {2, 4, 10, 15, 20, 35, 53};
		int target = 10;
		
		int ans = search(arr, target);
		System.out.println(ans);

	}

	static int search(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
