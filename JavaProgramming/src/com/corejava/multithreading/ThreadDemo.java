package com.corejava.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		t1.start();
		ThreadTest t2 = new ThreadTest();
		t2.start();
		for (int j = 0; j < 5; j++) {
			System.out.println("j--------" + j);
		}
	}
}
