package com.corejava.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemoMain {
	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "Nishat");
		hs.put(2, "Rajat");
		hs.put(3, "Yogesh");
		hs.put(4, "Sunny");
		System.out.println(hs.get(1));

		HashMap<HashMapEmployee, HashMapDept> hemp = new HashMap<HashMapEmployee, HashMapDept>();
		hemp.put(new HashMapEmployee(145, "Nishat", 60000), new HashMapDept(23, "SALES"));
		hemp.put(new HashMapEmployee(146, "Yogesh", 65000), new HashMapDept(24, "ACCOUNTS"));
		hemp.put(new HashMapEmployee(147, "Vijay", 54000), new HashMapDept(25, "PRDUCTION"));

		for (HashMapEmployee he : hemp.keySet()) {
			System.out.println(hemp.get(he));
		}
		HashSet<HashMapEmployee> hme = new HashSet<HashMapEmployee>();
		hme.addAll(hemp.keySet());
		Iterator<HashMapEmployee> ie = hme.iterator();
		while (ie.hasNext()) {
			HashMapEmployee t = ie.next();
			if (t.getEmpno() == 145) {
				hemp.remove(t);
			}
		}
		System.out.println(hemp);
	}
}
