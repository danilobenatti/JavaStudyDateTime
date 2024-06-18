package java_time_format;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exerc77 {
	
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.of("Asia/Tokyo");
		
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd/MM/uuuu HH:mm").withZone(zone);
		
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println(formatter.format(now));
		
		ZonedDateTime zdt = now.atZone(zone).withYear(2018).withMonth(5)
				.withDayOfMonth(4).withHour(20).withMinute(0).withSecond(0)
				.withNano(0);
		
		System.out.println(formatter.format(zdt));
		
	}
	
}
