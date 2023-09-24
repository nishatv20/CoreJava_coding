package com.corejava.multithreading;

public class Parent {
	public static void main(String[] args) throws InterruptedException {
		Child c = new Child();
		c.start();
		for (int j = 0; j < 5; j++)
			System.out.println("j =" + j);
		c.join();
		for (int k = 0; k <= 5; k++)
			System.out.println("k =" + k);
	}
}