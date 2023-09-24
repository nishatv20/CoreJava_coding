package com.corejava.collections;

import java.util.TreeSet;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TreeSetStMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		TreeSetStMain tsm = new TreeSetStMain();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<TreeSetStudent> ts = new TreeSet<TreeSetStudent>(tsm.new SortPercentage());
		TreeSet<TreeSetStudent> ts1 = new TreeSet<TreeSetStudent>(tsm.new SortGrade());
		int[] marks = {65,66,69,68,67};
		ts.add(new TreeSetStudent(101,"Nishat","verma@gmail", marks,65,"A"));
		int[] marks2 = {66,70,75,78,78};
		ts.add(new TreeSetStudent(102,"Pankaj","pankj@gmail",marks2,67,"B"));
		System.out.println(ts);
//		tsm.getData(ts, ts1);
//		System.out.println(ts);
//		System.out.println(ts1);
	}

	void getData(TreeSet<TreeSetStudent> ts, TreeSet<TreeSetStudent> ts1) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER STUDENT ROLLNO :");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("ENTER STUDENT NAME :");
		String name = br.readLine();
		System.out.println("ENTER STUDENT EMAIL :");
		String email = br.readLine();
		System.out.println("ENTER MARKS OF 5 SUB :");
		int[] marks = new int[5];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("SUBJECT " + i);
			marks[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(" CALUCATING PERCENTAGE :");
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = marks[i] + sum;
		}
		System.out.println("CALCULATED");
		int percentage = sum / 5;
		System.out.println("CALCULATING GRADE :");
		String grade;
		if (percentage > 80 && percentage <= 100) {
			grade = "A";
		} else if (percentage > 60 && percentage <= 80) {
			grade = "B";
		} else if (percentage > 40 && percentage <= 60) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("CALCULATED");
		ts.add(new TreeSetStudent(rollno, name, email, marks, percentage, grade));
		ts.add(new TreeSetStudent(rollno, name, email, marks, percentage, grade));
	}

	class SortName implements Comparator<TreeSetStudent> {

		public int compare(TreeSetStudent o1, TreeSetStudent o2) {

			return o1.name.compareTo(o2.name);
		}

	}

	class SortGrade implements Comparator<TreeSetStudent> {
		public int compare(TreeSetStudent o1, TreeSetStudent o2) {
			return o2.grade.compareTo(o1.grade);
		}

	}

	class SortPercentage implements Comparator<TreeSetStudent> {

		@Override
		public int compare(TreeSetStudent o1, TreeSetStudent o2) {

			if (o1.per > o2.per) {
				return 1;
			} else if (o1.per < o2.per) {
				return -1;
			} else
				return 0;
		}

	}
}
