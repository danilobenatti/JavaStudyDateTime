package java_time_arithmetic;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exerc59 {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(2018, 5, 4, 17, 0);
		
		LocalDateTime nextDay = dateTime.plusDays(1);
		System.out.println(nextDay);
		
		LocalDateTime minus3Hours = dateTime.minusHours(3);
		System.out.println(minus3Hours);
		
		LocalDate date = LocalDate.of(2018, 1, 31);
		System.out.println(date);
		LocalDate date2 = date.plusMonths(1);
		System.out.println(date2);
		
	}
	
}
