package com.prog.oops;

import java.util.Scanner;

class Student {
	int rollno;
	String name;
	int per;
	char grade;
	int phone;

	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll No :");
		rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		name = sc.nextLine();
		System.out.println("Enter Student Percentage :");
		per = sc.nextInt();
		System.out.println("Enter Student Grade :");
		grade = sc.next().charAt(0);
		System.out.println("Enter Student Phone :");
		phone = sc.nextInt();
	}

	public void printData() {
		System.out.println("STUDENT NAME :" + name);
		System.out.println("STUDENT ROLL NO :" + rollno);
		System.out.println("STUDENT PERCENTAGE :" + per);
		System.out.println("STUDENT GRADE :" + grade);
		System.out.println("STUDENT PHONE :" + phone);
	}

	public boolean search(Student[] st) {
		int roll;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ROLL NUMBER YOU WANT TO SEARCH :");
		roll = sc.nextInt();
		for (int i = 0; i < st.length; i++) {
			if (st[i].rollno == roll) {
				return true;
			}

		}
		return false;
	}

}

class StudentOperation {
	public static void main(String[] args) {
		boolean val;
		Student ss = new Student();
		Student[] st = new Student[3];
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			st[i].getData();
		}
		for (int i = 0; i < st.length; i++) {
			st[i].printData();
		}
		val = ss.search(st);
		if (val == true) {
			System.out.println("Student is there in the DataBase");
		} else {
			System.out.println("Student is there Not in the DataBase");
		}
	}
}
