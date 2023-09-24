package com.hasIs.practice;

public class Vehicle {
	private String reg_no;
	private String fuel_type;
	private String color;
	private Engine engine;

	public Vehicle(String reg_no, String fuel_type, String color, Engine engine) {
		this.reg_no = reg_no;
		this.fuel_type = fuel_type;
		this.color = color;
		this.engine = engine;
	}

	public void getvehicleInfo() {
		System.out.println("REGISTRATION NUMBER :" + reg_no);
		System.out.println("FUEL TYPE :" + fuel_type);
		System.out.println("COLOR :" + color);
		System.out.println("ENGINE NUMBER :" + engine.geteng_no());
		System.out.println("ENGINE TYPE :" + engine.geteng_type());
	}
}
