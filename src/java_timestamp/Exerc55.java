package java_timestamp;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class Exerc55 {
	
	public static void main(String[] args) {
		
		Instant instant = Instant.ofEpochSecond(1525464000L);
		
		if (instant.isSupported(ChronoField.HOUR_OF_DAY)) {
			System.out.println(instant.get(ChronoField.HOUR_OF_DAY));
		}
		
		ZonedDateTime sp = instant.atZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println(sp);
		
		OffsetDateTime odt = instant.atOffset(ZoneOffset.of("+05:00"));
		System.out.println(odt);
		
	}
	
}
