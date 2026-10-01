package com.rays.basic;
import java.time.LocalDate;
public class TestLocalDate {
public static void main (String [] args) {
	LocalDate now = LocalDate.now();
	System.out.println("now:" + now);
     System.out.println(now.getDayOfMonth());
     System.out.println(now.getDayOfMonth());
     System.out.println(now.getMonth());
     System.out.println(now.getDayOfYear());
     System.out.println(now.getYear());
      
     LocalDate dob = LocalDate.of(2000, 10, 5);
     
     System.out.println("now:" + dob);
     System.out.println(dob.getDayOfMonth());
     System.out.println(dob.getDayOfMonth());
     System.out.println(dob.getMonth());
     System.out.println(dob.getDayOfYear());
     System.out.println(dob.getYear());
System.out.println("age:" +(now.getYear() - dob.getYear())); 

}
}
