package com.corejava.multithreading;

public class Practice {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		Thread.currentThread().setName("nishat");
		System.out.println(Thread.currentThread().getName());
		System.out.println("This Thread is Executed by Thread :" + Thread.currentThread().getName());
	}
}
