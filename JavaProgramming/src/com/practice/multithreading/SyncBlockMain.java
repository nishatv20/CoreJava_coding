package com.practice.multithreading;

public class SyncBlockMain {
	public static void main(String[] args) {
		SyncBlock sd1 = new SyncBlock();
		sd1.setName("One");
		SyncBlock sd2 = new SyncBlock();
		sd2.setName("Two");
		SyncBlock sd3 = new SyncBlock();
		sd3.setName("Three");
		sd1.start();
		sd2.start();
		sd3.start();
	}
}
