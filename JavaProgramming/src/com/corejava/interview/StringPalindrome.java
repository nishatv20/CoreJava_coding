package com.corejava.interview;

public class StringPalindrome {
	void panidromeString(String str) {
		int size = str.length();
		String st = "";
		for (int i = size-1; i >= 0; i--) {
			st = st + str.charAt(i);
		}
		System.out.println("STRING IN REVERSE :");
		for (int i = 0; i < size; i++) {
			System.out.print(st.charAt(i));
		}
		System.out.println();
		if(st.equals(str)) {
			System.out.println("STRING IS PALINDROME");
		}
		else {
			System.out.println("STRING IS NOT PAKINDROME");
		}
	}

	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		String str = "NITIN";
		sp.panidromeString(str);
	}
}
