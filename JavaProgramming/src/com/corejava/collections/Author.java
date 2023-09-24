package com.corejava.collections;

public class Author {
	String authorid;
	String name;
	int ph;
	String addr;
    
	public Author(String authorid, String name, int ph, String addr) {
		this.authorid = authorid;
		this.name = name;
		this.ph = ph;
		this.addr = addr;
	}
	
	public String getAuthorname() {
		return name;
	}

	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", name=" + name + ", ph=" + ph + ", addr=" + addr + "]";
	}
	
}
