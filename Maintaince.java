package com.rays.basic;


import java.util.Calendar;
import java.util.Date;
public class Maintaince {
public static void main (String [] args) {
	
Calendar cal = Calendar.getInstance();
for(int i = 1; i<= 12;i++) {
	
	
	cal.add(Calendar.MONTH, 2);
	
	Date neww = cal.getTime();
	

System.out.println(neww);

}

}
}
