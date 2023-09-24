import java.util.Scanner;
class Test {
int a,b;
String str;
char ch;

void getData() {
System.out.println("Enter Two Values");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
}

void add() {
System.out.println("Addition is : " + (a+b));
}

void getCharData() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Character ");
ch = sc.nextLine().charAt(0);
System.out.println("Entered charachter is : " + ch);
System.out.println("Enter a Word : ");
str = sc.next();
System.out.println("Entered Word is : " + str);
}
}

class MainClass {
public static void main(String s[]) {
Test t = new Test();
t.getData();
t.add();
t.getCharData();
}
}