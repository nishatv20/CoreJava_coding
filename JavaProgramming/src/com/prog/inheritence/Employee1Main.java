package com.prog.inheritence;

public class Employee1Main {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("C110", "HSBC", "COMMER ZONE", "hsbc@gmail", 224578, 012, "PRODUCTION", 478596,
				"prod@yahoo", 11, 147, "NISHAT", 80000, 2);
		Employee1 e2 = new Employee1("C111", "MSCI", "KHARADI", "msci@gmail", 225487, 047, "DEPLOYMENT", 874178,
				"deploy@yahoo", 12, 187, "PANKAJ", 50000, 1);

		if (e1.no_of_leaves <= 2) {
			e1.empInfo();
			e1.salSlip();
			e1.getDeptData();
			e1.viewCompanyInfo();
		} else {
			System.out.println("LEAVES LIMIT EXCEEDED, PLEASE CONTACT ADMIN ");
		}
		if (e2.no_of_leaves <= 2) {
			e2.empInfo();
			e2.salSlip();
			e2.getDeptData();
			e2.viewCompanyInfo();
		} else {
			System.out.println("LEAVES LIMIT EXCEEDED, PLEASE CONTACT ADMIN ");
		}
	}
}
