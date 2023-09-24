package com.corejava.interview;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BubbleSort {
	void bubbleSort(int[] arr) {
		int size = arr.length;
		int i, j, temp;
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("---SORTED ARRAY---");
		for (int z = 0; z < size; z++) {
			System.out.println(arr[z]);
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		BubbleSort bs = new BubbleSort();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		bs.bubbleSort(arr);
	}
}
