package com.corejava.multithreading;

public class OrdersSync {
	static int available_qty;
	static {
		available_qty = 5;
	}

	synchronized public void placeOrder(String nm, int order) {
		
		try {
			if (available_qty <order )
				throw new OrdersException("ITEM OUT OF STOCK");
			available_qty = available_qty - order;
			System.out.println(nm +" Your order is placed");
		} catch (OrdersException oe) {
			System.out.println(oe.getMessage());
		}

		//System.out.println("AVAILABLE QUANTITY :" + available_qty + " " + nm);
	}
}
