package com.corejava.inheritence;

import java.util.Scanner;

public class Account extends Bank {
	int account_no;
	int balance;

	public void getAccInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NO :");
		account_no = sc.nextInt();
		System.out.println("ENTER BALANCE :");
		balance = sc.nextInt();
	}

	public void viewAccInfo() {
		System.out.println("ACCOUNT NO :" + account_no);
		System.out.println("BALANCE :" + balance);
	}

	public void withdraw() {
		int amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("---WITHDRAWL OPERATION---");
		System.out.println("ENTER AMOUNT :");
		amt = sc.nextInt();
		balance = balance - amt;
	}

	public void deposit() {
		int amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("---DEPOSIT OPERATION---");
		System.out.println("ENTER AMOUNT");
		amt = sc.nextInt();
		balance = balance + amt;
	}

	public void viewBalance() {
		System.out.println("ACCOUNT BALANCE :");
		System.out.println(balance);
	}
}
