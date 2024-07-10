package java_time_legacy;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Exerc100 {
	
	public static void main(String[] args) {
		
		Date date1 = new Date();
		
		Instant instant1 = date1.toInstant();
		
		System.out.println(date1);
		System.out.println(Date.from(instant1));
		
		Instant instant2 = Instant.parse("2018-01-01T10:00:00.123456789Z");
		Date date2 = Date.from(instant2);
		int nano = instant2.getNano();
		
		System.out.println(date2);
		System.out.println(nano);
		
		Instant instant3 = date2.toInstant().with(ChronoField.NANO_OF_SECOND,
				nano);
		System.out.println(instant3);
		
	}
	
}
