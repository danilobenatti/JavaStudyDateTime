package java_time_begin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exerc34 {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(2018, Month.MAY, 4, 10, 0, 35,
				123456000);
		System.out.println(dateTime);
		
		dateTime = dateTime.with(LocalTime.of(17, 30));
		System.out.println(dateTime);
		
		dateTime = dateTime.with(LocalDate.of(2001, 1, 1));
		System.out.println(dateTime);
		
		dateTime = dateTime.withHour(5).withMinute(0);
		System.out.println(dateTime);
		
	}
	
}
