package com.prog.testapplication;

import com.prog.operations.Calculator;

public class ScientificCalculator extends Calculator {
	public void power(int x, int y) {
		int val = 1;
		for (int i = 1; i <= y; i++) {
			val = val * x;
		}
		System.out.println("POWER of" + x + "to" + y + "is" + ":" + val);
	}

	public void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("FACTORIAL OF A NUMBER IS :" + fact);
	}

	public void findSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("SUM OF ELEMENTS IS :" + sum);
	}

	public void findMinandMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("MAXIMUM VALUE IS :" + max);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}

	}
}
