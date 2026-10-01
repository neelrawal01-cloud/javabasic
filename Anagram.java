package com.rays.basic;

import java.util.Arrays;

public class Anagram {
 public static void main(String [] args) {
	 String a = "hell";
	 String b = "lleh";
	 
	 String c = a.toLowerCase();
	 String d = b.toLowerCase();
	 
	 char [] cc = c.toCharArray();
	 char [] dd = d.toCharArray();
	 
	 Arrays.sort(cc);
	 Arrays.sort(dd);
	 if(Arrays.equals(cc, dd)) {
		 System.out.println("are anagrame");
	 }
	 else {
		 System.out.println("not ");
	 }
 }
}
