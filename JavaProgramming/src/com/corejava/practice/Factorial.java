package com.prog.practice;

class Factorial {
int fact,num;
void getFact() {
num = 5;
fact = 1;
for(int i=1; i<=num; i++) {
fact = fact *i;
}
System.out.println("FACTORIAL IS :" + fact);
}

public static void main(String s[]) {
Factorial fa = new Factorial();
fa.getFact();
}
}