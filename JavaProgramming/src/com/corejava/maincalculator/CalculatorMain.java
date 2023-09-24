package com.prog.maincalculator;

import com.prog.operations.*;
import com.prog.testapplication.*;
import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		sc.add(10, 20);
		sc.sub(20, 10);
		sc.mul(4, 10);
		sc.power(2, 4);
		sc.factorial(5);
		int arr[] = new int[5];
		int arr1[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER ELEMETS TO FIND SUM: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		sc.findSum(arr);
		System.out.println("ENTER ELEMETS TO FIND MAX,MIN: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}
		sc.findMinandMax(arr1);
		System.out.println("---------------------------");

		Mathematics m = new Mathematics();
		m.checkPrime(5);
		m.chkArmstrong(153);
		m.chkPalindrome(123);
	}
}
