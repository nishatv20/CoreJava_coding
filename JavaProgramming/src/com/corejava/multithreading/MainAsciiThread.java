package com.corejava.multithreading;

public class MainAsciiThread {
	public static void main(String[] args) {
		AsciiThread a1 = new AsciiThread();
		a1.start();
		String st = "abcdefg";
		for (int j = 0; j < st.length(); j++) {
			char c = st.charAt(j);
			System.out.println("ASCII VALUE IS :" + (int) c);
		}
	}
}
