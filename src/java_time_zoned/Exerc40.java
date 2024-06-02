package java_time_zoned;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc40 {
	
	public static void main(String[] args) {
		
		ZoneId zoneSP = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(2017, 10, 15, 0, 30, 0,
				0, zoneSP);
		System.out.println(zonedDateTime);
		
		ZoneId zone = ZoneId.of("Australia/Lord_Howe");
		ZonedDateTime z = ZonedDateTime.of(2018, 10, 7, 2, 10, 0, 0, zone);
		System.out.println(z);
		
	}
	
}
