package java_time_legacy;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Exerc102 {
	
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		Date date2 = Date.from(date1.atTime(10, 0)
				.atZone(ZoneId.of("America/Sao_Paulo")).toInstant());
		System.out.println(date2);
		
	}
	
}
