package com.corejava.array;
import java.util.Scanner;
class Student {
int rollno;
String nm;

public void getStudeData() {
Scanner sc= new Scanner(System.in);
System.out.println("Enter roll no");
rollno = sc.nextInt();
sc.nextLine();
nm = sc.nextLine(); 
}

public void showStudentInfo() {
System.out.println("Student roll no = "+rollno+" Name = "+nm+" ");
}
}

class ArrayObj {
public static void main(String s[]) {
Student[] st = new Student[3];
for(int i=0; i<st.length; i++) {
st[i] = new Student();
st[i].getStudentData();
}
System.out.println("List of Students");
for(int i =0; i<st.length; i++){
st[i].showStudentInfo();
}
}
}