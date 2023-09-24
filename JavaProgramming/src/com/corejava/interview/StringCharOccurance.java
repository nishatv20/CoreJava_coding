package com.corejava.interview;

public class StringCharOccurance {
	void getOccurance(String str, char ch) {
		int size = str.length();
		for (int i = 0; i < size; i++) {
			char c = str.charAt(i);
			if (c == ch) {
				System.out.println("CHARACTER FOUND AT INDEX :" + i);
			} 
		}
		
	}

	public static void main(String[] args) {
		StringCharOccurance sco = new StringCharOccurance();
		String str = "NISHAT";
		char ch = 'A';
		sco.getOccurance(str, ch);
	}
}
