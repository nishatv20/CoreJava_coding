package com.corejava.array;
import java.util.Scanner;
class Book {
int bookno;
String bookName;
String author_name;
String book_category;
int book_price;
int bookqty;


public void addbook() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Book Number :");
bookno = sc.nextInt();
sc.nextLine();
System.out.println("Enter Book Name :");
bookName = sc.nextLine();
sc.nextLine();
System.out.println("Enter Author Name :");
author_name = sc.nextLine();
sc.nextLine();
System.out.println("Enter Book Category :");
book_category = sc.nextLine();

System.out.println("Enter Book Price :");
book_price = sc.nextInt();
System.out.println("Enter Book Quantity :");
bookqty = sc.nextInt();
}

public void viewBookDetails() {
System.out.println("BOOK NUMBER :" + bookno);
System.out.println("BOOK NAME :" + bookName);
System.out.println("AUTHOR NAME :" + author_name);
System.out.println("BOOK CATEGORY :" + book_category);
System.out.println("BOOK PRICE :" + book_price);
System.out.println("BOOK QTY :" + bookqty);
}

public void updateQuantity() {
System.out.println("Enter Book No For Qty Update :");
Scanner sc = new Scanner(System.in);
bookno = sc.nextInt();
System.out.println("Enter Updated Value :");
bookqty = sc.nextInt();
}
}

class BookOperation{


public static void main(String [] args) {
String book;
String author;
Book[] bk = new Book[3];
for(int i=0; i<bk.length; i++) {
bk[i] = new Book();
bk[i].addbook();
}
System.out.println("-----------PRINTING BOOKS INFO-----------");
for(int i=0; i<bk.length; i++) {
bk[i].viewBookDetails();
}


System.out.println("Enter Book Name you want to Search :");
Scanner sc = new Scanner(System.in);
book = sc.nextLine();
for(int i=0; i<bk.length; i++) {
if(book.equals(bk[i].bookName)) {bk[i].viewBookDetails();}
}

System.out.println("Enter Author Name you want details :");
author = sc.nextLine();
for(int i=0; i<bk.length; i++) {
if(author.equals(bk[i].author_name)) {bk[i].viewBookDetails();}
}
}
}