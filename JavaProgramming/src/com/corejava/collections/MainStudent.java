package com.corejava.collections;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainStudent {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(101, "Nishat", 80, "verma@gmail", 85741));
		st.add(new Student(102, "Shalini", 90, "shalini@gmail", 98456));
		st.add(new Student(103, "Rajesh", 88, "rajesh@gmail", 98724));
		st.add(new Student(104, "Vishal", 84, "vishal@gmail", 985263));
		st.add(new Student(105, "Virat", 79, "virat@gmail", 987421));

		System.out.println("---SEARCHING STUDENTS---");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ROLL NUMBER :");
		int roll = Integer.parseInt(br.readLine());
//		for (Student s : st) {
//			if (s.rollno == roll) {
//				System.out.println("STUDENT IS PRESENT AT :" + st.indexOf(s.rollno));
//			} else {
//				System.out.println("Student Not Present");
//			}
//		}
//		System.out.println("ENTER STUDENT NAME");
//		String nm = br.readLine();
//		for (Student s : st) {
//			if ((s.name).equals(nm)) {
//				System.out.println("STUDENT PRESENT AT :" + st.indexOf(s.rollno));
//			}
//		}

		for(int i=0; i<st.size(); i++) {

			if(st.get(i).rollno == roll) {
				System.out.println("FOUND");
				break;
			}
			else {
				System.out.println("NOT FOUND");
			}
		}
	}

}
