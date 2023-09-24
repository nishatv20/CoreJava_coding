package com.practice.abstraction;

import java.util.Scanner;

public class MessageMain {
	public static void main(String[] args) {
		TextMessage p1 = new TextMessage("Nishat", 83509);
		TextMessage p2 = new TextMessage("Pankaj", 98741);
		TextMessage p3 = new TextMessage("Vishal", 87951);
		TextMessage p4 = new TextMessage("Arun", 74691);
		TextMessage p5 = new TextMessage("Kartik", 66974);

		p1.send();
		p1.read();
		p2.send();
		p2.read();

	}
}
