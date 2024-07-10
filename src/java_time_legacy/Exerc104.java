package java_time_legacy;

import java.time.ZoneId;
import java.util.TimeZone;

public class Exerc104 {
	
	public static void main(String[] args) {
		
		System.out.println(TimeZone.getTimeZone("IST").toZoneId());
		System.out.println(TimeZone.getTimeZone("EST").toZoneId());
		
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		TimeZone timeZone = TimeZone.getTimeZone(zoneId);
		System.out.println(timeZone);
		
	}
	
}
