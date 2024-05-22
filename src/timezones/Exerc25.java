package timezones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public class Exerc25 {
	
	public static void main(String[] args) throws ParseException {
		
		String abrev = "EST";
		
		// 2018-05-04T17:00:00.000-03:00
		long date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
				.parse("2018-05-04T17:00:00.000-0300").getTime();
		
		Set<String> timezones = new HashSet<>();
		
		for (Locale locale : Locale.getAvailableLocales()) {
			
			SimpleDateFormat formatter = new SimpleDateFormat("z", locale);
			
			for (String id : TimeZone.getAvailableIDs()) {
				formatter.setTimeZone(TimeZone.getTimeZone(id));
				if (abrev.equals(formatter.format(date))) {
					timezones.add(id);
				}
			}
		}
		System.out.println(timezones);
	}
	
}
