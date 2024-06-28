package java_time_parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Exerc89 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser1 = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.LENIENT);
		DateTimeFormatter parser2 = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.SMART);
		DateTimeFormatter parser3 = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.STRICT);
		
		try {
			LocalDate date = LocalDate.parse("31/04/2018", parser1);
			System.out.println(date);
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			LocalDate date = LocalDate.parse("31/04/2018", parser2);
			System.out.println(date);
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			LocalDate date = LocalDate.parse("33/04/2018", parser2);
			System.out.println(date);
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			LocalDate date = LocalDate.parse("31/04/2018", parser3);
			System.out.println(date);
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
