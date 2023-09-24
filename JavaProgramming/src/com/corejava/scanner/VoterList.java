import java.util.Scanner;
class Student {
int roll;
int age;

void getData() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Roll No :");
roll = sc.nextInt();
System.out.println("Enter Age :");
age = sc.nextInt();
}
}


class VoterList {

public static void main(String s[]) {
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

s1.getData();
s2.getData();
s3.getData();
System.out.println("Enter Roll-No :");

int votli;
Scanner sc = new Scanner(System.in);
votli = sc.nextInt();
if(votli == s1.roll) {
System.out.println("Student "+votli+" is present in Voter List ");
}

else if(votli == s2.roll) {
System.out.println("Student "+votli+" is present in Voter List ");
}

else if(votli == s3.roll) {
System.out.println("Student "+votli+" is present in Voter List ");
}
}

}