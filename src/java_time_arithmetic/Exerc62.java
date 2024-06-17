package java_time_arithmetic;

import java.time.Duration;
import java.time.format.DateTimeParseException;

public class Exerc62 {
	
	public static void main(String[] args) {
		
		System.out.println(Duration.parse("PT10M"));
		System.out.println(Duration.parse("PT10M").toSeconds());
		System.out.println(Duration.ofMinutes(10));
		
		try {
			System.out.println(Duration.parse("P1Y"));
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(Duration.parse("P1M"));
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(Duration.parse("P1D"));
		
	}
	
}
