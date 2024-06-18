package java_time_format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Exerc71 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		System.out.println(formatter.format(date));
		System.out.println(date.format(formatter));
		
	}
	
}
