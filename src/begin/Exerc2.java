package begin;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class Exerc2 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.getTimeInMillis());
		
		cal.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.getTimeInMillis());
		
		Calendar calendarSP = Calendar
				.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
		System.out.println(calendarSP.getTimeZone());
		
		System.out.println(Arrays.asList(TimeZone.getAvailableIDs()));
		
		TimeZone.getTimeZone("GMT+03:00");// offset
		
		Calendar calendar = Calendar.getInstance();
		calendar.setLenient(false);
		if (calendar.isLenient()) {
			calendar.set(Calendar.DAY_OF_MONTH, 33);
		}
		
	}
}
