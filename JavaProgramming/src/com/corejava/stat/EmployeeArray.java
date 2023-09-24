package com.corejava.stat;
import java.util.Scanner;
class Employee {
int eno;
String ename;
int salary;
int hra;
int da;
int other_expenses;
int no_of_leaves;
String username;
String password;

static int empno = 0;

Employee() {
eno = ++empno;
}

public void addEmp() {
Scanner sc = new Scanner(System.in);
System.out.println("------ENTER EMPLOYEE DETAILS------");
System.out.println("Enter Employee Name :");
ename = sc.nextLine();
System.out.println("Enter Employee User Name :");
username = sc.nextLine();
System.out.println("Enter Employee password :");
password = sc.nextLine();
System.out.println("Enter Employee Salary :");
salary = sc.nextInt();
System.out.println("Enter Employee HRA :");
hra = sc.nextInt();
System.out.println("Enter Employee DA :");
da = sc.nextInt();
System.out.println("Enter Other Expenses :");
other_expenses = sc.nextInt();
System.out.println("Enter No of Leaves :");
no_of_leaves = sc.nextInt();

}

public void calSalary() {
if(no_of_leaves == 2) {
salary = salary + hra + da + other_expenses ;
System.out.println("TOTAL SALARY :" + salary);
}
}

public void salSlip() {

System.out.println("-------------SALARY SLIP--------------");
System.out.println("EMPLOYEE NAME :" + ename);
System.out.println("EMPLOYEE SALARY :" + salary);
System.out.println("EMPLOYEE HRA :" + hra);
System.out.println("EMPLOYEE DA :" + da);
System.out.println("EMPLOYEE OTHER EXPENSES :" + other_expenses);
}

public void empDetail() {
System.out.println("--------------EMPLOYEE DETAILS-----------");
System.out.println("EMPLOYEE NAME :" + ename);
System.out.println("EMPLOYEE NUMBER :" + eno);
System.out.println("EMPLOYEE NO OF LEAVES :"+ no_of_leaves);
System.out.println("EMPLOYEE USER NAME :" + username);
}
}

class EmployeeArray {
public static void main(String[] args) {
int no_of_emp;
Scanner sc = new Scanner(System.in);
System.out.println("ENTER NO OF EMPLOYEES :");
no_of_emp = sc.nextInt();

Employee[] ee = new Employee[no_of_emp];

for(int i=0; i<ee.length; i++) {
ee[i] = new Employee();
ee[i].addEmp();
}
for(int j =0; j<ee.length; j++) {
ee[j].empDetail();
ee[j].calSalary();
ee[j].salSlip();
}
}
}