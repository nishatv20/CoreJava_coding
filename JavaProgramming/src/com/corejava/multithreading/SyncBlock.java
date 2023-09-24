package com.corejava.multithreading;

public class SyncBlock extends Thread {
	static int x;
	static {
		x = 10;
	}

	public void run() {
		test();
	}

	public void test() {
		for (int i = 0; i < 5; i++)
			System.out.println("i = " + i + " " + this.getName());

		synchronized (this) {
			for (int k = 1; k <= 5; k++) {
				x = x + k;
				System.out.println("x = " + x + " " + this.getName());
			}
		}

		for (int j = 0; j < 5; j++)
			System.out.println("j = " + j + " " + this.getName());

	}
}
