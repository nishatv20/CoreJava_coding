package com.prog.oops;

import java.util.Scanner;

class Test {

	public void findOccurance(int[] arr) {
		int[] fr = new int[5];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println("ELEMENTS  |    FREQUENCY");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println("   " + arr[i] + "      |     " + fr[i]);
			}
		}
	}

	public void findOccurance(char[] crr) {
		int[] fr = new int[5];
		int visited = -1;
		for (int i = 0; i < crr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < crr.length; j++) {
				if (crr[i] == crr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println("ELEMENTS  |   FREQUENCY");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println("   " + crr[i] + "      |     " + fr[i]);
			}
		}
	}
}

class OverloadOccurance {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3 };
		char[] crr = { 'A', 'A', 'B', 'B', 'C' };
		Test t = new Test();
		t.findOccurance(arr);
		t.findOccurance(crr);
	}
}