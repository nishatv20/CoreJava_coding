package com.corejava.multithreading;

public class Child extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " + i + "Child Process");
		}
	}
}
