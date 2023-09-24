package com.practice.interview;

public class ReverseWithoutArray {
	void getRevWithout(int[] arr) {
		int size = arr.length;
		int temp;
		for (int i = 0; i < size / 2; i++) {
			temp = arr[i];
			System.out.println("temp" + temp);
			arr[i] = arr[size - i - 1];
			System.out.println("arr[i]" + arr[i]);
			arr[size - i - 1] = temp;
			System.out.println("arr[size-i-1]" + arr[size-i-1]);
		}

		System.out.println("ARRAY IN REVERSE :");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		ReverseWithoutArray rwa = new ReverseWithoutArray();
		int[] arr = { 1, 2, 3, 4, 5 };
		rwa.getRevWithout(arr);
	}
}
