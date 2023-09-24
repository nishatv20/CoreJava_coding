package com.practice.collections;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HashSetResMain {
public static void main(String[] args) {
	HashSet<HashSetStudent> hss = new HashSet<HashSetStudent>();
	HashSet<HashSetResult> hsr = new HashSet<HashSetResult>();
	HashSetResMain hsm = new HashSetResMain();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int choice;
	do {
		System.out.println("1. GET STUDENT INFO");
		System.out.println("2. DISPALY RESULT");
		System.out.println("3. DISPLAY TOPPER STUDENT");
		System.out.println("4. EXIT PROGRAM");
		
		choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1:
			System.out.println("***---GETTINF INFORMATION---***");
			S
		}
	}
	while(choice!=4)
}
void getData(HashSet<HashSetStudent>hss, HashSet<HashSetResult> hsr)throws IOException,NumberFormatException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ENTER STUDENT DATA-->");
	System.out.println("ENTER STUDENT ROLLNO :");
	int rollno =Integer.parseInt(br.readLine());
	System.out.println("ENTER STUDENT NAME :");
	String name = br.readLine();
	System.out.println("ENTER STUDENT CONTACT :");
	int contact = Integer.parseInt(br.readLine());
	System.out.println("ENTER STUDNET EMAIL :");
	String email = br.readLine();
	hss.add(new HashSetStudent(rollno, name, contact, email));
	System.out.println("*********************");
	System.out.println();
	System.out.println("ENTER RESULT DETAILS-->");
	System.out.println("ENTER SEMESTER :");
	String sem = br.readLine();
	System.out.println("ENTER MARKS OF SUBJECTS :");
	int marks = Integer.parseInt(br.readLine());
	int percentage = marks / 5;
	String grade;
	if(percentage>80 && percentage<=100) {
		grade ="A";
	}
	else if(percentage>60 && percentage<=80) {
		grade = "B";
	}
	else if(percentage>40 && percentage<=60) {
		grade = "C";
	}
	else {
		grade = "F";
	}
	hsr.add(new HashSetResult(sem, marks, percentage,grade, hss));
	
}
}
