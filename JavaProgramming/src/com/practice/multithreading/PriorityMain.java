package com.practice.multithreading;

public class PriorityMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(7);
		ThreadPriority t = new ThreadPriority();
		System.out.println(t.getPriority());
	}
}
