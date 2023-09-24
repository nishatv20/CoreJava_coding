package com.corejava.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Register {
	public static void main(String[] args) throws IOException, InterruptedException {
		String nm;
		String city;
		int ph;
		String email;
		int res;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("---REGISTRATION FORM---");
		Validation v = new Validation();
		v.start();
		v.join();
		if (v.validate() == 0) {
			System.out.println("ENTER DETAILS :-");
			System.out.println("ENTER NAME :");
			nm = br.readLine();
			System.out.println("ENTER CITY :");
			city = br.readLine();
			System.out.println("ENTER PHONE :");
			ph = Integer.parseInt(br.readLine());
			System.out.println("ENTER EMAIL :");
			email = br.readLine();
			System.out.println("REGISTERED SUCCESSFULLY");
		} else {
			System.out.println("--REGISTRATION FAILED DUE TO INCORRECT ID--");
		}

	}

}
