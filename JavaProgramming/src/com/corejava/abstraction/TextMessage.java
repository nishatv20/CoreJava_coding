package com.practice.abstraction;

import java.util.Scanner;

public class TextMessage extends Message {
	public TextMessage(String name, int contact) {
		this.name = name;
		this.contact = contact;

	}

	int input;

	public void read() {
		System.out.println("--MESSAGE--" + ":" + msg);
	}

	public void send() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--ENTER PHONE NUMBER--");
		input = sc.nextInt();

		if (input == contact) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("ENTER MESSAGE :");
			msg = s1.nextLine();

		} else {
			System.out.println("--ENTER VALID PHONE NUMBER--");
		}
	}
}
