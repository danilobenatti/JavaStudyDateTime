package java_time_parsing;

import static java.time.format.DateTimeFormatter.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class Exerc92 {
	
	public static void main(String[] args) {
		
		System.out.println("a." + method1("05/04/2018"));
		System.out.println("b." + method1("05/04/2018 17:30"));
		System.out.println("c." + method1("05/04/2018 17:30-03:00"));
		
		System.out.println("d." + method2("05/04/2018"));
		System.out.println("e." + method2("05/04/2018 17:30"));
		System.out.println("f." + method2("05/04/2018 17:30-0300"));
		
		System.out.println("g." + method3("05/04/2018"));
		System.out.println("h." + method3("05/04/2018 17:30"));
		System.out.println("i." + method3("05/04/2018 17:30-03"));
		
	}
	
	public static String method1(String value) {
		
		DateTimeFormatter parser = ofPattern("dd/MM/uuuu[ HH:mm][XXX]");
		
		TemporalAccessor parsed = parser.parseBest(value, OffsetDateTime::from,
				LocalDateTime::from, LocalDate::from);
		
		String result = null;
		
		if (parsed instanceof LocalDate date) {
			date = (LocalDate) parsed;
			result = date.format(parser);
		}
		
		if (parsed instanceof LocalDateTime dateTime) {
			dateTime = (LocalDateTime) parsed;
			result = dateTime.format(parser);
		}
		
		if (parsed instanceof OffsetDateTime odt) {
			odt = (OffsetDateTime) parsed;
			result = odt.format(parser);
		}
		
		return result;
		
	}
	
	public static String method2(String value) {
		
		DateTimeFormatter parser = new DateTimeFormatterBuilder()
				.append(ofPattern("dd/MM/uuuu"))
				.appendOptional(ofPattern("[ HH:mm]"))
				.appendOptional(ofPattern("[XXX][XX][X]")).toFormatter();
		
		TemporalAccessor parsed = parser.parseBest(value, OffsetDateTime::from,
				LocalDateTime::from, LocalDate::from);
		
		DateTimeFormatter fmt = DateTimeFormatter
				.ofPattern("MMMM d y[ HH:mm:ss][XX]", Locale.of("en", "US"))
				.withZone(ZoneId.of("America/New_York"));
		
		return switch (parsed) {
			case LocalDate d -> d.format(fmt);
			case LocalDateTime dt -> dt.format(fmt);
			case OffsetDateTime odt -> odt.format(fmt);
			default -> throw new IllegalArgumentException(
					"Unexpected value: " + parsed.toString());
		};
		
	}
	
	public static String method3(String value) {
		
		DateTimeFormatter parser = ofPattern("dd/MM/uuuu[ HH:mm][XXX][XX][X]");
		
		TemporalAccessor parsed = parser.parseBest(value, OffsetDateTime::from,
				LocalDateTime::from, LocalDate::from);
		
		return switch (parsed) {
			case LocalDate d -> ISO_LOCAL_DATE.format(d);
			case LocalDateTime dt -> ISO_LOCAL_DATE_TIME.format(dt);
			case OffsetDateTime odt -> ISO_OFFSET_DATE_TIME.format(odt);
			default -> throw new IllegalArgumentException(
					"Unexpected value: " + parsed.toString());
		};
		
	}
	
}
