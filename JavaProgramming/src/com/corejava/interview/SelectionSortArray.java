package com.practice.interview;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class SelectionSortArray {
	void selectionSort(int[] arr) {
		int size = arr.length;
		int i, j, minIndex;
		for (i = 0; i < size; i++) {
			minIndex = i;
			for (j = 0; j < size; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("SORTED ARRAY :");
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		SelectionSort ss = new SelectionSort();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		ss.selectionSort(arr);
	}
}
