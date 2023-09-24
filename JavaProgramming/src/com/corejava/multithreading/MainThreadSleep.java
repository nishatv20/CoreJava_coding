package com.corejava.multithreading;

public class MainThreadSleep {
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		t1.setName("One");
		t1.start();
		ThreadSleep t2 = new ThreadSleep();
		t2.start();
		for (int j = 0; j < 5; j++) {
			System.out.println("j-----" + j);
		}
	}
}
