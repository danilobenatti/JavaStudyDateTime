package java_time_format;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exerc78 {
	
	public static void main(String[] args) {
		
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"))
				.withYear(2018).withMonth(5).withDayOfMonth(4).withHour(17)
				.withMinute(0).withSecond(0).withNano(0);
		
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
		
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("uuuu-MM-dd'T'HH:mm:ssXX");
		System.out.println(now.format(formatter));
		
	}
	
}
