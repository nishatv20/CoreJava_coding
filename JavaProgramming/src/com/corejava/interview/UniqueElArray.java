package com.practice.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UniqueElArray {
	void getUniqueElem(int[] arr) {
		int size = arr.length;
		int[] freq = new int[size];
		int visited = -1;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[i] = visited;
				}
			}
			if (freq[i] != -1) {
				freq[i] = count;
			}
		}
		System.out.println("UNIQUE ELEMENTS :");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		UniqueElArray ua = new UniqueElArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		ua.getUniqueElem(arr);
	}
}
