package com.practice.collections;
import java.util.HashSet;
public class HashSetEmployee {
private int eno;
private String ename;
private int sal;
private String dname;
private String email;
private String city;

public HashSetEmployee(int eno, String ename, int sal, String dname, String email, String city) {
this.eno = eno;
this.ename = ename;
this.sal = sal;
this.dname = dname;
this.email = email;
this.city = city;
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

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "HashSetEmployee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", dname=" + dname + ", email=" + email
			+ ", city=" + city + "]";
}
}
