package com.corejava.inheritence;

public class DerivedClass extends BaseClass {
	public DerivedClass() {
		System.out.println("In Derived Class");
	}

	public void add() {
		System.out.println("Addition is :" + (x + y));
	}

	public void subtract() {
		System.out.println("Subtraction is :" + (x - y));
	}
}
