package com.corejava.inheritence;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		PayrollEmp e1 = new PayrollEmp(110, "Nishat", 835095, "verma@gmail", "shivaji nagar", 10000, 6000, 4000, 1000,
				4000, 1);
		ContractEmp e2 = new ContractEmp(111, "Vishal", 987412, "vishal@yahoo", "Fc Road", 20000, 4000, 1000, 1);
		Scanner sc = new Scanner(System.in);
		int toe;
		int val;
		System.out.println("ENTER 1 FOR PAYROLL , 2 FOR CONTRACTUAL EMP :");
		toe = sc.nextInt();
		System.out.println("ENTER 1 FOR SAL SLIP , 2 FOR LEAVES : ");
		val = sc.nextInt();

		if (toe == 1 && val == 1) {
			e1.salSlip();
		} else if (toe == 1 && val == 2) {
			e1.noOfLeave();
		} else if (toe == 2 && val == 1) {
			e2.salSlip();
		}

		else if (toe == 2 && val == 2) {
			e2.noOfLeaves();
		} else {
			System.out.println("----PLEASE ENTER VALID INPUT----");
		}
	}
}
