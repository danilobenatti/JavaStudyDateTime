package java_time_format;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Exerc75 {
	
	public static void main(String[] args) {
		
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
		
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd/MM/uuuu HH:mm");
		
		System.out.println(formatter.format(now.withYear(2018).withMonth(5)
				.withDayOfMonth(4).withHour(17).withMinute(0)));
		
	}
	
}
