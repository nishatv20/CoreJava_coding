package com.practice.collections;

import java.util.Objects;

public class TreeSetPerson implements Comparable<TreeSetPerson> {
	int pid;
	String name;

	public TreeSetPerson(int pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	@Override
	public int compareTo(TreeSetPerson o) {
		// TODO Auto-generated method stub
		if (pid > o.pid) {
			return 1;
		} else if (pid < o.pid) {
			return -1;
		} else
			return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}

	@Override
	public boolean equals(Object obj) {
		TreeSetPerson other = (TreeSetPerson) obj;
		return pid == other.pid;
	}

	@Override
	public String toString() {
		return "TreeSetPerson [pid=" + pid + ", name=" + name + "]";
	}

}
