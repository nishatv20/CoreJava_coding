package com.practice.collections;

import java.util.Arrays;
import java.util.Objects;

public class TreeMapResult implements Comparable<TreeMapResult> {
	public TreeMapResult(int result_id, String date, int sem, float per, String grade, int[] marks) {
		super();
		this.result_id = result_id;
		this.date = date;
		this.sem = sem;
		this.per = per;
		this.grade = grade;
		this.marks = marks;
	}

	int result_id;
	String date;
	int sem;
	float per;
	String grade;
	int[] marks = new int[5];

	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "TreeMapResult [result_id=" + result_id + ", date=" + date + ", sem=" + sem + ", per=" + per + ", grade="
				+ grade + ", marks=" + Arrays.toString(marks) + "]";
	}

	@Override
	public int compareTo(TreeMapResult o) {
		if (per > o.per) {
			return 1;
		} else if (per < o.per) {
			return -1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(result_id);
	}

	@Override
	public boolean equals(Object obj) {
		 
		TreeMapResult other = (TreeMapResult) obj;
		return result_id == other.result_id;
	}

//	public int compareTo(TreeMapResult o2) {
//
//		if (sem > o2.sem) {
//			return 1;
//		} else if (sem < o2.sem) {
//			return -1;
//		} else {
//			return 0;
//		}
//
//	}

}
