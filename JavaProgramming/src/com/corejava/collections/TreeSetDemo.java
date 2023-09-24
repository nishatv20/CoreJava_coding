package com.corejava.collections;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("1");
		ts.add("Pune");
		ts.add("Mumbai");
		ts.add("2");
		ts.add("10");
		System.out.println(ts);

		System.out.println("IN REVERSE ORDER :");
		TreeSet<String> t = new TreeSet<String>(new SortName());
		t.add("1");
		t.add("Pune");
		t.add("Mumbai");
		t.add("2");
		t.add("10");
		System.out.println(t);

		TreeSet<Integer> ti = new TreeSet<Integer>(new SortByNumber());
		ti.add(1);
		ti.add(2);
		ti.add(3);
		ti.add(4);
		ti.add(5);
		System.out.println(ti);

	}
}

class SortName implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

class SortByNumber implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;
		}
		return 0;
	}
}
