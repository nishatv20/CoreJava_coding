package com.corejava.interview;

public class DeleteArrayElem {
	void deleteArrayEl(int[] a, int pos) {
		int size = a.length;
		int index = pos - 1;
		int[] b = new int[size - 1];
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		int k = index;
		for (int j = pos; j < size; j++) {
			b[k] = a[j];
			k++;
		}
		System.out.println("NEW ARRAY-->");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		DeleteArrayElem dl = new DeleteArrayElem();
		dl.deleteArrayEl(a, 3);
	}
}
