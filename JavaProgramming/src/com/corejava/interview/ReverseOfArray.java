package com.corejava.interview;

public class ReverseOfArray {
	void revOfArr(int[] arr) {
		int size = arr.length;
		int[] rev = new int[size];
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			rev[j] = arr[i];
			j--;
		}

		System.out.println("REVERSE OF ARRAY :");
		for (int i = 0; i < size; i++) {
			System.out.println(rev[i]);
		}
	}

	public static void main(String[] args) {
		ReverseOfArray roa = new ReverseOfArray();
		int[] arr = { 1, 2, 3, 4, 5 };
		roa.revOfArr(arr);
	}
}
