package com.practice.collections;

import java.util.Objects;

public class HashMapEmployee {
	int empno;
	String ename;
	int esal;

	public HashMapEmployee(int empno, String ename, int esal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "HashMapEmployee [empno=" + empno + ", ename=" + ename + ", esal=" + esal + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empno);
	}

	@Override
	public boolean equals(Object obj) {
		HashMapEmployee other = (HashMapEmployee) obj;
		return empno == other.empno;
	}
}
