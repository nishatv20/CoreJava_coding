package com.corejava.hasIs;

import java.util.Scanner;

public class MainBook {
	public static void main(String[] args) {
		Author[] at = new Author[5];
		Book[] bk = new Book[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < bk.length; i++) {
			System.out.println("--ENTER AUTHOR DETAILS--");
			System.out.println("ENTER AUTHOR NAME :");
			String name = sc.nextLine();
			System.out.println("ENTER AUTHOR EMAIL :");
			String email = sc.nextLine();
			System.out.println("ENTER AUTHOR ADDRESS :");
			String addr = sc.nextLine();
			at[i] = new Author(name, email, addr);
			System.out.println("--ENTER BOOK DETAILS--");
			System.out.println("ENTER BOOK NAME :");
			String bname = sc.nextLine();
			System.out.println("ENTER BOOK TYPE :");
			String type = sc.nextLine();
			System.out.println("ENTER BOOK NO :");
			int bookno = sc.nextInt();
			System.out.println("ENTER BOOK PRICE :");
			int price = sc.nextInt();
			System.out.println("ENTER BOOK AVAILABLE QTY :");
			int available_qty = sc.nextInt();
			bk[i] = new Book(bookno, bname, type, price, available_qty, at[i]);
		}
//		Author a1 = new Author("NISHAT", "verma@gmail", "B-5 VIMAN NAGAR");
//		Author a2 = new Author("PANKAJ", "pankaj@gmail", "B-6 YERWADA");
//		Author a3 = new Author("VISHAL", "vishal@gmail", "V-7 DHANORI");
//		Book b1 = new Book(110, "CHEMISTRY", "SCIENCE", 1540, 5, a1);
//		Book b2 = new Book(111, "PHYSICS", "SCIENCE", 1650, 5, a1);
//		Book b3 = new Book(112, "MATHS", "SCIENCE", 780, 6, a1);
//		Book b4 = new Book(113, "ACCOUNTS", "COMMERCE", 650, 4, a2);
//		Book b5 = new Book(114, "POLITY", "ARTS", 870, 5, a3);
//		Book b6 = new Book(115, "HISTORY", "ARTS", 985, 4, a3);

		System.out.println("--ENTER BOOK NO YOU WANT TO BUY--");
		int bno;
		bno = sc.nextInt();
		for (int i = 0; i < bk.length; i++) {

			if (bno == bk[i].getbookno()) {
				System.out.println("--BOOK BOUGHT SUCESSFULLY--");
				bk[i].setavailable_qty();
			} else {
				System.out.println("INVALID INPUT | NOT AVAILABLE");
			}
		}

		System.out.println("--ENTER BOOK YOU'RE SEARCHING--");
		int bsno;
		bsno = sc.nextInt();
		for (int i = 0; i < bk.length; i++) {
			if (bsno == bk[i].getbookno()) {
				System.out.println("--BOOK FOUND--");
				bk[i].getBookData();
			}
		}
		System.out.println("--ENTER NAME OF AUTHOR--");
		String aname;
		aname = sc.nextLine();
		for (int i = 0; i < bk.length; i++) {
			if (aname.equals(bk[i].getauthorname())) {
				bk[i].getBookData();
			}
		}
		System.out.println("--ENTER TYPE OF BOOK--");
		String btype;
		btype = sc.nextLine();
		for (int i = 0; i < bk.length; i++) {
			if (btype.equals(bk[i].gettype())) {
				bk[i].getBookData();
			}
		}
	}

}
