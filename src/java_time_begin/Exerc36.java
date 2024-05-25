package java_time_begin;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exerc36 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		
		LocalDateTime dateTime = date.atTime(17, 0);
		
		boolean isEquals = date.equals(dateTime.toLocalDate());
		System.out.println(isEquals);
		
	}
	
}
