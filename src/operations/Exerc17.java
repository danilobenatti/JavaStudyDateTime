package operations;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Exerc17 {
	
	public static void main(String[] args) {
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
		Locale aLocale = Locale.of("pt", "BR");
		Calendar calendar = Calendar.getInstance(timeZone, aLocale);
		
		calendar.set(2018, Calendar.JANUARY, 31);
		
		calendar.add(Calendar.MONTH, 1);
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.MONTH, -1);
		System.out.println(calendar.getTime());
	}
	
}
