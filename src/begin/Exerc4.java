package begin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Exerc4 {
	
	public static void main(String[] args) {
		
		String str = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
		SimpleDateFormat iso8601Format = new SimpleDateFormat(str);
		iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(iso8601Format.format(new Date()));
		
	}
	
}
