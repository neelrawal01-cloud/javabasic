package com.rays.basic;
import java.time.LocalDate;
import java.time.Period;
public class TestTimeperiod {
public static void main (String [] main) {
	 LocalDate noww = LocalDate.now();
	 System.out.println(noww);
    
	 LocalDate dob = LocalDate.of(2000, 12, 4);
	 System.out.println(dob);
	 Period period = Period.between(noww, dob);
	 System.out.println(period.getYears() + " year " + period.getMonths() + "months"  + period.getDays() + "days");
	 
}
}
