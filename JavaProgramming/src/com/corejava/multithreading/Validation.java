package com.practice.multithreading;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Validation extends Thread {
	int idnumber = 12345;
	int num;

	public void run() {
		validate();
	}

	public int validate() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id = 0;
		System.out.println("ENTER ID : ");

		try {
			id = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (id == idnumber) {
			return 0;
		} else {
			return 1;
		}

	}

}
