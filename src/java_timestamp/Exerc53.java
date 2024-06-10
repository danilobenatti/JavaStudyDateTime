package java_timestamp;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Exerc53 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		
		ZonedDateTime zdt = date.atStartOfDay(ZoneId.of("America/Sao_Paulo"));
		
		System.out.println(date);
		System.out.println(zdt);
		System.out.println(zdt.toInstant());
		
		OffsetDateTime odt = date.atTime(0, 0).atOffset(ZoneOffset.of("+0500"));
		
		System.out.println(odt);
		System.out.println(odt.toInstant());
		
		System.out.println(odt.isBefore(zdt.toOffsetDateTime()));
		System.out.println(odt.isAfter(zdt.toOffsetDateTime()));
		System.out.println(odt.equals(zdt.toOffsetDateTime()));
		System.out.println(odt.compareTo(zdt.toOffsetDateTime()));
	}
	
}
