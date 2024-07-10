package java_time_legacy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Exerc106 {
	
	public static void main(String[] args) {
		
		ZonedDateTime date = LocalDate.of(2009, 6, 19).atTime(LocalTime.MAX)
				.atZone(ZoneId.of("Asia/Dhaka"));
		System.out.println(date);
		
		ZonedDateTime endOfDay = LocalDate.of(2009, 6, 19).plusDays(1)
				.atStartOfDay(ZoneId.of("Asia/Dhaka")).minusNanos(1);
		
		System.out.println(endOfDay);
		System.out.println(endOfDay.plusNanos(1));
		
		System.out.println(Date.from(endOfDay.toInstant()));
		
	}
	
}
