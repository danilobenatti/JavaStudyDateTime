package java_time_parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exerc85 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser = DateTimeFormatter
				.ofPattern("[dd/MM/uuuu][uuuu-MM-dd]");
		
		LocalDate date = LocalDate.parse("2018-05-04", parser);
		System.out.println(date);
		
		System.out.println(LocalDate.parse("04/05/2018", parser));
		
		System.out.println(date.format(parser));
		
	}
	
}
