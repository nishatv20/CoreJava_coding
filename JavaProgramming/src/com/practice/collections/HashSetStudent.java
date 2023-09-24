package com.practice.collections;

public class HashSetStudent {
	private int rollno;
	private String name;
	private int contact;
	private String email;

	

	public HashSetStudent(int rollno, String name, int contact, String email) {
		this.rollno = rollno;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}

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
}
