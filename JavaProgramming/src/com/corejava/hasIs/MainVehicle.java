package com.corejava.hasIs;

import java.util.Scanner;

public class MainVehicle {
	public static void main(String[] args) {
		Engine e1 = new Engine(1234, "PETROL");
		Engine e2 = new Engine(4321, "DIESEL");
		Vehicle v1 = new Vehicle("R111", "PETROL", "RED", e1);
		Vehicle v2 = new Vehicle("R112", "DIESEL", "BLUE", e2);
		Vehicle v3 = new Vehicle("R113", "PETROL", "GREEN", e1);

		v1.getvehicleInfo();
		v2.getvehicleInfo();
		v3.getvehicleInfo();
	}
}
