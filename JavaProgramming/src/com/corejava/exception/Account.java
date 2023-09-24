package com.corejava.exception;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Account {
	int accno;
	String name;
	int acc_bal;

	public void getData() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ACCNO :");
		try {
			accno = Integer.parseInt(br.readLine());
			System.out.println("ENTER ACC OPEN AMOUNT :");
			acc_bal = Integer.parseInt(br.readLine());
			if (acc_bal < 1000)
				throw new LowBalException("AC OPEN BAL SHOULD BE GREATER THAN 1K");
			System.out.println("ENTER NAME OF CUST :");
			name = br.readLine();
		} catch (IOException n) {
			System.out.println(n.getMessage());
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (LowBalException lo) {
			System.out.println(lo.getMessage());
		}

	}

	public void deposit() {
		int amt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--ENTER AMOUNT TO DEPOSIT--");
		try {
			amt = Integer.parseInt(br.readLine());
		} catch (IOException n) {
			System.out.println(n.getMessage());
		}
		acc_bal = amt + acc_bal;
		System.out.println("--AMOUNT DEPOSITED SUCESSFULLY--");
		System.out.println("AMOUNT AFTER DEPOSITING :" + acc_bal);
	}

	public void withdraw() {
		int amt;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--ENTER AMOUNT TO WITHDRAW--");
		try {
			amt = Integer.parseInt(br.readLine());
		} catch (IOException n) {
			System.out.println(n.getMessage());
		}
	}

	public void getBalance() {

		try {
			if (acc_bal < 5000)
				throw new LowBalException("MINIMUM BAL LIMIT BREACHED");
		} catch (LowBalException lw) {
			System.out.println(lw.getMessage());
		}
		System.out.println("BALANCE OF CUST :" + acc_bal);
	}
}
