package java_time_format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Exerc81 {
	
	public static void main(String[] args) {
		
		Map<Long, String> namesOfDays = new HashMap<>();
		namesOfDays.put(1L, "First");
		
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
				.appendText(ChronoField.DAY_OF_MONTH, namesOfDays)
				.appendPattern(" 'of' MMMM").toFormatter(Locale.of("en", "US"));
		
		System.out.println(LocalDate.of(2018, 5, 4).format(formatter));
		System.out.println(LocalDate.of(2018, 5, 1).format(formatter));
		
	}
	
}
