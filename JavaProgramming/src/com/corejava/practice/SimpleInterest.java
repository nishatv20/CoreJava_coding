package com.corejava.practice;
class SimpleInterest {
int pri,rate,time;
float si;
void si() {
pri = 1000;
rate = 5;
time = 2;
 si = (pri*rate*time)/100;
System.out.println(si);
}

public static void main(String s[]) {
SimpleInterest ss = new SimpleInterest();
ss.si();
}
}