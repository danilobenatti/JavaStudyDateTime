package java_time_zoned;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc43 {
	
	public static void main(String[] args) {
		
		ZoneId spZone = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdtSP = ZonedDateTime.of(2018, 5, 4, 17, 0, 0, 0, spZone);
		System.out.println(zdtSP);
		
		ZoneId tkZone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zdtTK = ZonedDateTime.of(2018, 5, 5, 5, 0, 0, 0, tkZone);
		System.out.println(zdtTK);
		
		System.out.println(zdtSP.equals(zdtTK));
		System.out.println(zdtSP.isEqual(zdtTK));
		
	}
	
}
