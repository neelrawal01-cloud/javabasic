package com.rays.basic;
import java.text.SimpleDateFormat;

import java.util.Date;

public class TestDatetoString {
public static void main (String args []) {
  Date d = new Date();
  SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
  String s = sdf.format(d);
  System.out.println(s);
		  
}
}
