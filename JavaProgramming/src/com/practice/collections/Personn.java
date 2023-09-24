package com.practice.collections;

import java.util.Objects;

public class Personn {
	int pid;
	String name;

	public Personn(int pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personn other = (Personn) obj;
		return pid == other.pid;
	}
}
