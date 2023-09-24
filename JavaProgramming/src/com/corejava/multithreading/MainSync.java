package com.practice.multithreading;

public class MainSync {
	public static void main(String[] args) {
		SynchronizeDemo s = new SynchronizeDemo();
		SyncThread t1 = new SyncThread(s);
		SyncThread t2 = new SyncThread(s);
		SyncThread t3 = new SyncThread(s);
		t1.start();
		t2.start();
		t3.start();

	}
}
