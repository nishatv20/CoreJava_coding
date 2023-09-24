package com.corejava.inheritence;

public class Employee {
	int eno;
	String ename;
	int ph;
	String email;
	String addr;

	public Employee(int en, String enm, int p, String eml, String ad) {
		eno = en;
		ename = enm;
		ph = p;
		email = eml;
		addr = ad;
	}

	public void viewEmp() {
		System.out.println("-----EMPLOYEE INFORMATION-----");
		System.out.println("EMP NUMBER :" + eno);
		System.out.println("EMP NAME :" + ename);
		System.out.println("EMP PHONE :" + ph);
		System.out.println("EMP EMAIL :" + email);
		System.out.println("EMP ADDRESS :" + addr);
	}
}
