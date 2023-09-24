package com.practice.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReverse {
	void getReverse(String str) {
		int size = str.length();
		System.out.println("STRING IN REVERSE :");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		StringReverse sr = new StringReverse();
		System.out.println("---ENTER A STRING---");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		sr.getReverse(str);
	}
}
