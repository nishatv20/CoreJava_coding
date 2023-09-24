package com.corejava.stat;
import java.util.Scanner;

class Order {
	String order_date;
	String customer_name;
	String customer_email;
	int total_amount;
	int oid;

	static String status = "PENDING";
	static int order_id = 0;

	Order() {
		oid = ++order_id;
		System.out.println("Order ID : " + order_id);
		status = "COMPLETE";
	}

	public void placeOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order date:");
		order_date = sc.nextLine();
		System.out.println("Enter Customer Name:");
		customer_name = sc.nextLine();
		System.out.println("Enter Customer E-mail:");
		customer_email = sc.nextLine();
		System.out.println("Enter Total Amount:");
		total_amount = sc.nextInt();
		System.out.println("Order is Placed");
	}

	public void viewOrder() {
		System.out.println("------ORDER DETAILS-------");
		System.out.println("Order Date :" + order_date);
		System.out.println("Customer Name :" + customer_name);
		System.out.println("Customer Email :" + customer_email);
		System.out.println("Total Amount :" + total_amount);
		System.out.println("Status :" + status);
	}
}

class OrdersOper {
	public static void main(String[] args) {

		Order o1 = new Order();
		o1.placeOrder();
		System.out.println("Order ID :" + o1.order_id);
		o1.viewOrder();
		System.out.println("-----------------------------------------------------------------");
		Order o2 = new Order();
		o2.placeOrder();
		System.out.println("Order ID :" + o2.order_id);
		o2.viewOrder();
		System.out.println("-----------------------------------------------------------------");
		Order o3 = new Order();
		o3.placeOrder();
		System.out.println("Order ID :" + o3.order_id);
		o3.viewOrder();
		System.out.println("-----------------------------------------------------------------");
		Order o4 = new Order();
		o4.placeOrder();
		System.out.println("Order ID :" + o4.order_id);
		o4.viewOrder();
		System.out.println("-----------------------------------------------------------------");
	}
}