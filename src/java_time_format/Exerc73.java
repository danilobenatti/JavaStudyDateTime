package java_time_format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

public class Exerc73 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		
		try {
			System.out.println(formatter.format(LocalDate.now()));
		} catch (UnsupportedTemporalTypeException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
