package java_time_parsing;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Exerc84 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser = new DateTimeFormatterBuilder()
				.appendPattern("dd/MM/uuuu[ HH:mm]")
				.parseDefaulting(ChronoField.HOUR_OF_DAY, 10)
				.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 30)
				.parseDefaulting(ChronoField.OFFSET_SECONDS,
						ZoneOffset.ofHours(-3).getTotalSeconds())
				.toFormatter();
		
		OffsetDateTime dateTime = OffsetDateTime.parse("04/05/2018", parser);
		System.out.println(dateTime);
		
		dateTime = OffsetDateTime.parse("04/05/2018 17:20", parser);
		System.out.println(dateTime);
		
	}
	
}
