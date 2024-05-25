package java_time_begin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exerc35 {
	
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2018, Month.MAY, 4);
		
		LocalDate date2 = LocalDate.of(2018, Month.JANUARY, 10);
		
		boolean isDateAfter = date1.isAfter(date2);
		boolean isDateBefore = date1.isBefore(date2);
		
		System.out.println(isDateAfter);
		System.out.println(isDateBefore);
		
		LocalTime time1 = LocalTime.of(0, 0); // 00:00
		LocalTime time2 = LocalTime.of(3, 0); // 03:00
		
		boolean isTimeBefore = time1.isBefore(time2);
		System.out.println(isTimeBefore);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2018, 5, 4, 22, 0);
		LocalDateTime dateTime2 = LocalDateTime.of(2018, 5, 5, 3, 0);
		
		boolean before = dateTime1.isBefore(dateTime2);
		System.out.println(before);
		
		boolean isEquals = LocalDate.of(2018, 5, 4)
				.equals(LocalDate.of(2018, Month.MAY, 4));
		System.out.println(isEquals);
	}
	
}
