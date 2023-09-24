package com.corejava.inheritence;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;

	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}

	public void add() {
		System.out.println("Addition is :" + (num1 + num2));
	}

	public void subtract() {
		System.out.println("Subtraction is:" + (num1 - num2));
	}

	public void div() {
		System.out.println("Division first/second is :" + (num1 / num2));
	}

	public void multiply() {
		System.out.println("Multiplication is :" + (num1 * num2));
	}
}
