package timezones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Exerc24 {
	
	// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
	public static void main(String[] args) throws ParseException {
		
		// +02:00 in milliseconds
		long offsetRef = TimeUnit.MILLISECONDS.convert(2, TimeUnit.HOURS);
		
		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		
		// 2018-05-04T17:00:00.000-03:00
		long date = formatter.parse("2018-05-04T17:00:00.000-0300").getTime();
		
		for (String value : TimeZone.getAvailableIDs()) {
			int offset = TimeZone.getTimeZone(value).getOffset(date);
			if (offsetRef == offset) {
				System.out.println(value);
			}
		}
		
	}
	
}
