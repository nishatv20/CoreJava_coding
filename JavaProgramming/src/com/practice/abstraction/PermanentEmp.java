package com.practice.abstraction;

public class PermanentEmp extends Employee {
	int tot;

	public PermanentEmp(int empno, String ename, int sal, int hra, int da, int allowed_leaves, int leaves_taken,
			int other_allowances) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.hra = hra;
		this.da = da;
		this.allowed_leaves = allowed_leaves;
		this.leaves_taken = leaves_taken;
		this.other_allowances = other_allowances;
	}

	public void calculate_sal() {
		System.out.println("***********************************");
		hra = (sal * hra) / 100;
		da = (sal * da) / 100;
		tot = sal + hra + da + other_allowances;

	}

	@Override
	public void printSalary() {
		// TODO Auto-generated method stub
		System.out.println("***********************************");
		System.out.println("---SALARY OF PERMANENT EMPLOYEE---");
		System.out.println(tot);
		System.out.println("***********************************");
	}

	public String toString() {
		return ename + " " + empno + " " + sal + " " + hra + " " + da + " " + allowed_leaves + " " + leaves_taken + " "
				+ other_allowances;

	}
}
