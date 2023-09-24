package com.corejava.scanner;
import java.util.Scanner;
class Student {
int roll;
String name;
String grade;
float per;

void getData() {
System.out.println("Enter Roll No :");
Scanner sc = new Scanner(System.in);
roll = sc.nextInt();
System.out.println("Enter Name :");
name = sc.nextLine();
sc.nextLine();
System.out.println("Enter Grade :");
grade = sc.nextLine();
System.out.println("Enter Percentage :");
per = sc.nextFloat();
}

}


class StudentPer {
public static void main(String s[]) {
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

s1.getData();
s2.getData();
s3.getData();

if(s1.per > s2.per && s1.per > s3.per) {
System.out.println("Student Roll with Highest Percentage " + s1.roll);
}

else if(s2.per > s1.per && s2.per > s3.per) {
System.out.println("Student Roll with Highest Percentage " + s2.roll);
}

else {
System.out.println("Student Roll with Highest Percentage " + s3.roll);
}
}

}