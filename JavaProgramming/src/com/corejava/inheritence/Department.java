package com.corejava.inheritence;

public class Department extends Company {
	int dno;
	String dname;
	int dph;
	String demail;
	int no_of_emp;

	public Department(String comp_id, String comp_nm, String comp_addr, String comp_email, int comp_ph, int dno,
			String dname, int dph, String demail, int no_of_emp) {
		super(comp_id, comp_nm, comp_addr, comp_email, comp_ph);
		this.dno = dno;
		this.dname = dname;
		this.dph = dph;
		this.demail = demail;
		this.no_of_emp = no_of_emp;
	}

	public void getDeptData() {
		System.out.println("---DEPARTMENT DATA---");
		System.out.println("DEPARTMENT NO :" + dno);
		System.out.println("DEPARTMENT NAME :" + dname);
		System.out.println("DEPARTMENT PHONE :" + dph);
		System.out.println("DEPARTMENT EMAIL :" + demail);
		System.out.println("DEPARTMENT NO OF EMP :" + no_of_emp);
	}
}
