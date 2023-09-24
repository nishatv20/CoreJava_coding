package com.corejava.inheritence;

public class Company {
	String comp_id;
	String comp_nm;
	String comp_addr;
	String comp_email;
	int comp_ph;

	public Company(String comp_id, String comp_nm, String comp_addr, String comp_email, int comp_ph) {
		this.comp_id = comp_id;
		this.comp_nm = comp_nm;
		this.comp_addr = comp_addr;
		this.comp_email = comp_email;
		this.comp_ph = comp_ph;
	}

	public void viewCompanyInfo() {
		System.out.println("---COMPANY INFORMATION---");
		System.out.println("COMPANY ID: " + comp_id);
		System.out.println("COMPANY NAME: " + comp_nm);
		System.out.println("COMPANY ADDRESS: " + comp_addr);
		System.out.println("COMPANY EMAIL: " + comp_email);
		System.out.println("COMPANY PHONE: " + comp_ph);
	}
}
