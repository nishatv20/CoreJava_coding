package com.corejava.interview;

public class DeleteDuplicate {
	void delDuplicate(int[] arr) {
		int size = arr.length;
		int visited = -1;
		int[] freq = new int[size];

		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}
		int arr_size = size;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == -1) {
				arr_size--;
			}
		}
		int[] new_arr = new int[arr_size];
		int z = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != -1) {
				new_arr[z] = arr[i];
				System.out.println("RANDOM" + arr[i]);
				z++;
			}

		}
		System.out.println("---ARRAY AFTER DUPLICATE DELETION---");
		for (int i = 0; i < new_arr.length; i++) {
			System.out.println(new_arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 20, 30, 40 };
		DeleteDuplicate dd = new DeleteDuplicate();
		dd.delDuplicate(arr);
	}
}
