package com.corejava.inheritence;

import java.util.Scanner;

public class BaseClass {
	int x, y;

	public BaseClass() {
		System.out.println("In Base Class");
	}

	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		x = sc.nextInt();
		y = sc.nextInt();
	}
}
