package java_time_legacy;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Exerc101 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		LocalDate localDate = date.toInstant()
				.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDate();
		System.out.println(localDate);
		
	}
	
}
