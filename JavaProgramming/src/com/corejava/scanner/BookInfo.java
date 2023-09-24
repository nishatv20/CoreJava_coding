import java.util.Scanner;
class Test {
int bno;
String bname;
String aname;
int pri;

void acceptBookInfo() {
System.out.println("Enter Book Number");
Scanner sc = new Scanner(System.in);
bno = sc.nextInt();
System.out.println("Enter Book name");
bname = sc.nextLine();
sc.nextLine();
System.out.println("Enter Author name");
aname = sc.nextLine();
System.out.println("Enter Book Price");
pri = sc.nextInt();
}

void showbookInfo() {
System.out.println("Book Number" + bno);
System.out.println("Book Name" + bname);
System.out.println("Author Name" + aname);
System.out.println("Book Price" + pri);
}
}

class BookInfo {
public static void main(String s[]) {
Test t = new Test();
t.acceptBookInfo();
t.showbookInfo();
}
}