package com.practice.multithreading;

public class ThreadSleep extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i-----" + i + this.getName());
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
