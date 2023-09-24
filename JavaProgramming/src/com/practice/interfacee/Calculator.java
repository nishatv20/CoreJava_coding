package com.practice.interfacee;

public class Calculator implements Calc {
	int x, y;

	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void add() {
		System.out.println(x + y);
	}

	public void sub() {
		System.out.println(x - y);
	}
}
