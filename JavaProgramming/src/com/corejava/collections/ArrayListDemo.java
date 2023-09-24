package com.corejava.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("One");
		al.add(1);
		al.add(1.1f);
		al.add(12.4);
		al.add('A');

		for (Object obj : al) {
			System.out.println(obj);
		}
		al.remove(1);
		al.remove("One");
		System.out.println(al);
		al.add(0, "Nishat");
		System.out.println(al + " " + al.size());

		ArrayList<Person> pr = new ArrayList<Person>();

		pr.add(new Person(1, "Nishat"));
		pr.add(new Person(2, "Shilpa"));
		pr.add(new Person(3, "Shalini"));
		pr.add(new Person(4, "Rajesh"));

		for (Person p : pr) {
			System.out.println(p.name);
		}
	}
}
