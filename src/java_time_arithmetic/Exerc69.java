package java_time_arithmetic;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exerc69 {
	
	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2018, 1, 1);
		LocalDate end = LocalDate.of(2018, 1, 10);
		System.out.println(start);
		System.out.println(end);
		
		long days = ChronoUnit.DAYS.between(end, start);
		System.out.println(days);
		
		Period period = Period.between(end, start);
		System.out.println(period);
		System.out.println(period.isNegative());
		System.out.println(period.negated());
		
	}
	
}
