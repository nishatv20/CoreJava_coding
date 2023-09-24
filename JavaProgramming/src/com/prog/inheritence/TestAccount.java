package com.prog.inheritence;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int wnum;
		int dnum;
		Account[] ac = new Account[5];
		for (int i = 0; i < ac.length; i++) {
			ac[i] = new Account();
			ac[i].getCustomerInfo();
			ac[i].getAccInfo();
		}
		for (int i = 0; i < ac.length; i++) {
			ac[i].viewCustomerInfo();
			ac[i].viewAccInfo();
		}

		System.out.println("--ENTER 1 FOR WITHDRWAL 2 FOR DEPOSIT--");
		num = sc.nextInt();
		if (num == 1) {
			System.out.println("------ENTER ACC NO TO WITHDRAW------");
			wnum = sc.nextInt();
			for (int i = 0; i < ac.length; i++) {
				if (ac[i].account_no == wnum) {
					ac[i].withdraw();
					ac[i].viewBalance();
				}
			}
		} else if (num == 2) {
			System.out.println("------ENTER ACC NO TO DEPOSIT-------");
			dnum = sc.nextInt();
			for (int i = 0; i < ac.length; i++) {
				if (ac[i].account_no == dnum) {
					ac[i].deposit();
					ac[i].viewBalance();
				}
			}
		} else {
			System.out.println("----NOT A VALID INPUT----");
		}

	}
}
