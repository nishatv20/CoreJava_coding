package com.practice.interview;

public class StringLength {
void getStringlength(String s) {
	int size = s.length();
	int length = 0;
	for(int i=0; i<size; i++) {
		length++;
	}
	System.out.println("LENGTH OF STRING :");
	System.out.println(length);
}
public static void main(String[] args) {
	StringLength al = new StringLength();
	String s= "Nishat"; 
	al.getStringlength(s);
}
}
