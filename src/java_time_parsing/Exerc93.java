package java_time_parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Exerc93 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2018-05-04");
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime
				.parse("2018-05-04T17:30:45.123456789");
		System.out.println(dateTime);
		
		OffsetDateTime odt = OffsetDateTime.parse("2018-05-04T17:30:45-03:00");
		System.out.println(odt);
		
		ZonedDateTime zdt = ZonedDateTime
				.parse("2018-05-04T17:30:45-03:00[America/Sao_Paulo]");
		System.out.println(zdt);
		
		DateTimeFormatter parser = new DateTimeFormatterBuilder()
				.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
				.appendPattern("[XXX][XX][X]").toFormatter();
		
		System.out.println(OffsetDateTime.parse("2018-05-04T10:00-03", parser));
		
	}
	
}
