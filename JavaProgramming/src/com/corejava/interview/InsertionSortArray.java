package com.corejava.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InsertionSortArray {
	void insertionSort(int[] arr) {
		int size = arr.length;
		int i, j, key;

		for (i = 1; i < size; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println("SORTED ARRAY :");
		for (int z = 0; z < size; z++) {
			System.out.println(arr[z]);
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InsertionSort is = new InsertionSort();
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		is.insertionSort(arr);
	}
}
