package com.corejava.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		Queue<QueueMobile> qm = new LinkedList<QueueMobile>();
		qm.add(new QueueMobile(101, "LAVA", 8, 128, "2016", 6));
		qm.add(new QueueMobile(102, "IPHONE", 8, 64, "2020", 6));
		qm.add(new QueueMobile(103, "REALME", 8, 64, "2022", 5));
		System.out.println(qm);
	}
}
