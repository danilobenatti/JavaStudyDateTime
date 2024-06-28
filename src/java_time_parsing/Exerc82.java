package java_time_parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Exerc82 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd/MM/uuuu[ HH:mm]");
		
		LocalDateTime dateTime = LocalDateTime.parse("04/05/2018 17:30",
				formatter);
		System.out.println(dateTime);
		
		LocalDate date = dateTime.toLocalDate();
		System.out.println(date.format(formatter));
		
		try {
			OffsetDateTime odt = OffsetDateTime.parse("04/05/2018", formatter);
			System.out.println(odt);
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
