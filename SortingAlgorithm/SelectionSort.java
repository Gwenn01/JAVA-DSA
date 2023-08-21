package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {5, 3, 7, 2, 1, 9, 6, 4, 8};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int max = 0;
			for(int j = 1; j < arr.length-i; j++) {
				if(arr[j] > arr[max]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
	}

}
