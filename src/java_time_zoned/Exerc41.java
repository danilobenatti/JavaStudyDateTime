package java_time_zoned;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc41 {
	
	public static void main(String[] args) {
		
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime zdt = ZonedDateTime.of(2018, 2, 17, 23, 0, 0, 0, zoneId);
		
		System.out.println(zdt);
		System.out.println(zdt.withEarlierOffsetAtOverlap());
		System.out.println(zdt.withLaterOffsetAtOverlap());
		
	}
	
}
