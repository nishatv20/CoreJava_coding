import java.util.Scanner;
package com.corejava.oops;
class Test {

	public void search(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				System.out.println("ELEMENT FOUND AT :" + i);
			}
		}
	}

	public void search(char[] crr, char ch) {
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == ch) {
				System.out.println("ELEMENT FOUND AT :" + i);
			}
		}
	}
}

class OverloadSearch {

	public static void main(String[] args) {
		int val;
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer You want to Search");
		val = sc.nextInt();
		System.out.println("Enter Character You want to Search");
		ch = sc.next().charAt(0);
		int[] arr = { 1, 2, 3, 4, 5 };
		char[] crr = { 'A', 'B', 'C', 'D', 'E' };
		Test t = new Test();
		t.search(arr, val);
		t.search(crr, ch);
	}
}