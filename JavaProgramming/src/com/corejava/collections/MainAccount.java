package com.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAccount {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Account> ac = new ArrayList<Account>();

//	ac.add(new Account(101,"Nishat",10000,32541,"BD124","CURRENT"));
//	ac.add(new Account(102,"Anvi",2540,55871,"AX457","SAVINGS"));
//	ac.add(new Account(103,"Rajesh",6540,55687,"DS7841","SALARY"));
//	ac.add(new Account(104,"Shaurya",8950,55741,"HG574","SAVINGS"));
//	ac.add(new Account(105,"Pixy",5587,65221,"OI598","CURRENT"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ListIterator<Account> lr = ac.listIterator();
		int choice;
		do {
			System.out.println("-----------------------------------");
			System.out.println("****MENU****");
			System.out.println("1. OPEN ACCOUNT");
			System.out.println("2. WITHDRAW");
			System.out.println("3. DEPOSIT");
			System.out.println("4. GET BALANCE");
			System.out.println("5. CLOSE ACCOUNT");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.println("---ACCOUNT OPENING FORM---");
				System.out.println("ENTER ACCOUNT NUMBER :");
				int accno = Integer.parseInt(br.readLine());
				System.out.println("ENTER NAME OF PERSON :");
				String custnm = br.readLine();
				System.out.println("ENTER STARTING BALANCE :");
				int balance = Integer.parseInt(br.readLine());
				System.out.println("ENTER AADHAR NUMBER :");
				int aadhar = Integer.parseInt(br.readLine());
				System.out.println("ENTER PAN NUMBER :");
				String pan = br.readLine();
				System.out.println("ENTER ACCOUNT TYPE :");
				String type = br.readLine();
				ac.add(new Account(accno, custnm, balance, aadhar, pan, type));
				System.out.println("---ACCOUNT CREATED SUCESSFULLY---");
				break;

			case 2:
				System.out.println("---WITHDRAW OPERATION---");
				System.out.println("ENTER ACCOUNT NUMBER YOU WANT TO WITHDRAW :");
				int acn = Integer.parseInt(br.readLine());
				for (int i = 0; i < ac.size(); i++) {
					if (ac.get(i).getAccNo() == acn) {
						System.out.println("ENTER AMOUNT :");
						int amt = Integer.parseInt(br.readLine());
						int paisa = ac.get(i).getBalance();
						paisa = paisa - amt;
					}
				}
				break;

			case 3:
				System.out.println("---DEPOSIT OPERATION---");
				System.out.println("ENTER ACCOUNT NUMBER YOU WANT TO DEPOSIT :");
				int acn1 = Integer.parseInt(br.readLine());
				for (int i = 0; i < ac.size(); i++) {
					if (ac.get(i).getAccNo() == acn1) {
						System.out.println("ENTER AMOUNT :");
						int amt1 = Integer.parseInt(br.readLine());
						int paisa = ac.get(i).getBalance();
						paisa = paisa + amt1;
					}
				}
				break;

			case 4:
				System.out.println("---GET BALANCE---");
				System.out.println("ENTER ACCOUNT NUMBER TO GET BALANCE :");
				int acn3 = Integer.parseInt(br.readLine());
				for (int i = 0; i < ac.size(); i++) {
					if (ac.get(i).getAccNo() == acn3) {
						System.out.println(ac.get(i).getBalance());  
					}
				}
				break;

			case 5:
				System.out.println("EXITING THE PROGRAM");
				break;

			default:
				System.out.println("INVALID CHOICE.....");
			}
		}

		while (choice != 5);
	}
}
