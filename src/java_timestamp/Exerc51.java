package java_timestamp;

import java.time.Instant;

public class Exerc51 {
	
	public static void main(String[] args) {
		
		Instant now = Instant.now();
		
		System.out.println(now);
		System.out.println(now.toEpochMilli());
		System.out.println(System.currentTimeMillis());
		
		System.out.println(now.getEpochSecond());
		System.out.println(now.getNano());
		
		Instant instant = Instant.parse("2018-05-04T17:00:00-03:00");
		System.out.println(instant);
		System.out.println(instant.toEpochMilli());
		System.out.println(instant.getNano());
		System.out.println(instant.getEpochSecond());
		
	}
	
}
