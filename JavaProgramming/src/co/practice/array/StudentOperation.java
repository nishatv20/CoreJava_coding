import java.util.Scanner;
class Student {
int rollnum;
String name;
float per;

public void getData() {
Scanner sc =new Scanner(System.in);
System.out.println("Enter Roll Number :");
rollnum = sc.nextInt();
sc.nextLine();
System.out.println("Enter Name of Student :");
name = sc.nextLine();
System.out.println("Enter Percentage of Student :");
per = sc.nextFloat();
}

public void printData() {
System.out.println("Roll Number :" + rollnum);
System.out.println("Name :" + name);
System.out.println("Percentage :" + per);
}
}

class StudentOperation {

public static void main(String [] args) {
String stud;
Student[] st = new Student[5];
for(int i=0; i<st.length; i++) {
st[i] = new Student();
st[i].getData();
}
System.out.println("List of Students :");
for(int i=0; i<st.length; i++) {
st[i].printData();
}

System.out.println("Student Who topped :");
 float max = st[0].per;
String top = st[0].name;
for(int i=1; i<st.length; i++) {
if(st[i].per > max) { max = st[i].per; top = st[i].name;}
else {
max = max;
}

}
System.out.println("Student topped in Exam :" + top);
System.out.println("students Who Failed in Exam");
for(int i=0; i<st.length; i++) {
if(st[i].per < 40) {
System.out.println(st[i].name);
}
}

System.out.println("Enter Student Name You Want to Search :");
Scanner sc = new Scanner(System.in);
stud = sc.nextLine();
for(int i =0; i<st.length; i++) {
if (st[i].name == stud) {
System.out.println("Student name :"+ st[i].name);
System.out.println("Student RollNo :" + st[i].rollnum);
System.out.println("Student Percentage :" + st[i].per);
}
}
}
}