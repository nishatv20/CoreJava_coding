package com.corejava.string;

import java.util.Scanner;

public class Stack {
	int arr[] = new int[5];
	int top = -1;

	public void push(int ele) {
		if (top < 4) {
			Scanner sc = new Scanner(System.in);
			top = top + 1;
			arr[top] = ele;
		} else {
			System.out.println("STACK IS FULL");
		}
	}

	public void displayStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("STACK IS EMPTY");
		} else {
			int el = arr[top];
			System.out.println("POPPED ELEMENT IS :" + el);
			top = top - 1;
		}
	}

	public void search(int ele) {
		for (int i = 0; i <= top; i++) {
			if (arr[i] == ele) {
				System.out.println("ELEMENT FOUND AT INDEX :" + i);
			}
		}
	}
}
