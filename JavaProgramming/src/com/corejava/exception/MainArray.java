package com.corejava.exception;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainArray {
	public static void main(String[] args) {
		int size = 0;
		ArrayOperations ao = new ArrayOperations();
		System.out.println("--Enter size of ARRAY--");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			size = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] arr = new int[size];
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		for (int i = 0; i < size; i++) {
			try {
				arr[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ao.sortArray(arr);
		int res = ao.sumOfArray(arr);
		System.out.println("SUM OF ELEMENTS IS :" + res);
	}
}
