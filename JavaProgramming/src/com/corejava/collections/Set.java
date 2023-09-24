package com.practice.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("Pune");
//		hs.add("Mumbai");
//		hs.add("Pune");
//		hs.add("Nashik");
//		hs.add("Mumbai");
//		System.out.println(hs);
//		for (String s : hs) {
//			System.out.println(s);
//		}
//		Iterator<String> li = hs.iterator();
//		while (li.hasNext()) {
//			if (li.next().equals("Pune"))
//				
//			{
//				System.out.println(li.next());
//			}
//		}
		HashSet<Personn> hp = new HashSet<Personn>();
		hp.add(new Personn(1, "Person1"));
		hp.add(new Personn(2, "Person2"));
		System.out.println(hp);
		for (Personn p : hp) {
			System.out.println(p.hashCode());
		}
	}
}
