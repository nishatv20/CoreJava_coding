package com.corejava.collections;

import java.util.Objects;

public class HashMapDept {
	int dno;
	String dname;

	public HashMapDept(int dno, String dname) {
		this.dno = dno;
		this.dname = dname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dno);
	}

	@Override
	public boolean equals(Object obj) {
		HashMapDept other = (HashMapDept) obj;
		return dno == other.dno;
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

	@Override
	public String toString() {
		return "HashMapDept [dno=" + dno + ", dname=" + dname + "]";
	}
}
