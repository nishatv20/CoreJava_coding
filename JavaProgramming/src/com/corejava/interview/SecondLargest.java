package com.corejava.interview;

public class SecondLargest {
	void secondLargest(int[] arr) {
		int size = arr.length;
		int max1, max2;
		max1 = arr[0];
		max2 = arr[1];
		int i, temp;

		if (max1 > max2) {
			temp = max1;
			max1 = max2;
			max2 = temp;
		}
		for (i = 2; i < size; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2 && arr[i] != max1) {
				max2 = arr[i];
			}
		}
		System.out.println("SECOND MAXIMUM :");
		System.out.println("MAX 1 " + max1);
		System.out.println(max2);
	}

	public static void main(String[] args) {
		SecondLargest sl = new SecondLargest();
		int[] arr = { 10, 20, 11, -4, 5 };
		sl.secondLargest(arr);
	}
}
