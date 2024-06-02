package java_time_zoned;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc45 {
	
	public static void main(String[] args) {
		
		ZoneId spZoneId = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime spDateTime = ZonedDateTime.of(2018, 5, 4, 17, 0, 0, 0,
				spZoneId);
		
		ZoneId tkZoneId = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tkDateTime = spDateTime.withZoneSameInstant(tkZoneId);
		
		System.out.println(spDateTime);
		System.out.println(tkDateTime);
		
		ZonedDateTime dateTime1 = ZonedDateTime.now(spZoneId);
		ZonedDateTime dateTime2 = dateTime1.withZoneSameInstant(tkZoneId);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
	}
	
}
