package com.prog.operations;

public class Mathematics {

	public void checkPrime(int num) {
		int prime = 0;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				prime = prime + 1;
				break;
			}
		}
		if (prime == 1) {
			System.out.println("--NUMBER IS PRIME--");
		} else {
			System.out.println("--NUMBER IS NOT PRIME--");
		}
	}

	public void chkPalindrome(int num) {
		int org = num;
		int rev = 0;
		int rem;
		for (int i = num; num != 0; num = num / 10) {
			rem = num % 10;
			rev = rev * 10 + rem;
		}
		if (org == rev) {
			System.out.println("Number is PALINDROME");
		} else {
			System.out.println("Number is not PALINDROME");
		}
	}

	public void chkArmstrong(int num) {
		int len = 0;
		int rem;
		int sum = 0;
		int mul = 1;
		for (int i = num; num != 0; num = num / 10) {
			len = len + 1;
		}

		for (int i = num; num != 0; num = num / 10) {
			rem = num % 10;
			for (int j = 1; j <= len; j++) {
				mul = rem * mul;
			}
			sum = sum + mul;
		}
		if (num == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}
}
