package com.corejava.collections;

import java.util.HashSet;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class HashSetMain {
	public static void main(String[] args) throws IOException, NumberFormatException {
		HashSet<HashSetEmployee> hs = new HashSet<HashSetEmployee>();
		HashSetMain hsm = new HashSetMain();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;

		do {
			System.out.println("1. ADD AN EMPLOYEE");
			System.out.println("2. SEARCH EMPLOYEE");
			System.out.println("3. DELETE EMPLOYEE");
			System.out.println("4. -----EXIT-----");
			System.out.println("ENTER YOUR CHOICE :");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.println("***---ADDING NEW EMP---***");
				hsm.getData(hs);
				System.out.println("--DATA ADDED SUCCESSFULLY--");
				hsm.getData(hs);
				System.out.println("--DATA ADDED SUCCESSFULLY--");
				hsm.getData(hs);
				System.out.println("--DATA ADDED SUCCESSFULLY--");
				System.out.println("***--------------------***");
				break;

			case 2:
				System.out.println("***---SEARCHING EMPLOYEE---***");
				hsm.searchEmp(hs);
				System.out.println("***------------------------***");
				break;

			case 3:
				System.out.println("***---DELETE EMPLOYEE DATA---***");
				hsm.deleteEmp(hs);
				System.out.println("***--------------------------***");
				break;

			case 4:
				System.out.println("***---EXITING THE PROGRAM---***");
				break;

			default:
				System.out.println("***---INVALID CHOICE---***");
				break;
			}
		} while (choice != 4);

	}

	void getData(HashSet<HashSetEmployee> hs) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMPLOYEE NUMBER :");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("ENTER EMPLOYEE NAME :");
		String ename = br.readLine();
		System.out.println("ENTER EMPLOYEE SALARY :");
		int sal = Integer.parseInt(br.readLine());
		System.out.println("ENTER EMPLOYEE DEPT. NAME :");
		String dname = br.readLine();
		System.out.println("ENTER EMPLOYEE EMAIL :");
		String email = br.readLine();
		System.out.println("ENTER EMPLOYEE CITY :");
		String city = br.readLine();
		hs.add(new HashSetEmployee(eno, ename, sal, dname, email, city));
	}

	void searchEmp(HashSet<HashSetEmployee> hs) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Iterator<HashSetEmployee> it = hs.iterator();
		int option;
		System.out.println("ENTER 1. BY NAME ");
		System.out.println("ENTER 2. BY ID ");
		System.out.println("ENTER 3. BY CITY ");

		option = Integer.parseInt(br.readLine());
		int val;
		if (option == 1) {
			System.out.println("ENTER NAME OF EMP :");
			String name = br.readLine();
			while (it.hasNext()) {
				if (it.next().getEname().equals(name)) {
					System.out.println("EMPLOYEE FOUND");
					break;
				} else {
					System.out.println("NOT FOUND");
				}
			}

		} else if (option == 2) {
			System.out.println("ENTER ID OF EMP :");
			int id = Integer.parseInt(br.readLine());
			while (it.hasNext()) {
				if (it.next().getEno() == id) {
					System.out.println("EMPLOYEE FOUND");
					break;
				} else {
					System.out.println("NOT FOUND");
				}

			}
		} else if (option == 3) {
			System.out.println("ENTER CITY OF EMP :");
			String city = br.readLine();
			while (it.hasNext()) {
				if (it.next().getCity().equals(city)) {
					System.out.println("EMPLOYEE FOUND");
					break;
				} else {
					System.out.println("NOT FOUND");
				}
			}
		} else {
			System.out.println("NOT A VALID INPUT");
		}

	}

	void deleteEmp(HashSet<HashSetEmployee> hs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Iterator<HashSetEmployee> it = hs.iterator();
		System.out.println("---DELETING EMPLOYEE---");
		System.out.println("ENTER EMP NO :");
		int eno = Integer.parseInt(br.readLine());
		while (it.hasNext()) {
			if (it.next().getEno() == eno) {
				System.out.println("EMPLOYEE RECORD REMOVED");
			} else {
				System.out.println("EMPLOYEE NOT FOUND");
			}
		}

	}
}
