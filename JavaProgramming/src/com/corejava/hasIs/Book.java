package com.hasIs.practice;

public class Book {

	private int bookno;
	private String bname;
	private String type;
	private int price;
	private int available_qty;
	private Author author;

	public Book(int bookno, String bname, String type, int price, int available_qty, Author author) {
		this.bookno = bookno;
		this.bname = bname;
		this.type = type;
		this.price = price;
		this.available_qty = available_qty;
		this.author = author;
		// TODO Auto-generated constructor stub

	}

	public int getbookno() {
		return bookno;
	}

	public int getavailable_qty() {
		return available_qty;
	}

	public int setavailable_qty() {
		return available_qty = available_qty - 1;
	}
	public void getBookData() {
		System.out.println("BOOK NUMBER : " + bookno);
		System.out.println("BOOK NAME :" + bname);
		System.out.println("BOOK TYPE :" + type);
		System.out.println("BOOK PRICE :" + price);
		System.out.println("BOOK QTY :" + available_qty);
	}
	public String getauthorname() {
		return author.name;
	}
	public String gettype() {
		return type;
	}
}
