package begin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Exerc5 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.getTime());
		
		String dateFormatted = formatter.format(date);
		System.out.println(dateFormatted);
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		parser.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		
		try {
			Date dateParsed = parser.parse("25/04/2024");
			System.out.println(dateParsed);
			System.out.println(dateParsed.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 17);
		Date date2 = cal.getTime();
		System.out.println(date2);
		System.out.println(date2.getTime());
	}
	
}
