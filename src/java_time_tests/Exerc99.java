package java_time_tests;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class Exerc99 {
	
	public static void main(String[] args) {
		
		TemporalAdjuster adjuster = temporal -> {
			return temporal.plus(3, ChronoUnit.MONTHS)
					.with(ChronoField.DAY_OF_MONTH, 1);
		};
		
		LocalDate date = LocalDate.of(2018, 5, 4).with(adjuster);
		System.out.println(date);
		
	}
	
}
