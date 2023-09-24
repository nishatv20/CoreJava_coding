package com.corejava.interfacee;

import java.util.Scanner;

public class StringOperation implements Operations {

	public void countOccurance() {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("--ENTER YOUR STRING--");
		str = sc.nextLine();
		int visited = -1;
		int len = str.length();
		int[] freq = new int[len];
		for (int i = 0; i < len; i++) {
			int count = 1;
			for (int j = i + 1; j < len; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}
		System.out.println("ELEMENT  |  FREQUENCY");
		for (int i = 0; i < len; i++) {
			if (freq[i] != visited) {
				System.out.println(str.charAt(i) + "               " + freq[i]);
			}
		}
	}

	public void reverse() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("--ENTER A STRING--");
		str = sc.nextLine();
		int len = str.length();
		System.out.println("--STRING IN REVERSE IS--");
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(str.charAt(i) + " ");
		}
	}
}
