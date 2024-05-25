package timezones;

import java.util.Calendar;
import java.util.TimeZone;

public class Exerc26 {
	
	private static final TimeZone TZ = TimeZone.getTimeZone("Pacific/Apia");
	
	public static void main(String[] args) {
		
		// show the TimeZone default (Example: 'America/Sao_Paulo')
		System.out.println(TimeZone.getDefault().getID());
		
		Calendar calendar = Calendar.getInstance();
		// calendar use TimeZone 'Pacific/Apia'
		calendar.setTimeZone(TZ);
		
		calendar.set(2011, Calendar.DECEMBER, 27);
		
		System.out.println(calendar.getTimeZone().getID());
		
		do {
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		} while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY);
		
		// show Date, but converted TimeZone for 'default'
		System.out.println(calendar.getTime()); // 5 of January
		
		// change TimeZone for 'Pacific/Apia'
		TimeZone.setDefault(TZ);
		System.out.println(calendar.getTime()); // 6 of January
		
	}
	
}
