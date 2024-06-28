package java_time_parsing;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class Exerc83 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter parser = DateTimeFormatter
				.ofPattern("dd/MM/uuuu HH:mm");
		
		String dateTime = "04/05/2018 17:30";
		
		TemporalAccessor parsed = parser.parse(dateTime);
		
		System.out.println(parsed.get(ChronoField.DAY_OF_MONTH));
		
		System.out.println(itsWeekend(parser.parse(dateTime)));
		
		System.out.println(parser.parse(dateTime, isWeekend));
		
		System.out.println(parser.parse(dateTime, DayOfWeek::from));
		
	}
	
	public static boolean itsWeekend(TemporalAccessor temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.from(temporal);
		return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
	}
	
	public static final TemporalQuery<Boolean> isWeekend = temporal -> {
		DayOfWeek dayOfWeek = DayOfWeek.from(temporal);
		return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
	};
	
}
