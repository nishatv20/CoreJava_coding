package com.corejava.collections;

import java.util.Objects;

public class HashMapCustomer {
int cid;
String name;
String email;

public HashMapCustomer(int cid, String name, String email) {
	this.cid = cid;
	this.name = name;
	this.email  = email;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "TreeSetCustomer [cid=" + cid + ", name=" + name + ", email=" + email + "]";
}

@Override
public int hashCode() {
	return Objects.hash(cid);
}

@Override
public boolean equals(Object obj) {
	HashMapCustomer other = (HashMapCustomer) obj;
	return cid == other.cid ;
}
}
