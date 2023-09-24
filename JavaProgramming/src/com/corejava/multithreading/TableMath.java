package com.practice.multithreading;

public class TableMath extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			int res = 3 * i;
			System.out.println(" 3 *" + i + "=" + res);
		}
	}
}
