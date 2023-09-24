package com.corejava.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearSeaArray {
	int searchEle(int[] arr, int ele, int size) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		LinearSeaArray ls = new LinearSeaArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("ENTER ELEMENT YOU WANT TO SEARCH");
		int ele = Integer.parseInt(br.readLine());
		int res = ls.searchEle(arr, ele, size);
		if (res == -1) {
			System.out.println("---ELEMENT NOT FOUND---");
		} else {
			System.out.println("---ELEMENT FOUND AT : " + res + "---");
		}
	}
}
