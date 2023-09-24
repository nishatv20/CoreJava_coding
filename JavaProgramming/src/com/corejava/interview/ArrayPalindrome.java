package com.corejava.interview;

public class ArrayPalindrome {
	public void getPalindrome(int[] arr) {
		int size = arr.length;
		int j = size - 1;
		int res = 0;
		for (int i = 0; i < size / 2; i++) {
			if (arr[j] == arr[i]) {
				res = 1;
			} else {
				System.out.println("NUMBER IS NOT PALINDROME");
				break;
			}
			j--;
		}
		if (res == 1) {
			System.out.println("NUMBER IS PALINDROME");
		}
	}

	public static void main(String[] args) {
		ArrayPalindrome ap = new ArrayPalindrome();
		int[] arr = { 1,2,1 };
		ap.getPalindrome(arr);
	}
}
