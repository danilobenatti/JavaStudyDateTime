package java_time_zoned;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc49 {
	
	public static void main(String[] args) {
		
		// 2018-05-04T17:00-03:00[America/Sao_Paulo]
		LocalDateTime localDateTime = LocalDateTime.of(2018, 5, 4, 17, 0);
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(localDateTime, zoneId);
		
		OffsetDateTime odt = zdt.toOffsetDateTime();
		
		System.out.println(zdt);
		System.out.println(odt);
		
	}
	
}
