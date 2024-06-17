package java_time_arithmetic;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exerc70 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2016, 2, 29);
		System.out.println(date);
		
		LocalDate nextYear = date.plus(1, ChronoUnit.YEARS);
		System.out.println(nextYear);
		
		System.out.println(ChronoUnit.YEARS.between(date, nextYear));
		System.out.println(Period.between(date, nextYear));
		
	}
	
}
