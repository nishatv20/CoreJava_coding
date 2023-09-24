package com.practice.abstraction;

public class ContractEmp extends Employee {
	int tot_sal;

	public ContractEmp(int empno, String ename, int sal, int hra, int da, int allowed_leaves, int leaves_taken,
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
		hra = (sal * hra) / 100;
		da = (sal * da) / 100;
		tot_sal = sal + hra + da + other_allowances;
	}

	public void printSalary() {
		System.out.println("***********************************");
		System.out.println("---SALARY OF PERMANENT EMPLOYEE---");
		System.out.println(tot_sal);
		System.out.println("***********************************");
	}

	public String toString() {
		return ename + " " + empno + " " + sal + " " + hra + " " + da + " " + allowed_leaves + " " + leaves_taken + " "
				+ other_allowances;
	}
}
