package com.practice.multithreading;

public class Reciever extends Thread {
	Message m;

	public Reciever(Message m) {
		super();
		this.m = m;
	}

	public void run() {
		synchronized (m) {
			System.out.println(Thread.currentThread().getName() + "Waiting for Message");
			try {
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Reading Message.......");
			System.out.println("Message is " + m.getmsg());
		}
	}
}
