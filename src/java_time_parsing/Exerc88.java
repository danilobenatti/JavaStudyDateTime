package java_time_parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Exerc88 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.LENIENT);
		
		LocalDate date = LocalDate.parse("33/01/2018", parser);
		
		System.out.println(date);
		
	}
	
}
