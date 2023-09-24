package com.corejava.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TreeMapMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		TreeMapMain tmm = new TreeMapMain();
		TreeMap<TreeMapResult, TreeMapStudent> tm = new TreeMap<TreeMapResult, TreeMapStudent>(
				tmm.new sortDescending());
		int[] marks1 = { 70, 70, 70, 70, 70 };
		int[] marks2 = { 80, 80, 80, 80, 80 };
		int[] marks3 = { 85, 85, 85, 85, 85 };
		tm.put(new TreeMapResult(101, "20June", 1, 70, "A", marks1),
				new TreeMapStudent(104, "Nishat", "DECCAN", "a@gmail"));
		tm.put(new TreeMapResult(102, "21June", 2, 80, "A", marks2),
				new TreeMapStudent(105, "Rahul", "DECCAN", "r@gmail"));
		tm.put(new TreeMapResult(103, "22June", 3, 85, "A", marks3),
				new TreeMapStudent(106, "Pankaj", "DECCAN", "p@gmail"));
		System.out.println(tm);
		System.out.println("VIEW RESULT :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER SEM OF STUDENT :");
		int sem = Integer.parseInt(br.readLine());

		HashSet<TreeMapResult> hs1 = new HashSet<TreeMapResult>(tm.keySet());
		Iterator<TreeMapResult> ie = hs1.iterator();
		while (ie.hasNext()) {
			TreeMapResult tmr = ie.next();
			if (tmr.getSem() == sem) {
				System.out.println("--FOUND--");
				System.out.println(tmr.toString());
			}
		}
		System.out.println("ENTER NAME OF College :");
		String college = br.readLine();

		HashSet<TreeMapStudent> hss = new HashSet<TreeMapStudent>();
		Iterator<TreeMapStudent> is = hss.iterator();
		while (is.hasNext()) {
			TreeMapStudent tms = is.next();
			//System.out.println(is.next());
			if (tms.getClg_name().equals(college)) {
				//System.out.println(tms.getClg_name());
				System.out.println("--FOUND--");
				System.out.println(tms.toString());
			}
		}
	}

	class sortDescending implements Comparator<TreeMapResult> {

		public int compare(TreeMapResult o1, TreeMapResult o2) {
			return o2.compareTo(o1);
		}
	}
}
