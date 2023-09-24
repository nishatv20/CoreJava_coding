package com.corejava.multithreading;

public class AsciiThread extends Thread {
	public void run() {
		String str = "abcdefg";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("CHARACTER :" + ch);
		}
	}
}
