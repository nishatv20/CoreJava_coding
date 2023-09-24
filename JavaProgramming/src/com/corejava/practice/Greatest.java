package com.corejava.practice;

class Greatest {
int num1, num2, num3;

void getGreat() {
num1 = 10;
num2 = 20;
num3 = 30;
if(num1 > num2 && num1 > num3) {
System.out.println("Number 1 is Greater" + num1);
}

else if(num2 > num3 && num2 > num1) {
System.out.println("Number 2 is Greater" + num2);
}

else {
System.out.println("Number 3 is Greater : " + num3);
}

}

void getNegative() {
if(num1<0) {
System.out.println("Num 1 is Negative" + num1);
}
else if(num2<0) {
System.out.println("Num 2 is Negative" + num2);
}
else if(num3<0) {
System.out.println("Num 3 is Negative" + num3);
}
else {
System.out.println("No Number is negative");
}
}

public static void main(String [] args) {
 Greatest g = new Greatest();
 g.getGreat();
 g.getNegative();
}
}