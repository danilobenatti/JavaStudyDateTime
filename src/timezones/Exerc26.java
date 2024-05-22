package timezones;

import java.util.Calendar;
import java.util.TimeZone;

public class Exerc26 {
	
	private static final TimeZone TZ = TimeZone.getTimeZone("Pacific/Apia");
	
	public static void main(String[] args) {
		
		System.out.println(TimeZone.getDefault().getID());
		
		TimeZone.setDefault(TZ);
		
		Calendar calendar = Calendar.getInstance();
//		calendar.setTimeZone(TZ);
		
		calendar.set(2011, Calendar.DECEMBER, 27);
		
		System.out.println(calendar.getTimeZone().getID());
		
		do {
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		} while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY);
		
		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.getTime());
		
	}
	
}
