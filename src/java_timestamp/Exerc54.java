package java_timestamp;

import static java.time.temporal.ChronoField.MINUTE_OF_DAY;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Exerc54 {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(2018, 5, 4, 17, 0);
		int monthOfYear = dateTime.get(ChronoField.MONTH_OF_YEAR);
		int minuteOfHour = dateTime.get(ChronoField.MINUTE_OF_HOUR);
		
		System.out.println(monthOfYear);
		System.out.println(minuteOfHour);
		
		int minuteOfDay = dateTime.get(MINUTE_OF_DAY);
		
		System.out.println(minuteOfDay);
		
		Instant instant = Instant.ofEpochSecond(1525464000L, 123456789);
		int milliseconds = instant.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(milliseconds);
		
		ValueRange range = dateTime.range(ChronoField.NANO_OF_DAY);
		System.out.println(range);
		System.out.println(range.isIntValue());
		
		long nanosSecondsOfDay = dateTime.getLong(ChronoField.NANO_OF_DAY);
		System.out.println(nanosSecondsOfDay);
		
		System.out.println(
				LocalDate.of(2018, 2, 1).range(ChronoField.DAY_OF_MONTH));
		System.out.println(
				LocalDate.of(2020, 2, 1).range(ChronoField.DAY_OF_MONTH));
		
	}
	
}
