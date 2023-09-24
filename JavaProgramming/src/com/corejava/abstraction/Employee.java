package com.corejava.abstraction;

public abstract class Employee {
int empno;
String ename;
int sal;
int hra;
int da;
int allowed_leaves;
int leaves_taken;
int other_allowances;

public abstract void calculate_sal();
public abstract void printSalary();
}
