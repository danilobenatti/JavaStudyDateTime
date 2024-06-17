package java_time_arithmetic;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.threeten.extra.PeriodDuration;

public class Exerc66 {
	
	public static void main(String[] args) {
		
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime dateTime = ZonedDateTime.of(2017, 10, 14, 10, 0, 0, 0,
				zoneId);
		System.out.println(dateTime.plus(Period.ofDays(1)));
		System.out.println(dateTime.plus(Duration.ofDays(1)));
		
		PeriodDuration periodDuration = PeriodDuration.between(dateTime,
				dateTime.plusHours(2).plusDays(1));
		System.out.println(periodDuration.normalizedStandardDays());
		
	}
	
}
