package java_timestamp;

import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Exerc56 {
	
	public static void main(String[] args) {
		
		Instant instant = Instant.ofEpochSecond(1525464000L);
		System.out.println(instant);
		
		instant = Instant.ofEpochSecond(1525464000L)
				.with(ChronoField.MILLI_OF_SECOND, 123);
		System.out.println(instant);
		
		LocalTime time = LocalTime.of(17, 0);
		time = time.with(ChronoField.SECOND_OF_DAY, 100);
		System.out.println(time);
		
	}
	
}
