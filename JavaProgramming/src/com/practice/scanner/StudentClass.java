import java.util.Scanner;
class Test {
int roll;
String name;
int mark1;
int mark2;
int mark3;
int mark4;
int mark5;
float per;
char grade;

void getStudentData() {
System.out.println("Enter Student Roll no :");
Scanner sc = new Scanner(System.in);
roll = sc.nextInt();
System.out.println("Enter Marks of Five Subjects :");
mark1 = sc.nextInt();
mark2 = sc.nextInt();
mark3 = sc.nextInt();
mark4 = sc.nextInt();
mark5 = sc.nextInt();
System.out.println("Enter Name of Student");
name = sc.nextLine();
}


void calculateGrade() {
per = ((mark1 + mark2 + mark3 + mark4 + mark5)/5);

if(per > 90) {
grade = 'A';
System.out.println("Student Got A Grade");
}

else if(per > 80 && per <= 90) {
grade = 'B';
System.out.println("Student got B Grade");
}

else if(per > 60 && per <= 80) {
grade = 'C';
System.out.println("Student got C Grade");
}

else if(per >40 && per <= 60) {
grade = 'F'; 
System.out.println("Student got C Grade");
}

else {
System.out.println("Student failed to Pass");
}
}

void printMarkSheet() {
System.out.println("Student Marksheet");
System.out.println("Name : " + name);
System.out.println("Roll No : " + roll);
System.out.println("Subject 1 : " + mark1);
System.out.println("Subject 2 : " + mark2);
System.out.println("Subject 3 : " + mark3);
System.out.println("Subject 4 : " + mark4);
System.out.println("Subject 5 : " + mark5);
System.out.println("Percentage : " + per);
System.out.println("Grade : " + grade);
}
}

class StudentClass {
public static void main(String s[]) {
Test t = new Test();
t.getStudentData();
t.calculateGrade();
t.printMarkSheet();
}
}