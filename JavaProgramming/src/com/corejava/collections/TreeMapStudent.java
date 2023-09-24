package com.corejava.collections;

import java.util.Objects;

public class TreeMapStudent {
	public TreeMapStudent(int rollno, String name, String clg_name, String email) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.clg_name = clg_name;
		this.email = email;
	}

	int rollno;
	String name;
	String clg_name;
	String email;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TreeMapStudent [rollno=" + rollno + ", name=" + name + ", clg_name=" + clg_name + ", email=" + email
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		 
		TreeMapStudent other = (TreeMapStudent) obj;
		return rollno == other.rollno;
	}

}
