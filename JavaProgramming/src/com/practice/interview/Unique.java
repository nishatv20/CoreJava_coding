package com.practice.interview;

public class Unique {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 56, 1, 2, 4 };
		int size = arr.length;
		int freq[] = new int[size];
		int visited = -1;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					freq[j] = visited;
					count++;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}
		System.out.println("UNIQUE ELEMENTS :");
		for (int z = 0; z < freq.length; z++) {
			if (freq[z] == 1) {
				System.out.println(arr[z]);
			}
		}
	}

}
