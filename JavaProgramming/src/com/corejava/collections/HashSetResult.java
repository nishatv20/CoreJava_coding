package com.corejava.collections;

import java.util.HashSet;

public class HashSetResult {
	public HashSetResult(String sem, int marks, float percentage, String grade, HashSet<HashSetStudent> hss) {
		super();
		this.sem = sem;
		this.marks = marks;
		this.percentage = percentage;
		this.grade = grade;
		this.hss = hss;
	}

	private String sem;
	private int marks;
	private float percentage;
	private String grade;
	HashSet<HashSetStudent> hss;

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public HashSetStudent getHss() {
		return hss;
	}

	public void setHss(HashSetStudent hss) {
		this.hss = hss;
	}

}
