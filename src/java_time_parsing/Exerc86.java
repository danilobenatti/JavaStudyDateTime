package java_time_parsing;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Exerc86 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter1 = DateTimeFormatter
				.ofPattern("dd/MM/uuuu HH:mm[X][XX][XXX]");
		DateTimeFormatter formatter2 = DateTimeFormatter
				.ofPattern("dd/MM/uuuu HH:mm[XXX][XX][X]");
		try {
			System.out.println(
					OffsetDateTime.parse("04/05/2018 17:30-03:00", formatter1));
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(
					OffsetDateTime.parse("04/05/2018 17:30-03:00", formatter2));
			System.out.println(
					OffsetDateTime.parse("04/05/2018 17:30-0300", formatter2));
			System.out.println(
					OffsetDateTime.parse("04/05/2018 17:30-03", formatter2));
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
