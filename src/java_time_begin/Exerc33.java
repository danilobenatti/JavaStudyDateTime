package java_time_begin;

import static java.time.DayOfWeek.*;
import static java.time.Month.MAY;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exerc33 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, MAY, 4);
		
		LocalDate nextFriday = date.with(nextOrSame(FRIDAY));
		System.out.println(nextFriday);
		
		LocalDate thirdThursdayOfMonth = date
				.with(TemporalAdjusters.dayOfWeekInMonth(3, THURSDAY));
		System.out.println(thirdThursdayOfMonth);
		
		LocalDate firstSaturdayOfMonth1 = date.with(firstInMonth(SATURDAY));
		System.out.println(firstSaturdayOfMonth1);
		
		LocalDate firstSaturdayOfMonth2 = date
				.with(dayOfWeekInMonth(1, SATURDAY));
		System.out.println(firstSaturdayOfMonth2);
		
		LocalDate lastSaturdayOfMonth1 = date.with(lastInMonth(SATURDAY));
		System.out.println(lastSaturdayOfMonth1);
		
		LocalDate lastSaturdayOfMonth2 = date
				.with(dayOfWeekInMonth(-1, SATURDAY));
		System.out.println(lastSaturdayOfMonth2);
		
	}
	
}
