package com.corejava.inheritence;

public class Employee1 extends Department {
	int eno;
	String ename;
	int esal;
	int no_of_leaves;

	public Employee1(String comp_id, String comp_nm, String comp_addr, String comp_email, int comp_ph, int dno,
			String dname, int dph, String demail, int no_of_emp, int eno, String ename, int esal, int no_of_leaves) {
		super(comp_id, comp_nm, comp_addr, comp_email, comp_ph, dno, dname, dph, demail, no_of_emp);
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.no_of_leaves = no_of_leaves;
	}

	public void calSalary() {
		System.out.println("--SALARY OF EMP---" + esal);
	}

	public void salSlip() {
		System.out.println("-------SALARY SLIP-------");
		System.out.println("EMPLOYEE NAME :" + ename);
		System.out.println("COMPANY NAME :" + comp_nm);
		System.out.println("COMPANY ID :" + comp_id);
		System.out.println("DEPARTMENT NAME :" + dname);
		System.out.println("DEPARTMENT NUMBER :" + dno);
		System.out.println("EMPLOYEE SALARY :" + esal);
		System.out.println("-------***********-------");
	}

	public void empInfo() {
		System.out.println("---EMPLOYEE INFORMATION---");
		System.out.println("EMPLOYEE NAME :" + ename);
		System.out.println("EMPLOYEE NO :" + eno);
		System.out.println("EMPLOYEE LEAVES :" + no_of_leaves);
	}
}
