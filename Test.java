package com.rays.basic;

//import java.util.*;

public class Test {
	public static void main(String[] args) {

		String s1 = "neel ";
		int aa = 0;
		int count = 0;
		int no = 0;
		for (int i = 0; i < s1.length();i++) {
			char ch = s1.charAt(i);

			if (ch == 'l') {

				aa++;
			}

			else if (ch == 'e') {

				count++;

		} else if (ch == 'n') {

				no++;
			}

		}
		System.out.println(" l = " + aa);		// System.out.println("vowels = " + vowels);
		System.out.println(" e = " + count);
		System.out.println("n = " + no);

		
	}
}
