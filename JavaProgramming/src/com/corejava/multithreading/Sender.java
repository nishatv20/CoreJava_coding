package com.corejava.multithreading;

public class Sender extends Thread {
	Message m;

	public Sender(Message m) {
		super();
		this.m = m;
	}

	public void run() {
		synchronized (m) {
			System.out.println(this.getName() + "Sending Message");
			m.setMsg("Example Of Thread Communication");
		}
	}
}
