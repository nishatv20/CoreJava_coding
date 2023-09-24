package com.corejava.abstraction;

import java.util.Scanner;

public class MainAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int no_of_sal = 2;
		int no_of_sav = 2;
		SalaryAccount[] s = new SalaryAccount[no_of_sal];
		System.out.println("--ENTER SALARY ACCOUNT DETAILS--");
		for (int i = 0; i < no_of_sal; i++) {
			System.out.println("--ENTER CUSTOMER ID--");
			String customer_id = sc.nextLine();
			sc.nextLine();
			System.out.println("--ENTER CUSTOMER NO--");
			int customer_no = sc.nextInt();
			System.out.println("--ENTER ACCOUNT BALANCE--");
			double balance = sc.nextDouble();
			System.out.println("--ENTER PIN--");
			int pin = sc.nextInt();
			System.out.println("--ENTER INTEREST RATE--");
			double interest_rate = sc.nextDouble();
			s[i] = new SalaryAccount(customer_id, customer_no, balance, pin, interest_rate);
		}
		SavingAccount[] sv = new SavingAccount[no_of_sav];
		System.out.println("--ENTER SAVINGS ACCOUNT DETAILS--");
		for (int i = 0; i < no_of_sav; i++) {
			System.out.println("--ENTER CUSTOMER ID--");
			String customer_id = sc.nextLine();
			sc.nextLine();
			System.out.println("--ENTER CUSTOMER NO--");
			int customer_no = sc.nextInt();
			System.out.println("--ENTER ACCOUNT BALANCE--");
			double balance = sc.nextDouble();
			System.out.println("--ENTER PIN--");
			int pin = sc.nextInt();
			System.out.println("--ENTER INTEREST RATE--");
			double interest_rate = sc.nextDouble();
			sv[i] = new SavingAccount(customer_id, customer_no, balance, pin, interest_rate);
		}

		do {
			System.out.println("-------------------------");
			System.out.println("--SELECT BELOW OPTIONS--");
			System.out.println("1. WITHDRAW");
			System.out.println("2. DEPOSIT");
			System.out.println("3. CHECK BALANCE");
			System.out.println("4. EXIT MENU");
			System.out.println("-------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int toa;
				int account_no;
				int pass;
				double bal_sav;
				double bal_sal;
				System.out.println("ENTER TYPE OF ACCOUNT : 1(SALARY) 2(SAVINGS)");
				toa = sc.nextInt();
				int logcount = 0;
				if (toa == 1 && logcount <= 3) {
					System.out.println("***---LOG IN---***");
					System.out.println("--ENTER ACCOUNT NUMBER--");
					account_no = sc.nextInt();
					System.out.println("--ENTER ACCOUNT PIN--");
					pass = sc.nextInt();
					for (int i = 0; i < s.length; i++) {
						if (account_no == s[i].salano) {
							bal_sal = s[i].withdraw();
							if (bal_sal == 0) {
								System.out.println(
										"--MINIMMUM BALANCE LIMIT BREACHED / MAXIMMUM WITHDRAWL LIMIT BREACHED--");
							} else {
								System.out.println("AMOUNT AFTER WITHDRAWL IS : " + bal_sal);
							}

						}
						else {
							logcount++;
						}

					}
				} else if (toa == 2 && logcount <= 3) {
					System.out.println("***---LOG IN---***");
					System.out.println("--ENTER ACCOUNT NUMBER--");
					account_no = sc.nextInt();
					System.out.println("--ENTER ACCOUNT PIN--");
					pass = sc.nextInt();
					logcount++;
					for (int i = 0; i < sv.length; i++) {
						if (account_no == sv[i].savano) {
							bal_sav = sv[i].withdraw();
							if (bal_sav == 0) {
								System.out.println("--MAXIMMUM WITHDRAWL LIMIT BREACHED--");
							} else {
								System.out.println("AMOUNT AFTER WITHDRAWL IS : " + bal_sav);
							}

						}
					}
				} else {
					System.out.println("PLEASE ENTER VALID INPUT");
				}
				break;
			case 2:
				int toa2;
				int account_no2;
				int pass2;
				System.out.println("ENTER TYPE OF ACCOUNT : 1(SALARY) 2(SAVINGS)");
				toa2 = sc.nextInt();
				int logcount2 = 0;
				if (toa2 == 1 && logcount2 <= 3) {
					System.out.println("***---LOG IN---***");
					System.out.println("--ENTER ACCOUNT NUMBER--");
					account_no2 = sc.nextInt();
					System.out.println("--ENTER ACCOUNT PIN--");
					pass2 = sc.nextInt();
					logcount2++;
					for (int i = 0; i < s.length; i++) {
						if (account_no2 == s[i].salano) {
							s[i].deposit();
						}
					}
				} else if (toa2 == 2 && logcount2 <= 3) {
					System.out.println("***---LOG IN---***");
					System.out.println("--ENTER ACCOUNT NUMBER--");
					account_no2 = sc.nextInt();
					System.out.println("--ENTER ACCOUNT PIN--");
					pass2 = sc.nextInt();
					logcount2++;
					for (int i = 0; i < sv.length; i++) {
						if (account_no2 == sv[i].savano) {
							s[i].deposit();
						}
					}
				} else {
					System.out.println("PLEASE ENTER VALID INPUT");
				}
				break;
			case 3:
				int toa3;
				int account_no3;
				int pass3;
				double sal_bal3;
				double sav_bal3;
				System.out.println("ENTER TYPE OF ACCOUNT : 1(SALARY) 2(SAVINGS)");
				toa3 = sc.nextInt();
				if (toa3 == 1) {
					System.out.println("***---LOG IN---***");
					System.out.println("--ENTER ACCOUNT NUMBER--");
					account_no3 = sc.nextInt();
					System.out.println("--ENTER ACCOUNT PIN--");
					pass3 = sc.nextInt();
					for (int i = 0; i < s.length; i++) {
						if (account_no3 == s[i].salano && pass3 == s[i].pin) {
							sal_bal3 = s[i].getBalance();
							System.out.println("--ACCOUNT BALANCE IS--" + sal_bal3);
						}
					}
				} else if (toa3 == 2) {
					System.out.println("***---LOG IN---***");
					System.out.println("--ENTER ACCOUNT NUMBER--");
					account_no3 = sc.nextInt();
					System.out.println("--ENTER ACCOUNT PIN--");
					pass3 = sc.nextInt();
					for (int i = 0; i < sv.length; i++) {
						if (account_no3 == sv[i].savano && pass3 == sv[i].pin) {
							sav_bal3 = sv[i].getBalance();
							System.out.println("--ACCOUNT BALANCE IS--" + sav_bal3);
						}
					}
				}
				break;
			case 4:
				System.out.println("**--EXITING THE PROGRAM--**");
				break;
			default:
				System.out.println("--PLEASE ENTER VALID INPUT--");
			}
		} while (choice != 4);
		sc.close();
	}
}