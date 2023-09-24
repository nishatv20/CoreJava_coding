package com.practice.collections;

import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdersVectorMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Vector<CustomerVector> cp = new Vector<CustomerVector>();
		Vector<OrdersVector> ov = new Vector<OrdersVector>();
		OrdersVectorMain ovm = new OrdersVectorMain();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println();

		do {
			System.out.println("1. PLACE ORDER");
			System.out.println("2. VIEW ALL COMPLETED ORDERS");
			System.out.println("3. SEARCH ORDER");
			System.out.println("4. CANCEL ORDER");
			System.out.println("5. CHANGE ORDER STATUS");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("--PLACING ORDER--");
				ovm.addData(cp, ov);
				ovm.addData(cp, ov);
				ovm.addData(cp, ov);
				break;
			case 2:
                System.out.println("--PRINTING COMPLETED ORDERS--");
                ovm.viewCmpOrders(ov, "COMPLETE");
			}
		} while (choice != 5);
	}

	void addData(Vector<CustomerVector> cp, Vector<OrdersVector> ov) throws NumberFormatException, IOException {
		System.out.println("-----ENTER ORDER DETAILS :-----");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ORDER ID :");
		int order_id = Integer.parseInt(br.readLine());
		System.out.println("ENTER ORDER DATE :");
		String date = br.readLine();
		System.out.println("ENTER ITEM NAME :");
		String itemname = br.readLine();
		System.out.println("ENTER ORDER QUANTITY :");
		int qty = Integer.parseInt(br.readLine());
		System.out.println("ENTER PRICE :");
		int price = Integer.parseInt(br.readLine());
		System.out.println("ENTER AMOUNT :");
		int amt = Integer.parseInt(br.readLine());
		System.out.println("ENTER STATUS :");
		String status = br.readLine();
		ov.add(new OrdersVector(order_id, date, itemname, qty, price, amt, status));

		System.out.println("-----CUSTOMER DETAILS-----");
		System.out.println("ENTER CUSTOMER ID :");
		int cust_id = Integer.parseInt(br.readLine());
		System.out.println("ENTER CUSTOMER NAME :");
		String name = br.readLine();
		System.out.println("ENTER PHONE NUMBER :");
		int ph = Integer.parseInt(br.readLine());
		System.out.println("ENTER EMAIL :");
		String email = br.readLine();
		cp.add(new CustomerVector(cust_id, name, ph, email, ov));
	}
	
	void viewCmpOrders(Vector<OrdersVector> ov,String status) {
		for(int i=0; i<ov.size(); i++) {
			if(ov.get(i).getStatus().equals(status)) {
				System.out.println(ov.get(i).toString());
			}
 		}
	}
}
