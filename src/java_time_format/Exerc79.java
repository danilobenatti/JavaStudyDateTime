package java_time_format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exerc79 {
	
	public static void main(String[] args) {
		
		// date is mandatory, time is optional
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd/MM/uuuu[ HH:mm:ss]");
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		LocalDateTime dateTime = date.atTime(17, 30);
		
		System.out.println(formatter.format(date));
		System.out.println(formatter.format(dateTime));
		
	}
	
}
