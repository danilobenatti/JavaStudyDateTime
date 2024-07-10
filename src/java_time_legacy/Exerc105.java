package java_time_legacy;

import java.sql.Date;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class Exerc105 {
	
	public static void main(String[] args) {
		
		Date date = new java.sql.Date(1525464000000L);
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
		System.out.println(date.toLocalDate());
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
		System.out.println(date.toLocalDate());
		
		System.out.println(Date.valueOf("2018-05-04"));
		
		Instant instant = Instant.now().truncatedTo(ChronoUnit.MILLIS);
		System.out.println(instant);
		
		Clock clock = Clock.tick(Clock.systemDefaultZone(),
				Duration.ofMillis(1));
		System.out.println(Instant.now(clock));
		
	}
	
}
