package com.corejava.multithreading;

public class SynchronizeDemo {
	static int cnt;
	static {
		cnt = 5;
	}

	synchronized public void demo(String nm) {
		for (int i = 1; i <= cnt; i++) {
			cnt = cnt - 1;
			System.out.println("Count = " + cnt + " " + nm + " " + i);
		}
	}
}
