package java_time_format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exerc72 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(-10, 1, 1);
		
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("uuuu yyyy GGGG");
		
		System.out.println(formatter.format(date));
		
	}
	
}
