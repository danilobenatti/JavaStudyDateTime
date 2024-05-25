package java_time_begin;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Exerc32 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, Month.MAY, 4).withDayOfMonth(1);
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.of(2018, 5, 4, 17, 0, 35,
				123000000);
		LocalDateTime newDateTime = dateTime.withDayOfMonth(1).withYear(2015)
				.withHour(10).withMinute(30);
		System.out.println(newDateTime);
		
		LocalDate lastDayOfMay = date.with(lastDayOfMonth());
		System.out.println(lastDayOfMay);
		System.out.println(lastDayOfMay.getDayOfMonth());
		
	}
	
}
