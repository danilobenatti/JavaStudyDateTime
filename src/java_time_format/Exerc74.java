package java_time_format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exerc74 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		
		DateTimeFormatter formatterPtBR = DateTimeFormatter
				.ofPattern("dd 'de' MMMM 'de' uuuu", Locale.of("pt", "BR"));
		System.out.println(formatterPtBR.format(date));
		
		DateTimeFormatter formatterEnUS = formatterPtBR
				.withLocale(Locale.of("en", "US"));
		System.out.println(formatterEnUS.format(date));
		
	}
	
}
