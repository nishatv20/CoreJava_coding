package com.corejava.abstraction;

public class Circle extends Shape {
	private double r;
	final double pi;

	public Circle(double r) {
		pi = 3.14;
		this.r = r;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		ar = pi * r * r;
		System.out.println("AREA OF CIRCLE IS :" + ar);
	}
}
