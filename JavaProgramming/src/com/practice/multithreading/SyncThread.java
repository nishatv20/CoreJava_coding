package com.practice.multithreading;

public class SyncThread extends Thread {
	SynchronizeDemo sd;

	SyncThread(SynchronizeDemo obj) {
		sd = obj;
	}

	public void run() {
		System.out.println(this.getName());
		sd.demo(this.getName());
	}
}
