package com.practice.interview;

public class InsertionSort {
	void insertionSort(int[] arr) {
		int size = arr.length;
		int i, key, j;
		for (i = 1; i < size; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println("SORTED ARRAY IS :");
		for (int i1 = 0; i1 < size; i1++) {
			System.out.println(arr[i1]);
		}
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] arr = { 11, -12, -5, 692, 0 };
		is.insertionSort(arr);
	}
}
