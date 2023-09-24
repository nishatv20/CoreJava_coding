package com.corejava.oops;

import java.util.Scanner;

class OverloadExample {

	public void add(int a, int b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(double a, double b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(String a, String b) {
		System.out.println("Addition is :" + (a + b));
	}
}

class OverloadTest {
	public static void main(String[] args) {
		OverloadExample obj = new OverloadExample();
		obj.add(12.4f, 67.8f);
		obj.add(12, 78);
		obj.add("Hello", "All");
	}
}