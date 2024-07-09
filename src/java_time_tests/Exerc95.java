package java_time_tests;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc95 {
	
	public static void main(String[] args) {
		
		ZonedDateTime nowFixed = ZonedDateTime
				.parse("2018-05-04T17:00-03:00[America/Sao_Paulo]");
		
		Clock clock = Clock.fixed(nowFixed.toInstant(), nowFixed.getZone());
		
		System.out.println(LocalDate.now(clock));
		System.out.println(OffsetDateTime.now(clock));
		System.out.println(Instant.now(clock));
		
		Clock clockNew = clock.withZone(ZoneId.of("Asia/Tokyo"));
		
		System.out.println(LocalDate.now(clockNew));
		
	}
	
}
