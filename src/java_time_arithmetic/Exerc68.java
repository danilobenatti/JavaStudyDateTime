package java_time_arithmetic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Exerc68 {
	
	public static void main(String[] args) {
		
		LocalDateTime start = LocalDateTime.of(2018, 1, 1, 11, 0);
		LocalDateTime end = LocalDateTime.of(2018, 2, 10, 10, 0);
		System.out.println(start);
		System.out.println(end);
		
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		System.out.println(period);
		
		Duration duration = Duration.between(start, end);
		System.out.println(duration);
		
	}
	
}
