package com.practice.interview;

public class NumberPalindrome {
	void getPalindrome(int num) {
		int temp = num;
		int rev = 0, rem;
		for (int i = num; num != 0; num = num / 10) {
			rem = num % 10;
			rev = (rev * 10) + rem;
		}
		if (temp == rev) {
			System.out.println("NUMBER IS PALINDROME");
		} else {
			System.out.println("NUMBER IS NOT PALINDROME");
		}
	}

	public static void main(String[] args) {
		NumberPalindrome nm = new NumberPalindrome();
		int num = 121;
		nm.getPalindrome(num);
	}
}
