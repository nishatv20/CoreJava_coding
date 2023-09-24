package com.practice.collections;

import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		city.add("Pune");
		city.add("Mumbai");
		city.add("Nashik");
		city.add("Satara");
		c.addAll(city);
		System.out.println(c);
		String s = city.get(0);
		System.out.println(s);

		Iterator<String> it = city.iterator();
		while (it.hasNext()) {
			if (it.next().equals("Nashik")) {
				it.remove();
			}
		}

		while (it.hasNext()) {
			System.out.println("In Loop");
			System.out.println(it.next());
		}
		System.out.println(city);
	}
}
