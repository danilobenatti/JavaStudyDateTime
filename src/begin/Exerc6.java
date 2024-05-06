package begin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exerc6 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat parserWithLocale = new SimpleDateFormat("dd/MMM/yyyy",
				Locale.ENGLISH);
		
		try {
			Date date = parser.parse("17/02/2018 23:00");
			SimpleDateFormat iso8607Format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
			System.out.println(iso8607Format.format(date));
			System.out.println(parserWithLocale.parse("01/Oct/2017"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
