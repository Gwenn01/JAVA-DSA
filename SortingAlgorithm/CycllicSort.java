package SortingAlgorithm;

import java.util.Arrays;

public class CycllicSort {

	public static void main(String[] args) {
		int arr[] = {5, 3, 7, 2, 1, 9, 6, 4, 8};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int[] arr) {
		int i = 0;
		while(i < arr.length-1) {
			int correctIndex = arr[i] - 1;
			if(arr[i] != arr[correctIndex]) {
				int temp= arr[correctIndex];
				arr[correctIndex] = arr[i];
				arr[i] = temp;
			}else {
				i++;
			}
		}
		
	}

}
