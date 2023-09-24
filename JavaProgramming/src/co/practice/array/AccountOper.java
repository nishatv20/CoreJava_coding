import java.util.Scanner;

class Account {
int account_no;
String cust_name;
int bal;
int cust_phone;
int amt;

public void getDetails() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Account Number :");
account_no = sc.nextInt();
System.out.println("Enter Customer Name :");
cust_name = sc.nextLine();
sc.nextLine();
System.out.println("Enter Customer Phone No :");
cust_phone = sc.nextInt();
System.out.println("Enter Account Balance :");
bal =  sc.nextInt();
}

public void withdraw() {
System.out.println("Enter Amount to Withdraw");
Scanner sc = new Scanner(System.in);
amt = sc.nextInt();
bal = bal - amt;
}

public void deposit() {
System.out.println("Enter Amount to Deposit");
Scanner sc = new Scanner(System.in);
amt = sc.nextInt();
bal = bal + amt;
}

public void getBalanceInfo() {
System.out.println("Account Balance is :" + bal);
}
}

class AccountOper {
public static void main (String [] args) {
Account[] ac = new Account[5];
for(int i=0; i<ac.length; i++) {
ac[i] = new Account();
ac[i].getDetails();
}
for(int i=0; i<ac.length; i++) {
System.out.println("Enter Amount to Withdraw By " + ac[i].cust_name);
ac[i].withdraw();
System.out.println("Enter Amount to Deposit By " + ac[i].cust_name);
ac[i].deposit();
System.out.println("Show Account Balance of " + ac[i].cust_name);
ac[i].getBalanceInfo();
}
}
}