package com.practice.abstraction;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		int no_of_pemp;
		int no_of_cemp;
		System.out.println("--ENTER NO OF PERMANENT EMP--");
		no_of_pemp = sc.nextInt();
		PermanentEmp[] p = new PermanentEmp[no_of_pemp];

		for (int i = 0; i < no_of_pemp; i++) {

			System.out.println("Enter EMP NAME :");
			String ename = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter EMP NO :");
			int empno = sc.nextInt();
			System.out.println("Enter EMP SALARY :");
			int sal = sc.nextInt();
			System.out.println("ENTER EMP HRA");
			int hra = sc.nextInt();
			System.out.println("Enter EMP DA :");
			int da = sc.nextInt();
			System.out.println("Enter EMP ALLOWED LEAVES :");
			int allowed_leaves = sc.nextInt();
			System.out.println("Enter EMP LEAVES TAKEN :");
			int leaves_taken = sc.nextInt();
			System.out.println("Enter EMP OTHER ALLOWANCES :");
			int other_allowances = sc.nextInt();
			p[i] = new PermanentEmp(empno, ename, sal, hra, da, allowed_leaves, leaves_taken, other_allowances);
		}
		System.out.println("--ENTER NO OF CONTRACT EMP--");
		no_of_cemp = sc.nextInt();
		ContractEmp[] c = new ContractEmp[no_of_cemp];

		for (int j = 0; j < no_of_cemp; j++) {
			System.out.println("Enter EMP NAME :");
			String ename = sc.nextLine();
			System.out.println("Enter EMP NO :");
			int empno = sc.nextInt();
			System.out.println("Enter EMP SALARY :");
			int sal = sc.nextInt();
			System.out.println("Enter EMP HRA :");
			int hra = sc.nextInt();
			System.out.println("Enter EMP DA :");
			int da = sc.nextInt();
			System.out.println("Enter EMP ALLOWED LEAVES :");
			int allowed_leaves = sc.nextInt();
			System.out.println("Enter LEAVES TAKEN :");
			int leaves_taken = sc.nextInt();
			System.out.println("Enter OTHER ALLOWANCES :");
			int other_allowances = sc.nextInt();
			c[j] = new ContractEmp(empno, ename, sal, hra, da, allowed_leaves, leaves_taken, other_allowances);
		}

		do {
			System.out.println("----SELECT BELOW OPTIONS----");
			System.out.println("1. VIEW PERMANENT EMP DATA");
			System.out.println("2. PRINT PERMANENT EMP SALARY SLIP");
			System.out.println("3. VIEW CONTRACT EMP DATA");
			System.out.println("4. PRINT CONTRACT EMP SALARY SLIP");
			System.out.println("5. EXIT THE PROGRAM");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int pinput1;
				System.out.println("ENTER EMP NUMBER OF PERMANENT EMP :");
				pinput1 = sc.nextInt();
				for (int i = 0; i < p.length; i++) {
					if (pinput1 == p[i].empno) {
						p[i].toString();
					}
				}
				break;
			case 2:
				int pinput2;
				System.out.println("ENTER EMP NUMBER OF PERMANENT EMP :");
				pinput2 = sc.nextInt();
				for (int i = 0; i < p.length; i++) {
					if (pinput2 == p[i].empno) {
						p[i].printSalary();
					}
				}
				break;
			case 3:
				int cinput1;
				System.out.println("ENTER EMP NUMBER OF CONTRACT EMP :");
				cinput1 = sc.nextInt();
				for (int i = 0; i < c.length; i++) {
					if (cinput1 == c[i].empno) {
						c[i].toString();
					}
				}
				break;
			case 4:
				int cinput2;
				System.out.println("ENTER EMP NUMBER OF CONTRACT EMP :");
				cinput2 = sc.nextInt();
				for (int i = 0; i < c.length; i++) {
					if (cinput2 == p[i].empno) {
						c[i].printSalary();
					}
				}
				break;
			case 5:
				System.out.println("--EXITING THE PROGRAM--");
				break;
			default:
				System.out.println("--PLEASE ENTER VALID INPUT--");
			}
		} while (choice != 5);
		sc.close();

	}
}
