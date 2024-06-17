package java_time_arithmetic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exerc67 {
	
	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2018, 1, 1);
		LocalDate end = LocalDate.of(2018, 1, 10);
		long days = ChronoUnit.DAYS.between(start, end);
		System.out.println(days);
		
		LocalDateTime dtStart = LocalDateTime.of(2018, 1, 1, 11, 0);
		LocalDateTime dtEnd = LocalDateTime.of(2018, 1, 2, 10, 59, 59,
				999999999);
		
		long dtDays1 = ChronoUnit.DAYS.between(dtStart, dtEnd);
		System.out.println(dtDays1);
		
		long dtDays2 = ChronoUnit.DAYS.between(dtStart.toLocalDate(),
				dtEnd.toLocalDate());
		System.out.println(dtDays2);
		
	}
	
}
