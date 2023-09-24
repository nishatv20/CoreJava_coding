package com.practice.interview;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BinarySearch {
int binarySearch(int[] arr, int ele, int size) {
	int low,high,mid;
	low = 0;
	high = size -1;
	
	while(low<=high) {
		mid = (low + high)/2;
		if(arr[mid]==ele) {return mid;}
		else if(arr[mid]<ele) {low = mid+1;}
		else {high = mid-1;}
	}
	return -1;
	
}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinarySearch bs = new BinarySearch();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SIZE OF ARRAY :");
		int size = Integer.parseInt(br.readLine());
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("ENTER ELEMENT YOU WANT TO SEARCH :");
		int ele = Integer.parseInt(br.readLine());
		int re = bs.binarySearch(arr, ele, size);
		if (re == -1) {
			System.out.println("ELEMENT IS NOT AVAILABLE");
		} else {
			System.out.println("ELEMENT FOUND AT :" + re);
		}
	}
}
