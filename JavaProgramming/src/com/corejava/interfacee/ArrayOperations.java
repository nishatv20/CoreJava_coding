package com.corejava.interfacee;

import java.util.Scanner;

public class ArrayOperations implements Operations {

	public void countOccurance() {
		Scanner sc = new Scanner(System.in);
		int no_of_ele;
		System.out.println("--ENTER NO OF ARRAY ELEMENTS--");
		no_of_ele = sc.nextInt();
		int[] arr = new int[no_of_ele];
		System.out.println("--ENTER ARRAY ELEMENTS--");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] freq = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}
		System.out.println("ELEMENT |  FREQUENCY");
		for (int i = 0; i < arr.length; i++) {
			if (freq[i] != visited) {
				System.out.println(arr[i]      + "          " +      freq[i]);
			}
		}
	}
	
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER SIZE OF ARRAY");
	    int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("--ARRAY IN REVERSE IS--");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
