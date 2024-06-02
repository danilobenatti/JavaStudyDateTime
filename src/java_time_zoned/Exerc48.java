package java_time_zoned;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc48 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		System.out.println(date);
		
		ZonedDateTime startOfDay = date.atStartOfDay(zoneId);
		System.out.println(startOfDay);
		
		// 2017-10-15 day that daylight saving time begins in São Paulo
		LocalDate date2 = LocalDate.of(2017, 10, 15);
		ZonedDateTime startOfDay2 = date2.atStartOfDay(zoneId);
		System.out.println(startOfDay2);
		
	}
	
}
