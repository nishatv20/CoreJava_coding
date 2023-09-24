package com.exception.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainRam {
	public static void main(String[] args) throws IOException {
		Ram[] rm = new Ram[2];
		Storage[] st = new Storage[2];
		Mobile[] mb = new Mobile[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("**********ENTER DETAILS**********");
		for (int i = 0; i < rm.length; i++) {
			System.out.println("---ENTER RAM DETAILS---");
			System.out.println("ENTER RAM CAPACITY :");
			int capacity = Integer.parseInt(br.readLine());
			try {
				if (capacity != 4 || capacity != 8)
					throw new RamException("RAM MUST BE 4/8 GB");
			} catch (RamException re) {
				System.out.println(re.getMessage());
			}
			System.out.println("ENTER RAM TYPE :");
			String type = br.readLine();
			rm[i] = new Ram(capacity, type);
			System.out.println("---ENTER STORAGE DETAILS---");
			System.out.println("ENTER STORAGE SPEED :");
			int speed = Integer.parseInt(br.readLine());
			System.out.println("ENTER STORAGE SERIAL NO :");
			int serial_no = Integer.parseInt(br.readLine());
			st[i] = new Storage(speed, serial_no, rm[i]);
		}
		for (int i = 0; i < mb.length; i++) {
			System.out.println("---ENTER MOBILE DETAILS---");
			System.out.println("ENTER MODEL NUMBER :");
			int model_no = Integer.parseInt(br.readLine());
			System.out.println("ENTER SCREEN TYPE :");
			String screen_type = br.readLine();
			System.out.println("ENTER SCREEN SIZE :");
			int screen_size = Integer.parseInt(br.readLine());
			System.out.println("ENTER STORAGE TYPE :");
			System.out.println("1 FOR 4/32 AND 2 FOR 8/64");
			int type = Integer.parseInt(br.readLine());
			if (type == 1) {
				mb[i] = new Mobile(model_no, screen_type, screen_size, st[0]);
			} else {
				mb[i] = new Mobile(model_no, screen_type, screen_size, st[1]);
			}

			System.out.println("***************************************");
		}
		System.out.println("******************************");

		int mbno;
		System.out.println("ENTER MODEL NUMBER YOU WANT TO SEARCH :");
		try {
			mbno = Integer.parseInt(br.readLine());

			for (int i = 0; i < mb.length; i++) {
				if (mbno == mb[i].getModelNo()) {
					mb[i].getMobileData();
				}
			}
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		System.out.println("---SEARCHING ON RAM DETAILS---");
		int ram;
		System.out.println("ENTER RAM CAPACITY :");
		ram = Integer.parseInt(br.readLine());
		for (int i = 0; i < mb.length; i++) {
			if (ram == mb[i].getMobileRam()) {
				mb[i].getMobileData();
			}
		}
		System.out.println("---SEARCHING ON ROM DETAILS---");
		int rom;
		System.out.println("ENTER ROM SERIAL NUMBER :");
		rom = Integer.parseInt(br.readLine());
		for (int i = 0; i < mb.length; i++) {
			if (rom == mb[i].getMobileStorage()) {
				mb[i].getMobileData();
			}
		}
	}
}
