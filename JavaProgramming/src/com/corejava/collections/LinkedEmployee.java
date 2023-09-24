package com.practice.collections;

import java.util.LinkedList;

public class LinkedEmployee {
	private int eno;
	private String ename;
	private int sal;
	private String eemail;
	private LinkedList<LinkedDepartment> ld;

	public LinkedEmployee(int eno, String ename, int sal, String eemail, LinkedList<LinkedDepartment> ld) {
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.eemail = eemail;
		this.ld = ld;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public LinkedList<LinkedDepartment> getLd() {
		return ld;
	}

	public void setLd(LinkedList<LinkedDepartment> ld) {
		this.ld = ld;
	}

	@Override
	public String toString() {
		return "LinkedEmployee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", eemail=" + eemail + ", ld=" + ld
				+ "]";
	}

}
