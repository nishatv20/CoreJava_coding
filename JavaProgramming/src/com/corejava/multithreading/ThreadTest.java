package com.corejava.multithreading;

public class ThreadTest extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i--------" + i);
		}
	}
}
