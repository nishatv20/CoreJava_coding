package com.corejava.multithreading;

public class MyThread extends Thread {
	public void run() {
		System.out.println("This line is executed by :" + Thread.currentThread().getName());
	}
}
