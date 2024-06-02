package java_time_zoned;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc47 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		LocalTime time = LocalTime.of(10, 0);
		
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime spDateTime1 = date.atTime(10, 0).atZone(zoneId);
		System.out.println(spDateTime1);
		
		ZonedDateTime spDateTime2 = ZonedDateTime.of(date, time, zoneId);
		System.out.println(spDateTime2);
		
	}
	
}
