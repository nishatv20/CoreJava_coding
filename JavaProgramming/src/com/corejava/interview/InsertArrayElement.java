package com.practice.interview;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertArrayElement {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ARRAY SIZE-->");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("ENTER ARRAY ELEMENTS-->");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("ENTER ELEMENT YOU WANT TO ENTER-->");
		int ele = Integer.parseInt(br.readLine());
		System.out.println("ENTER POSITION OF ELEMENT-->");
		int pos = Integer.parseInt(br.readLine());

		if (pos > size + 1 || pos <= 0) {
			System.out.println("ENTER VALID POSITION");
		} else {
			
			for (int i = size; i >= pos; i--) {
				arr[i] = arr[i - 1];
			}
			arr[pos - 1] = ele;
			size++;
			System.out.println("PRINTING ARRAY");
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i]);
			}
		}
	}
}
