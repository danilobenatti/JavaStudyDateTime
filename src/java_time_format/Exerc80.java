package java_time_format;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Exerc80 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter1 = DateTimeFormatter
				.ofPattern("HH:mm:ss.SSSSSS");
		
		LocalTime time = LocalTime.of(10, 30, 15, 123400000);
		
		System.out.println(formatter1.format(time));
		
		DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
				.appendPattern("HH:mm:ss")
				.appendFraction(ChronoField.NANO_OF_SECOND, 0, 6, true)
				.toFormatter();
		
		System.out.println(formatter2.format(time));
		
	}
	
}
