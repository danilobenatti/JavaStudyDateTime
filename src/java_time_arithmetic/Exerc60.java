package java_time_arithmetic;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Exerc60 {
	
	public static void main(String[] args) {
		
		ZonedDateTime dateTime = ZonedDateTime.of(2017, 10, 14, 10, 0, 0, 0,
				ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(dateTime.plusDays(1));
		System.out.println(dateTime.plusHours(24));
		
		LocalTime time = LocalTime.of(10, 30, 0, 123456789);
		time = time.plus(200, ChronoUnit.MILLIS);
		System.out.println(time);
		
		try {
			LocalTime localTime = LocalTime.now().plus(1, ChronoUnit.MONTHS);
			System.out.println(localTime);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		boolean supported = LocalTime.now().isSupported(ChronoUnit.MONTHS);
		System.out.println(supported);
		
	}
	
}
