package com.practice.collections;

import java.util.Vector;

public class CustomerVector {
	private int cust_id;
	private String name;
	private int ph;
	private String email;
	private Vector<OrdersVector> ov2;

	public CustomerVector(int cust_id, String name, int ph, String email, Vector<OrdersVector> ov2) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.ph = ph;
		this.email = email;
		this.ov2 = ov2;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
