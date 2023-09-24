package com.corejava.inheritence;

public class PayrollEmp extends Employee {
	int sal;
	int hra;
	int da;
	int ta;
	int others;
	int no_leave;
	int available_leaves;

	public PayrollEmp(int en, String enm, int p, String eml, String ad, int sal, int hra, int da, int ta, int others,
			int no_leave) {
		super(en, enm, p, eml, ad);
		// TODO Auto-generated constructor stub
		this.sal = sal;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.no_leave = no_leave;
	}

	public void calSalary() {
		if (no_leave <= 3) {
			sal = hra + da + ta + others;
			System.out.println("SALARY OF EMPLOYEE IS :" + sal);
		} else {
			System.out.println("NOT ELIGIBLE FOR SALARY");
		}
	}

	public void salSlip() {
		System.out.println("-----SALARY SLIP-----");
		System.out.println("EMP HRA :" + hra);
		System.out.println("EMP DA :" + da);
		System.out.println("EMP TA :" + ta);
		System.out.println("TOTAL SALARY :" + sal);

	}

	public void noOfLeave() {
		System.out.println("NO OF LEAVES :" + no_leave);
	}
}
