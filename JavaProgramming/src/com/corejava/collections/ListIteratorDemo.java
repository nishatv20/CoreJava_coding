package com.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);

		ListIterator<Integer> it = ar.listIterator();
		while (it.hasNext()) {
			if (it.next().equals(10)) {
				it.add(11);
			}
		}
		System.out.println(ar);
		System.out.println("In Reverse");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
