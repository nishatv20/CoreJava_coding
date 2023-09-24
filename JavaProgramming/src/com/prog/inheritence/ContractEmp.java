package com.prog.inheritence;

public class ContractEmp extends Employee {
	int sal;
	int hra;
	int others;
	int no_leave;

	public ContractEmp(int en, String enm, int p, String eml, String ad, int sal, int hra, int others, int no_leave) {
		super(en, enm, p, eml, ad);
		// TODO Auto-generated constructor stub
		this.sal = sal;
		this.hra = hra;
		this.others = others;
		this.no_leave = no_leave;
	}

	public void calSalary() {
		if (no_leave <= 1) {
			sal = hra + others;
			System.out.println("SALARY OF EMPLOYEE IS :" + sal);
		} else {
			System.out.println("NOT ELIGIBLE FOR SALARY");
		}
	}

	public void salSlip() {
		System.out.println("-----SALARY SLIP-----");
		System.out.println("EMP HRA :" + hra);
		System.out.println("TOTAL SALARY :" + sal);

	}

	public void noOfLeaves() {
		System.out.println("NO OF LEAVES :" + no_leave);
	}
}
