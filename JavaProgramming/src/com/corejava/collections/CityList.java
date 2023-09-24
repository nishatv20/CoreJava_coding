package com.practice.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class CityList {
	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<String>();
		city.add("PUNE");
		city.add("BANGALORE");
		city.add("SURAT");
		city.add("DELHI");
		city.add("JAMMU");

		
		System.out.println(city);
		ListIterator<String> lr = city.listIterator();
		while (lr.hasNext()) {
			if (lr.next().equals("SURAT")) {
				lr.add("KOLKATA");
			}
		}
		System.out.println("AFTER ADDING :");
		System.out.println(city);
		while (lr.hasPrevious()) {
			if (lr.previous().equals("SURAT")) {
				lr.remove();
			}
		}
		System.out.println("AFTER REMOVING :");
		System.out.println(city);

		System.out.println("FINDING CITY :");
		while (lr.hasNext()) {
			if (lr.next().equals("DELHI")) {
				System.out.println("CITY FOUND");
				System.out.println(city.indexOf("DELHI"));
			}

		}
		System.out.println("LIST OF CITIES :");
		for (int i = 0; i < city.size(); i++) {
			System.out.println(city.get(i));
		}
	}

}
