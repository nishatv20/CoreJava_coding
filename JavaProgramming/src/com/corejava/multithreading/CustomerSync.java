package com.corejava.multithreading;

public class CustomerSync extends Thread {
	int cid;
	String cname;
	OrdersSync os;
	int order;

	public CustomerSync(int cid, String cname, OrdersSync obj, int order) {
		this.cid = cid;
		this.cname = cname;
		this.os = obj;
		this.order = order;
	}

	public void run() {
		System.out.println(this.getName());
		os.placeOrder(this.getName(), order);
	}
}
