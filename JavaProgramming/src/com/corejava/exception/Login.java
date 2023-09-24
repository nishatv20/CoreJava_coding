package com.corejava.exception;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Login {
	String username;
	String pass;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void getData() throws IOException {
		System.out.println("ENTER USER NAME :");
		try {
			username = br.readLine();
			if (username.length() <= 15 || username.length() >= 20)
				throw new UserName("USER NAME LENGTH LIMIT BREACHED");
		} catch (UserName un) {
			System.out.println(un.getMessage());
		}
		System.out.println("ENTER PASSWORD :");
		try {
			pass = br.readLine();
			if (pass.length() >= 16 || pass.length() <= 8)
				throw new PassWord("PASSWORD LENGTH LIMIT BREACHED");

		} catch (PassWord pw) {
			System.out.println(pw.getMessage());
		} catch (NullPointerException np) {
			System.out.println(np.getMessage());
		}
	}

}
