import java.util.Scanner;
import java.lang.Math;
class Test {
int num;

void checkPrime() {
int prime = 0;
System.out.println("Enter a Number");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();

for(int i=0 ;i <= num/2; i++) {
if(num%2 == 0) {
prime = prime + 1;
break;
}
}

if(prime ==0) {
System.out.println("Number is Prime " + num);
}

else {
System.out.println("Number is Not Prime " + num);
}
}

void reverseNumber() {
int rev = 0;
int rem;
System.out.println("Enter a Number");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();

for(int i = num; num!=0; num = num/10){
rem = num%10;
rev = rev * 10 + rem;
}
System.out.println("Number in Reverse is : " + rev);
}


void checkPerfect() {
int fact;
int sum = 0;
System.out.println("Enter a Number");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();

for(int i=1; i<num; i++ ) {
if(num%i == 0) {
sum = sum + i;
}
}

if(sum==num) {
System.out.println("Number is Perfect Number " + num);
}

else {
System.out.println("Number is Not Perfect " + num);
}
}


void checkPalindrome() {
int rem;
int rev = 0;
System.out.println("Enter a Number");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
int org = num;
for(int i=num; num!=0; num=num/10) {
rem = num%10;
rev = rev*10 + rem;
System.out.println(rev);
}

if(org == rev) {
System.out.println("Number is Palindrome " + num);
}

else {
System.out.println("Number is Not Palindrome " + num);
}
}


void checkArmstrong() {
int count = 0;
int rem;
int sum = 0;
int pro = 1;
System.out.println("Enter a Number");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();

for(int i=num; num!=0; num=num/10) {
count = count + 1;
}

for(int j=num; num!=0; num=num/10) {
rem = num%10;
for(int z = 1; z<=count; z++) {
pro = pro*rem;
}
sum = sum + pro;
}


if(sum == num) {
System.out.println("Number is Armstrong " + num);
}

else {
System.out.println("Number is Not Armstrong " + num);
}
}

}



class MathOper {
public static void main(String s[]) {
Test t = new Test();
int option;
Scanner sc= new Scanner(System.in);

do {
System.out.println("MENU  --SELECT ONE OPTION--  MENU");
System.out.println("1. Check Number is PRIME");
System.out.println("2. Get Reverse of Number");
System.out.println("3. Check Number is PERFECT");
System.out.println("4. Check Number is Palindrome");
System.out.println("5. Check Number is Armstrong");
System.out.println("6. Exit Program");

option = sc.nextInt();

switch(option) {
case 1:
t.checkPrime();
break;

case 2:
t.reverseNumber();
break;

case 3:
t.checkPerfect();
break;

case 4:
t.checkPalindrome();
break;

case 5:
t.checkArmstrong();
break;

case 6:
System.out.println("Exiting the Program");
break;

default:
System.out.println("Invalid Choice ,Please try again");
break;
}
}

while(option != 6);
}
}