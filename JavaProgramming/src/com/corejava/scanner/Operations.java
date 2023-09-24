import java.util.Scanner;
class Test {
int rad;
int bas;
int hei;
int side;
int srad;
double pie,are,vol;

void circleArea() {
pie = 3.14;
System.out.println("Enter Radius of Circle");
Scanner sc = new Scanner(System.in);
rad = sc.nextInt();
are = pie * rad * rad;
System.out.println("AREA OF CIRCLE : " + are);
}

void triaArea() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Base of Triangle");
bas = sc.nextInt();
System.out.println("Enter Height of Triangle");
hei = sc.nextInt();
are = (bas * hei)/2;
System.out.println("AREA OF TRIANGLE : " + are);
}

void squArea() {
System.out.println("Enter Side of Square");
Scanner sc = new Scanner(System.in);
side = sc.nextInt();
are = side * side;
System.out.println("AREA OF SQUARE : " + are);
}

void sphVolume() {
System.out.println("Enter Radius of Sphere");
Scanner sc = new Scanner(System.in);
srad = sc.nextInt();
vol = (4/3)*(pie*srad*srad*srad);
System.out.println("VOLUME OF SPHERE IS : " + vol);
}
}


class Operations {
public static void main(String s[]){
Test t = new Test();
int option;
Scanner sc = new Scanner(System.in);

do {
System.out.println("MENU----SELECT ONE OPTION----MENU");
System.out.println("ENTER 1 FOR AREA OF CIRCLE");
System.out.println("ENTER 2 FOR AREA OF TRIANGLE");
System.out.println("ENTER 3 FOR AREA OF SQUARE");
System.out.println("ENTER 4 FOR VOLUME OF SPHERE");
System.out.println("ENTER 5 TO EXIT THE PROGRAM");
option = sc.nextInt();

switch(option) {
case 1:
t.circleArea();
break;

case 2:
t.triaArea();
break;

case 3:
t.squArea();
break;

case 4:
t.sphVolume();
break;

case 5:
System.out.println("Exiting the program.........");
break;

default:
System.out.println("Invalid Choice, Please try Again.........");
break;
}
}

while(option !=5);
}
}