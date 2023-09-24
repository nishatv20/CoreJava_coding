package com.practice.supar;

import java.util.Scanner;

public class Department {
	int d_code;
	String d_name;
	int d_phone;
	String d_email;

	public Department(int d_code, String d_name, int d_phone, String d_email) {
		this.d_code = d_code;
		this.d_name = d_name;
		this.d_phone = d_phone;
		this.d_email = d_email;
	}

	public void disDept() {
		System.out.println("---DEPARTMENT DETAILS---");
		System.out.println("DEPT CODE :" + d_code);
		System.out.println("DEPT NAME :" + d_name);
		System.out.println("DEPT PHONE :" + d_phone);
		System.out.println("DEPT EMAIL :" + d_email);
	}
}
