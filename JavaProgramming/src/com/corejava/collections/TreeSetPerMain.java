package com.corejava.collections;

import java.util.TreeSet;

public class TreeSetPerMain {
	public static void main(String[] args) {
		TreeSet<TreeSetPerson> tsp = new TreeSet<TreeSetPerson>();
		tsp.add(new TreeSetPerson(1, "Nishat"));
		tsp.add(new TreeSetPerson(3, "Yogesh"));
		tsp.add(new TreeSetPerson(3, "Rahul"));
		tsp.add(new TreeSetPerson(4, "Vishal"));
		System.out.println(tsp);
	}
}
