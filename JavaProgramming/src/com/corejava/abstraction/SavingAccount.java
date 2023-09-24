package com.corejava.abstraction;

import java.util.Scanner;

public class SavingAccount extends Account {
	int savano = 0;

	public SavingAccount(String customer_id, int customer_no, double balance, int pin, double interest_rate) {
		savano = ++accno;
		this.customer_id = customer_id;
		this.customer_no = customer_no;
		this.balance = balance;
		this.pin = pin;
		this.interest_rate = interest_rate;

	}

	@Override
	public double withdraw() {
		// TODO Auto-generated method stub
		double amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("--ENTER AMOUNT TO WITHDRAW--");
		amt = sc.nextInt();
		if (amt <= 25000) {
			balance = balance - amt;
			return balance;
		} else {
			return 0;
		}
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		double amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("--ENTER AMOUNT TO DEPOSIT--");
		amt = sc.nextInt();
		balance = balance - amt;
		System.out.println("--AMOUNT DEPOSITED SUCESSFULLY--");
		System.out.println("ACCOUNT BALANCE :" + balance);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub

		return balance;
	}
}
