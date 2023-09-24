package com.exception.practice;

public class Storage {
	private int speed;
	private int serial_no;
	private Ram ram;

	public Storage(int speed, int serial_no, Ram ram) {
		this.speed = speed;
		this.serial_no = serial_no;
		this.ram = ram;

	}

	public void getStorageData() {
		System.out.println("STORAGE SPEED :" + speed);
		System.out.println("STORAGE SERIAL NUMBER :" + serial_no);
	}

	public int getRamCap() {
		return ram.capacity;
	}

	public int getStorageSerNo() {
		return serial_no;
	}
}
