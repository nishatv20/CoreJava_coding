package com.corejava.practice;
class Test {
int a,b,c;
void add() {
a= 10;
b= 20;
c = a+ b;
System.out.println("Addition is " + c);
}
public static void main(String s[]) {
Test t = new Test();
t.add();
}
}