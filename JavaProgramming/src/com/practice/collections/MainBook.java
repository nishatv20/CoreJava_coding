package com.practice.collections;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ListIterator;
public class MainBook {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Book> bb = new ArrayList<Book>();
		Author a1 = new Author("A1", "Nishat", 83509, "Viman nagar");
		Author a2 = new Author("A2", "Rajinder", 85906, "Panvel");
		Author a3 = new Author("A3", "Vivek", 98025, "Nashik");
		Author a4 = new Author("A4", "Rajat", 68541, "Surat");
		bb.add(new Book(101, "PHYSICS", 450, 2, a1));
		bb.add(new Book(101, "PHYSICS", 450, 2, a2));
		bb.add(new Book(102, "CHEMISTRY", 540, 1, a3));
		bb.add(new Book(102, "CHEMISTRY", 540, 1, a4));

		System.out.println("List of books are "+bb);
		System.out.println("--BUY BOOK--");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER BOOK ID :");
		int id = Integer.parseInt(br.readLine());
		for (int i = 0; i < bb.size(); i++) {
			if (bb.get(i).bookno == id) {
				Book b=bb.get(i);
				int qty = bb.get(i).quantity;
				qty = qty - 1;
				b.quantity=qty;
				System.out.println("BOOK " + bb.get(i).booknm + " BOUGHT SUCCESSFULLY");
				break;
			}
		}

		System.out.println("--CHECK AVAILIBILTY--");
		System.out.println("ENTER AUTHOR NAME :");
		String an = br.readLine();
		for (int i = 0; i < bb.size(); i++) {
			if (bb.get(i).a.name.equals(an)) {
				System.out.println("BOOK OF AUTHOR " + bb.get(i).a.name + " IS AVAILABLE");
			}
		}

		System.out.println("---SEARCH BOOK---");
		System.out.println("ENTER BOOK NAME :");
		String bnm = br.readLine();
		for(int i=0; i<bb.size(); i++) {
			if(bb.get(i).booknm.equals(bnm)) {
				System.out.println("BOOK " + bb.get(i).booknm + " IS AVAILABLE");
				break;
			}
		}
		System.out.println("---DELETE OPERATION---");
		System.out.println("ENTER BOOK ID :");
		int bid = Integer.parseInt(br.readLine());
	/*	for(int i=0; i<bb.size(); i++) {
			System.out.println(bb.get(i)+" "+bb.get(i).bookno);
			if(bb.get(i).bookno == bid) {
			System.out.println(bb.get(i));	
			bb.remove(i);	
			System.out.println("BOOK " + bb.get(i).booknm + " REMOVED SUCCESSFULLY");
			}
			
		}*/

		ListIterator<Book> li = bb.listIterator();
		
		while(li.hasNext()) {
			if(li.next().bookno==bid)
				li.remove();
		}
		System.out.println(bb);
		
	}
}
