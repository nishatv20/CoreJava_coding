package com.prog.inheritence;

import java.util.Scanner;

public class ScientificCalc extends Calculator {
	public void power() {
		int result = 1;
		System.out.println("Power of num1 to num2 :");
		for (int i = 1; i <= num2; i++) {
			result = result * num1;
		}
		System.out.println(result);
	}

	public void fact() {
		int fact = 1;
		System.out.println("Factorial of First Number :");
		for (int i = num1; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
