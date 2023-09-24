package com.corejava.multithreading;

public class CustOrderMain {
	public static void main(String[] args) {
		OrdersSync os = new OrdersSync();
		CustomerSync t1 = new CustomerSync(100, "NISHAT", os, 2);
		t1.setName("NISHAT");
		CustomerSync t2 = new CustomerSync(101, "SHALINI", os, 4);
		t2.setName("SHALINI");
		CustomerSync t3 = new CustomerSync(103, "RAJESH", os, 2);
		t3.setName("RAJESH");
		t1.start();
		t2.start();
		t3.start();
	}
}
