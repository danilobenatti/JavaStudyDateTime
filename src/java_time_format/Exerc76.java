package java_time_format;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

public class Exerc76 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		Instant now = Instant.now();
		ZonedDateTime zdt = now.atZone(ZoneId.of("America/Sao_Paulo"));
		OffsetDateTime odt = now.atOffset(ZoneOffset.of("-0300"));
		
		try {
			System.out.println(formatter.format(now));
		} catch (UnsupportedTemporalTypeException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(formatter.format(zdt));
		} catch (UnsupportedTemporalTypeException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(formatter.format(odt));
		} catch (UnsupportedTemporalTypeException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
