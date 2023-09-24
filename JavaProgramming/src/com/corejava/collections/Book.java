package com.corejava.collections;

public class Book {
	int bookno;
	String booknm;
	int bookp;
	int quantity;
	Author a;

	public Book(int bookno, String booknm, int bookp, int quantity, Author a) {
		this.bookno = bookno;
		this.booknm = booknm;
		this.bookp = bookp;
		this.quantity = quantity;
		this.a = a;
	}

public String toString() {
		return bookno + " " + booknm + " " + bookp + " " + quantity + " " + a;
	}
}
