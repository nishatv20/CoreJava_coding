package com.corejava.string;

import java.util.Scanner;

public class MainOperations {
	public static void main(String[] args) {
		StringOperations s = new StringOperations();
		Scanner sc = new Scanner(System.in);
		StringBuilder str1 = new StringBuilder("HELLO NISHAT");
		s.getSub(str1);
		StringBuilder str2 = new StringBuilder("ver@gmail.com");
		s.checkEmail(str2);
		s.checkAtRate(str2);
		StringBuilder str4 = new StringBuilder("nv@yahoo.co.in");
		s.check1Email(str4);
	}
}
