package com.practice.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearchArray {
	int getEleme(int[] arr, int size, int ele) {
		int low, high, mid;
		low = 0;
		high = size - 1;

		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == ele) {
				return mid;
			}
			if (arr[mid] < ele) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		BinarySearchArray ba = new BinarySearchArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("ENTER ELEMENT YOU WANT TO SEARCH :");
		int ele = Integer.parseInt(br.readLine());
		int res = ba.getEleme(arr, size, ele);
		if (res == -1) {
			System.out.println("ELEMENT NOT FOUND");
		} else {
			System.out.println("ELEMENT FOUND AT :" + res + " INDEX");
		}
	}
}
