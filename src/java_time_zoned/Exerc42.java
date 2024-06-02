package java_time_zoned;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc42 {
	
	public static void main(String[] args) {
		
		ZoneId spZone = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdtSP = ZonedDateTime.of(2018, 5, 4, 17, 0, 0, 0, spZone);
		
		System.out.println(zdtSP.getZone());
		System.out.println(zdtSP.getOffset());
		
		System.out.println("Before: " + zdtSP);
		
		zdtSP = zdtSP.with(LocalDate.of(2017, 1, 12)).with(LocalTime.NOON);
		System.out.println("After: " + zdtSP);
		
	}
	
}
