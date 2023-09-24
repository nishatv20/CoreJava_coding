package com.practice.abstraction;

import java.util.Scanner;

public class SalaryAccount extends Account {
	int salano = 0;

	public SalaryAccount(String customer_id, int customer_no, double balance, int pin, double interest_rate) {
		salano = ++accno;
		this.customer_id = customer_id;
		this.customer_no = customer_no;
		this.balance = balance;
		this.pin = pin;
		this.interest_rate = interest_rate;
	}

	public double withdraw() {
		double amt;
		System.out.println("--ENTER AMOUNT TO WITHDRAW--");
		Scanner sc = new Scanner(System.in);
		amt = sc.nextInt();
		if (amt <= 10000 && balance >= 2000) {
			balance = balance - amt;
			return balance;
		} else {
			return 0;
		}
	}

	public void deposit() {
		double amt;
		System.out.println("--ENTER AMOUNT TO DEPOSIT--");
		Scanner sc = new Scanner(System.in);
		amt = sc.nextInt();
		balance = balance + amt;
		System.out.println("--AMOUNT DEPOSITED SUCESSFULLY--");
		System.out.println("ACCOUNT BALANCE :" + balance);
	}

	public double getBalance() {
		return balance;
	}
}
