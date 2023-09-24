package com.corejava.abstraction;

public abstract class Account {
	static int accno;
	String customer_id;
	int customer_no;
	double balance;
	int pin;
	double interest_rate;

	public abstract double withdraw();

	public abstract void deposit();

	public abstract double getBalance();
}