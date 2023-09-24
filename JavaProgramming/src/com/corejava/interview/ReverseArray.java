package com.practice.interview;

public class ReverseArray {
	void revArr(int[] arr) {
		int size = arr.length;
		System.out.println("--ARRAY IN REVERSE--");
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int[] arr = { 1, 2, 3, 4, 5 };
		ra.revArr(arr);
	}
}
