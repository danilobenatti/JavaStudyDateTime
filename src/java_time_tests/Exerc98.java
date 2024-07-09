package java_time_tests;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exerc98 {
	
	public static void main(String[] args) {
		
		ZonedDateTime zdt = ZonedDateTime
				.parse("2018-05-04T20:00:00Z");
		
		Instant reference = Instant
				.now(Clock.fixed(zdt.toInstant(), zdt.getZone()));
		
		ZoneOffset offset = ZoneOffset.ofHours(2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("z");
		
		ZoneId.getAvailableZoneIds().stream().map(ZoneId::of).forEach(zone -> {
			if (offset.equals(zone.getRules().getOffset(reference))) {
				System.out.println(
						"timezone uses the offset +02:00 at the reference instant");
			}
			for (Locale locale : Locale.getAvailableLocales()) {
				String abrev = formatter.withLocale(locale)
						.format(reference.atZone(zone));
				if ("EST".equals(abrev)) {
					System.out.println(
							"timezone uses the abbreviation EST at the instant of reference");
				}
			}
		});
	}
	
}
