package com.rays.basic;

public class Newclass {
	public static void main(String[] args) {
	int[] a = { 30, 20, 40, 10, 50, 60 };
	int temp = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}

		}
		System.out.println(a[i]);

	}
	}
}
