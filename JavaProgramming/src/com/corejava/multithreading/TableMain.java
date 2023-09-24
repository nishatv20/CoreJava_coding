package com.corejava.multithreading;

public class TableMain {
	public static void main(String[] args) {
		TableMath t1 = new TableMath();
		t1.start();
		for (int j = 1; j < 10; j++) {
			int res = 4 * j;
			System.out.println(" 4 *" + j + "=" + res);
		}
	}
}
