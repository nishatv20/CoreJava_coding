package com.corejava.collections;

public class LinkedDepartment {
	private int dno;
	private String dname;
	private int contact;
	private String email;

	public LinkedDepartment(int dno, String dname, int contact, String email) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.contact = contact;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "LinkedDepartment [dno=" + dno + ", dname=" + dname + ", contact=" + contact + ", email=" + email + "]";
	}
}
