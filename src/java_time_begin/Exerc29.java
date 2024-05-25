package java_time_begin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exerc29 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalTime time = LocalTime.now();
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		System.out.println(LocalDate.of(2018, 5, 4));
		System.out.println(LocalDateTime.of(2018, 5, 4, 17, 0));
		
		System.out.println(LocalTime.of(17, 0));
		System.out.println(LocalTime.of(7, 0, 45));
		System.out.println(LocalTime.of(0, 0, 0, 123000000));
		
	}
	
}
