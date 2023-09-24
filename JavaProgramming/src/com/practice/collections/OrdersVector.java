package com.practice.collections;

public class OrdersVector {
	private int order_id;
	private String date;
	private String itemname;
	private int qty;
	private int price;
	private int amt;
	private String status;

	public OrdersVector(int order_id, String date, String itemname, int qty, int price, int amt, String status) {
		super();
		this.order_id = order_id;
		this.date = date;
		this.itemname = itemname;
		this.qty = qty;
		this.price = price;
		this.amt = amt;
		this.status = status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrdersVector [order_id=" + order_id + ", date=" + date + ", itemname=" + itemname + ", qty=" + qty
				+ ", price=" + price + ", amt=" + amt + ", status=" + status + "]";
	}
}
