package com.corejava.inheritence;

import java.util.Scanner;

public class Bank {
	int customer_id;
	String customer_name;
	int aadharNo;
	String ifsc;
	String pan;

	public void getCustomerInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID :");
		customer_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter PAN No :");
		pan = sc.nextLine();
		System.out.println("Enter Customer Name :");
		customer_name = sc.nextLine();
		System.out.println("Enter IFSC Code :");
		ifsc = sc.nextLine();
		System.out.println("Enter AADHAR No :");
		aadharNo = sc.nextInt();

	}

	public void viewCustomerInfo() {
		System.out.println("-----CUSTOMER DETAILS-----");
		System.out.println("CUSTOMER ID :" + customer_id);
		System.out.println("CUSTOMER NAME :" + customer_name);
		System.out.println("AADHAR NO :" + aadharNo);
		System.out.println("IFSC CODE :" + ifsc);
		System.out.println("PAN NUMBER :" + pan);
	}
}
