package com.corejava.string;

import java.util.Scanner;

public class MainStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.displayStack();
		System.out.println();
		System.out.println("*********************");
		s.pop();
		System.out.println("*********************");
		s.search(12);
	}
}
