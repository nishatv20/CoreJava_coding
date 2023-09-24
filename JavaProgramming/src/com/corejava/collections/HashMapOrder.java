package com.corejava.collections;

import java.util.Objects;

public class HashMapOrder {
	int oid;
	String oname;
	int qty;

	public HashMapOrder(int oid, String oname, int qty) {
		this.oid = oid;
		this.oname = oname;
		this.qty = qty;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "TreeSetOrder [oid=" + oid + ", oname=" + oname + ", qty=" + qty + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(oid);
	}

	@Override
	public boolean equals(Object obj) {

		HashMapOrder other = (HashMapOrder) obj;
		return oid == other.oid;
	}
}
