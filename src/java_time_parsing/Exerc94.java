package java_time_parsing;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Exerc94 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser = DateTimeFormatter
				.ofPattern("EEE MMM dd HH:mm:ss z uuuu", Locale.ENGLISH);
		
		System.out.println(
				ZonedDateTime.parse("Sun Jan 07 10:00:00 IST 2018", parser));
		
		Set<ZoneId> setOfZones = new HashSet<>();
		setOfZones.add(ZoneId.of("Asia/Kolkata")); // India
		setOfZones.add(ZoneId.of("Asia/Shanghai")); // China
		
		DateTimeFormatter formatter1 = new DateTimeFormatterBuilder()
				.appendPattern("EEE MMM dd HH:mm:ss ")
				.appendZoneText(TextStyle.SHORT, setOfZones)
				.appendPattern(" uuuu").toFormatter(Locale.ENGLISH);
		
		DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
				.appendPattern("EEE MMM dd HH:mm:ss zzz uuuu")
				.toFormatter(Locale.ENGLISH);
		
		System.out.println("a. " + ZonedDateTime
				.parse("Sun Jan 07 10:00:00 IST 2018", formatter1));
		System.out.println("b. " + ZonedDateTime
				.parse("Sun Jan 07 10:00:00 CST 2018", formatter1));
		
		System.out.println("c. " + ZonedDateTime
				.parse("Sun Jan 07 10:00:00 IST 2018", formatter2));
		System.out.println("d. " + ZonedDateTime
				.parse("Sun Jan 07 10:00:00 CST 2018", formatter2));
	}
	
}
