package com.practice.collections;

public class Account {
	private int accno;
	private String custnm;
	private int balance;
	private int aadhar;
	private String pan;
	private String type;

	public Account(int accno, String custnm, int balance, int aadhar, String pan, String type) {
		this.accno = accno;
		this.custnm = custnm;
		this.balance = balance;
		this.aadhar = aadhar;
		this.pan = pan;
		this.type = type;
	}

	public int getAccNo() {
		return accno;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit() {
		
	}
}
