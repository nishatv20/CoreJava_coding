import java.util.Scanner;
class Test {
int acc_no;
String c_name;
int bal;
int amt;
void getAccData() {
System.out.println("Enter Account Number");
Scanner sc = new Scanner(System.in);
acc_no = sc.nextInt();
System.out.println("Enter Customer Name");
c_name = sc.nextLine();
sc.nextLine();
System.out.println("Enter Account Balance");
bal = sc.nextInt();
}

void withdraw() {
System.out.println("Enter Amount to Withdraw");
Scanner sc = new Scanner(System.in);
amt = sc.nextInt();
bal = bal - amt;
}

void deposit() {
System.out.println("Enter Amount to Deposit");
Scanner sc = new Scanner(System.in);
amt = sc.nextInt();
bal = bal + amt;
}

void getBalanceInfo() {
System.out.println("Account Balance is :" + bal);
}

}

class BankAccount {
public static void main(String s[]) {
Test t = new Test();
t.getAccData();
t.withdraw();
t.deposit();
t.getBalanceInfo();
}
}