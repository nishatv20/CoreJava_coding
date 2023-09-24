package com.practice.interview;

public class SelectionSort {
	void selectionSort(int[] arr) {
		int size = arr.length;
		int minIndex, i, j;
		for (i = 0; i < size; i++) {
			minIndex = i;
			for (j = i + 1; j < size; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("SORTED ARRAY :");
		for (int z = 0; z < size; z++) {
			System.out.println(arr[z]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 11 };
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);
	}
}
