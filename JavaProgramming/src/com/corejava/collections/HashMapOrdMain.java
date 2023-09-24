package com.practice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HashMapOrdMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		HashMapOrdMain hmo = new HashMapOrdMain();
		HashMap<HashMapCustomer, HashMapOrder> hmm = new HashMap<HashMapCustomer, HashMapOrder>();
		int choice;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("***---MAIN MENU---***");
			System.out.println("1. PLACE ORDER");
			System.out.println("2. SEARCH ORDER(ORDER ID)");
			System.out.println("3. SEARCH ORDER(CUST ID)");
			System.out.println("4. DELETE ORDER");
			System.out.println("5. EXIT PROGRAM");
			System.out.println("---------------------");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("**--PLACING ORDER--**");
				hmo.getData(hmm);
				System.out.println("**--ORDER PLACED SUCESSFULLY--**");
				break;

			case 2:
				System.out.println("**--SEARCHING ORDER(OID)--**");
				hmo.searchOrdId(hmm);
				System.out.println("**--SEARCH COMPLETED--**");
				break;

			case 3:
				System.out.println("**--SEARCHING ORDER(CID)--**");
				hmo.searchCustId(hmm);
				System.out.println("**--SEARCH COMPLETED--**");
				break;

			case 4:
				System.out.println("**--DELETE OPERATION--**");
				hmo.deleteEntry(hmm);
				System.out.println("**--DELETED SUCESSFULLY--**");
				break;

			case 5:
				System.out.println("---EXITING PROGRAM---");
				break;

			default:
				System.out.println("**--INVALID CHOICE PLAESE TRY AGAIN--**");
				break;
			}
		} while (choice != 5);
	}

	void getData(HashMap<HashMapCustomer, HashMapOrder> hmm) throws NumberFormatException, IOException {
		System.out.println("ENTER DATA-->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER CUST ID :");
		int cid = Integer.parseInt(br.readLine());
		System.out.println("ENTER CUST NAME :");
		String name = br.readLine();
		System.out.println("ENTER CUST EMAIL :");
		String email = br.readLine();
		System.out.println("------------------------");
		System.out.println("ENTER ORDER DETAILS :");
		System.out.println("ENTER ORDER ID :");
		int oid = Integer.parseInt(br.readLine());
		System.out.println("ENTER ORDER NAME :");
		String oname = br.readLine();
		System.out.println("ENTER ORDER QTY :");
		int qty = Integer.parseInt(br.readLine());
		System.out.println("------------------------");
		hmm.put(new HashMapCustomer(cid, name, email), new HashMapOrder(oid, oname, qty));
	}

	void searchOrdId(HashMap<HashMapCustomer, HashMapOrder> hmm) throws NumberFormatException, IOException {
		System.out.println("ENTER ORDER ID :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int od = Integer.parseInt(br.readLine());
		HashSet<HashMapOrder> hso = new HashSet<HashMapOrder>();
		hso.addAll(hmm.values());
		Iterator<HashMapOrder> io = hso.iterator();
		while (io.hasNext()) {
			HashMapOrder o = io.next();
			if (o.getOid() == od) {
				o.toString();
			}
		}

	}

	void searchCustId(HashMap<HashMapCustomer, HashMapOrder> hmm) throws NumberFormatException, IOException {
		System.out.println("ENTER CUST ID :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cd = Integer.parseInt(br.readLine());
		HashSet<HashMapCustomer> hsc = new HashSet<HashMapCustomer>();
		hsc.addAll(hmm.keySet());
		Iterator<HashMapCustomer> ie = hsc.iterator();
		while (ie.hasNext()) {
			HashMapCustomer c = ie.next();
			if (c.getCid() == cd) {
				hmm.toString();
			}
		}
	}

	void deleteEntry(HashMap<HashMapCustomer, HashMapOrder> hmm) throws NumberFormatException, IOException {
		System.out.println("ENTER CUST ID :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cd = Integer.parseInt(br.readLine());
		HashSet<HashMapCustomer> hsc = new HashSet<HashMapCustomer>();
		hsc.addAll(hmm.keySet());
		Iterator<HashMapCustomer> ii = hsc.iterator();
		while (ii.hasNext()) {
			HashMapCustomer c = ii.next();
			if (c.getCid() == cd) {
				hmm.remove(c);
			}
		}
	}
}
