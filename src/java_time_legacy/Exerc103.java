package java_time_legacy;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exerc103 {
	
	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(instant.toEpochMilli());
		System.out.println(calendar);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		GregorianCalendar cal = GregorianCalendar.from(zdt);
		ZonedDateTime zonedDt = cal.toZonedDateTime();
		System.out.println(zonedDt);
		
	}
	
}
