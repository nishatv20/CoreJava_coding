package com.corejava.string;

import java.util.Scanner;

public class StringOperations {
	Scanner sc = new Scanner(System.in);

	public void checkEmail(StringBuilder str) {
		System.out.println("--CHECKING .com DOMAIN--");
		int sindex = str.indexOf("com");
		int lastindex = str.lastIndexOf("m");
		System.out.println(str.substring(sindex, lastindex + 1));
		if (str.substring(sindex, lastindex + 1).equals("com")) {
			System.out.println("DOMAIN IS VALID .com");
		} else {
			System.out.println("DOMAIN IS NOT VALID");

		}

	}

	public void check1Email(StringBuilder str) {
		System.out.println("--CHECKING .co.in DOMAIN--");
		int s1index = str.indexOf("co.in");
		int last1index = str.lastIndexOf("n");
		System.out.println(str.substring(s1index, last1index + 1));
		if (str.substring(s1index, last1index + 1).equals("co.in")) {
			System.out.println("DOMAIN IS VALID co.in");
		} else {
			System.out.println("DOMAIN IS INVALID");
		}
	}

	public void checkAtRate(StringBuilder str) {

		System.out.println(str.indexOf("@"));
		int aindex = str.indexOf("@");
		int i = aindex;
		System.out.println(str.charAt(i));
		for (int j = i + 1; j < str.length(); j++) {
			if (str.charAt(j) == str.charAt(i)) {
				System.out.println("@ LIMIT BREACHED at INDEX :" + j);

			} else {
				System.out.println("@ LIMIT FOLLOWED");

			}
		}
	}

	public void getSub(StringBuilder str) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER START INDEX :");
		int sindex = sc.nextInt();
		System.out.println("ENTER LAST INDEX :");
		int lindex = sc.nextInt();
		System.out.println("--SUBSTRING IS--");
		System.out.println(str.substring(sindex, lindex));
	}
}
