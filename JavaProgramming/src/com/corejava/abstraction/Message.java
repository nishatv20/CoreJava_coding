package com.corejava.abstraction;

public abstract class Message {
	String name;
	int contact;
	String msg;

	public abstract void read();

	public abstract void send();
}
