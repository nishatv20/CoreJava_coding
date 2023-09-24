package com.corejava.interview;

public class LinearSearch {

	int getElem(int[] arr, int size, int ele) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		int[] arr = { 1, 2, 3, 4, 5 };
		int size = 5;
		int ele = 3;
		int re = ls.getElem(arr, size, ele);
		System.out.println("ELEMENT FOUND AT INDEX :" + re);
	}
}
