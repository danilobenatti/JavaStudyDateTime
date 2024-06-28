package java_time_parsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Exerc87 {
	
	public static void main(String[] args) {
		
		Map<Long, String> daysWithSuffix = new HashMap<>();
		
		for (int day = 1; day <= 31; day++) {
			String msg = Integer.toString(day);
			switch (day) {
				case 1, 21, 31 -> msg += "st";
				case 2, 22 -> msg += "nd";
				case 3, 23 -> msg += "rd";
				default -> msg += "th";
			}
			daysWithSuffix.put((long) day, msg);
		}
		
		DateTimeFormatter parser = new DateTimeFormatterBuilder()
				.parseCaseInsensitive().appendPattern("MMMM ")
				.appendText(ChronoField.DAY_OF_MONTH, daysWithSuffix)
				.appendPattern(", uuuu").toFormatter(Locale.ENGLISH);
		
		LocalDate date = LocalDate.parse("may 4th, 2018", parser);
		
		System.out.println(date);
		System.out.println(date.format(parser));
		
	}
	
}
