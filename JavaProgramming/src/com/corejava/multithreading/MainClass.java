package com.corejava.multithreading;

public class MainClass {
	public static void main(String[] args) {
		Message msg = new Message("Example of Thread");
		Reciever r = new Reciever(msg);
		r.start();
		Sender s = new Sender(msg);
		s.start();
	}
}
