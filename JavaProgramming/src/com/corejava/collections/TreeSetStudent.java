package com.corejava.collections;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
public class TreeSetStudent {
int rollno;
String name;
String email;
int marks[] = new int[5];
int per;
String grade;

public TreeSetStudent(int rollno, String name, String email, int[] marks, int per, String grade) {
	this.rollno = rollno;
	this.name = name;
	this.email = email;
	this.marks = marks;
	this.per = per;
	this.grade = grade;
}

@Override
public int hashCode() {
	return Objects.hash(rollno);
}

@Override
public boolean equals(Object obj) {
	TreeSetStudent other = TreeSetStudent(obj);
	return  rollno == other.rollno;
}

@Override
public String toString() {
	return "TreeSetStudent [rollno=" + rollno + ", name=" + name + ", email=" + email + ", marks="
			+ Arrays.toString(marks) + ", per=" + per + ", grade=" + grade + "]";
}


}
