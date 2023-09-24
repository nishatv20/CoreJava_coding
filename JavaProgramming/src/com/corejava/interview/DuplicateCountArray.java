package com.practice.interview;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DuplicateCountArray {
	void getCount(int[] arr) {
		int size = arr.length;
		int[] freq = new int[size];
		int visited = -1;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}

		System.out.println("DUPLICATE ELEMENTS COUNT:");
		int dup_count = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != -1 && freq[i]!= 1) {
				dup_count++;
			}
		}
		System.out.println(dup_count);
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		DuplicateCountArray dca = new DuplicateCountArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dca.getCount(arr);
	}
}
