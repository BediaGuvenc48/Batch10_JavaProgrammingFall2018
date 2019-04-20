package day65_Lamda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class PracitceLamda {
	
	public static void main(String[] args) {
	 
	
	LocalDate someBirthday = LocalDate.of(19985, 03, 03); 
	LocalDate otherDate = LocalDate.of(1988, 02, 12); 
	
	System.out.println(someBirthday);
	System.out.println(otherDate);
	
	LocalTime cybertekCourse = LocalTime.of(05, 30); 
	System.out.println(cybertekCourse);
	
	LocalDateTime rightNow = LocalDateTime.of(2019, Month.APRIL,11,10,03); 
	
	System.out.println(rightNow);

	LocalDateTime twoYearsLater = rightNow.plusYears(2); 
	LocalDateTime threeweeksLater = rightNow.plusDays(21); 
	
	System.out.println(twoYearsLater);
	System.out.println(threeweeksLater);
	
	LocalDateTime ld = twoYearsLater.plusYears(2).minusMonths(5); 
	System.out.println(ld);
	
	
	}
	
	
}
