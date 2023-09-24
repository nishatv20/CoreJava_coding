package com.corejava.collections;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ListIterator;

public class LinkedListMainEmp {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<LinkedDepartment> ld = new LinkedList<LinkedDepartment>();
		LinkedList<LinkedEmployee> le = new LinkedList<LinkedEmployee>();
		LinkedListMainEmp vm = new LinkedListMainEmp();

		int choice;
		do {
			System.out.println("1. ADD NEW EMPLOYEE");
			System.out.println("2. UPDATE EMP EMAIL/CONTACT");
			System.out.println("3. CHANGE DEPT CONTACT NO");
			System.out.println("4. INCREEMENT EMP SALARY(%)");
			System.out.println("5. PRINT EMP DETAILS");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("---***ADDING EMPLOYEES***---");
				vm.addLInkData(ld, le);
				System.out.println("-----DETAILS RECIEVED-----");
				vm.addLInkData(ld, le);
				System.out.println("-----DETAILS RECIEVED-----");
				vm.addLInkData(ld, le);
				System.out.println("-----DETAILS RECIEVED-----");
				System.out.println("---*************************---");
				break;

			case 2:
				System.out.println("---***UPDATION OPERATION EMAIL***---");
				vm.UpdateEmp(le);
				System.out.println("---***------------------------***---");

			case 3:
				System.out.println("---***UPDATION OPERATION CONTACT***---");
				vm.updateContact(ld);
				System.out.println("---***--------------------------***---");

			case 4:
				System.out.println("---***UPDATION SALARY CONTACT***---");
				vm.updateSalary(le);
				System.out.println("---***--------------------------***---");
			case 5:
				System.out.println("---***PRINTING OPERATION***---");
				vm.printDetails(le, ld);
				System.out.println("---***------------------***---");
			}
		} while (choice != 5);
	}

	void addLInkData(LinkedList<LinkedDepartment> ld, LinkedList<LinkedEmployee> le)
			throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------ENTER DEPT DATA------");
		System.out.println("ENTER ACCOUNT NUMBER :");
		int dno = Integer.parseInt(br.readLine());
		System.out.println("ENTER DEPARTMENT TYPE :");
		String dname = br.readLine();
		System.out.println("ENTER DEPARTMENT CONTACT NUMBER :");
		int contact = Integer.parseInt(br.readLine());
		System.out.println("ENTER DEPARTMENT EMAIL :");
		String email = br.readLine();
		ld.add(new LinkedDepartment(dno, dname, contact, email));

		System.out.println("-----------------------------------");
		System.out.println("---ENTER EMPLOYEE DATA---");
		System.out.println("ENTER EMPLOYEE NUMBER :");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("ENTER EMPLOYEE NAME :");
		String ename = br.readLine();
		System.out.println("ENTER EMPLOYEE SALARY :");
		int sal = Integer.parseInt(br.readLine());
		System.out.println("ENTER EMPLOYEE EMAIL :");
		String eemail = br.readLine();
		le.add(new LinkedEmployee(eno, ename, sal, eemail, ld));
	}

	void UpdateEmp(LinkedList<LinkedEmployee> le) throws IOException, NumberFormatException {
		ListIterator<LinkedEmployee> li = le.listIterator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno;
		System.out.println("ENTER EMPLOYEE NUMBER :");
		eno = Integer.parseInt(br.readLine());
		int option;
		System.out.println("ENTER 1 FOR EMAIL , 2 FOR CONTACT");
		option = Integer.parseInt(br.readLine());

		if (option == 1) {
			System.out.println("ENTER UPDATED EMAIL :");
			String uemail = br.readLine();
			for (int i = 0; i < le.size(); i++) {
				if (le.get(i).getEno() == eno) {
					le.get(i).setEemail(uemail);
					System.out.println("AFTER UPDATION");
					le.get(i).toString();
				}
			}
		}
	}

	void updateContact(LinkedList<LinkedDepartment> ld) throws IOException, NumberFormatException {
		ListIterator<LinkedDepartment> li = ld.listIterator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMPLOYEE NUMBER :");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("ENTER UPDATED CONTACT :");
		int contact = Integer.parseInt(br.readLine());
		for (int i = 0; i < ld.size(); i++) {
			if (ld.get(i).getContact() == contact) {
				ld.get(i).setContact(contact);
				System.out.println("AFTER UPDATION");
				ld.get(i).toString();
			}
		}

	}

	void updateSalary(LinkedList<LinkedEmployee> le) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER EMPLOYEE NUMBER :");
		int eno = Integer.parseInt(br.readLine());
		System.out.println("ENTER EMPLOYEE SALARY:");
		int esal = Integer.parseInt(br.readLine());
		for (int i = 0; i < le.size(); i++) {
			if (le.get(i).getEno() == eno) {
				le.get(i).setSal(esal);

			}
		}
	}

	void printDetails(LinkedList<LinkedEmployee> le, LinkedList<LinkedDepartment> ld)
			throws IOException, NumberFormatException {
		System.out.println("ENTER EMPLOYEE NUMBER :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno = Integer.parseInt(br.readLine());
		for (int i = 0; i < le.size(); i++) {
			if (le.get(i).getEno() == eno) {
				le.get(i).toString();
				ld.get(i).toString();

			}
		}
	}
}
