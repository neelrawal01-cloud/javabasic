package com.rays.basic;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestStringtoDate {
	public static void main(String[] args)  throws ParseException {
		
		 String str = "01/01/2026";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(str);
		System.out.println(d);
}
}
