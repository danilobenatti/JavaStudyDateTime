package java_timestamp;

import java.time.Instant;

public class Exerc52 {
	
	public static void main(String[] args) {
		
		Instant instant = Instant.ofEpochMilli(1525464000000L);
		Instant instant2 = Instant.ofEpochSecond(1525464000L, 123456789L);
		
		System.out.println(instant);
		System.out.println(instant2);
		System.out.println(instant2.getNano());
		System.out.println(instant2.toEpochMilli());
		
	}
	
}
