package java_time_parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;

public class Exerc90 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy")
				.withResolverStyle(ResolverStyle.LENIENT);
		
		try {
			LocalDate date = LocalDate.parse("10/02/2018", parser);
			
			DateTimeFormatter formatter = new DateTimeFormatterBuilder()
					.appendPattern("dd/MM/yyyy")
					.parseDefaulting(ChronoField.ERA, 1).toFormatter()
					.withResolverStyle(ResolverStyle.STRICT);
			
			Map<Long, String> map = new HashMap<>();
			map.put(0L, "AC"); // before
			map.put(1L, "DC"); // after
			DateTimeFormatter dtf = new DateTimeFormatterBuilder()
					.appendText(ChronoField.ERA, map).toFormatter();
			
			System.out.println(date);
			System.out.println(LocalDate.parse("10/02/2018", formatter));
			System.out.println(dtf.format(LocalDate.of(-2018, 02, 10)));
			
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
