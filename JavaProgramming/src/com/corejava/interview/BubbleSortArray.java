package com.practice.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSortArray {
	void sortArray(int[] arr) {
		int size = arr.length;
		int i, j, temp;
		for (i = 0; i < size - 1; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("ARRAY AFTER SORTING");
		for (int x = 0; x < size; x++) {
			System.out.println(arr[x]);
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		BubbleSortArray bs = new BubbleSortArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bs.sortArray(arr);
	}
}
