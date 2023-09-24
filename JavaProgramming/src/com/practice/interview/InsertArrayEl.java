package com.practice.interview;

public class InsertArrayEl {
	void insertElement(int[] a, int ele, int pos) {
		int size = a.length;
		int[] b = new int[size + 1];
		int index = pos - 1;
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		b[index] = ele;
		int j, k = index + 1;
		for (j = index; j < 5; j++) {
			b[k] = a[j];
			k++;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		InsertArrayEl ia = new InsertArrayEl();
		int[] arr = { 10, 20, 30, 40, 50 };
		ia.insertElement(arr, 00, 3);
	}
}
