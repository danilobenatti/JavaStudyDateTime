package java_time_zoned;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc46 {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(2018, 5, 4, 17, 0);
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime zonedDateTime1 = dateTime.atZone(zoneId);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(dateTime, zoneId);
		
		System.out.println(zonedDateTime1);
		System.out.println(zonedDateTime2);
	}
	
}
