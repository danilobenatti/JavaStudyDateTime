package operations;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Exerc16 {
	
	public static void main(String[] args) {
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
		Locale aLocale = Locale.of("pt", "BR");
		Calendar calendar = Calendar.getInstance(timeZone, aLocale);
		
		calendar.set(2017, Calendar.OCTOBER, 14, 10, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		// before sum
		long timeInMillisBeforeAdd = calendar.getTimeInMillis();
		System.out.println("Before: " + calendar.getTime());
		
		// sum 1 day
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		
		// after sum
		long timeInMillisAfterAdd = calendar.getTimeInMillis();
		System.out.println("After: " + calendar.getTime());
		
		long delta = timeInMillisAfterAdd - timeInMillisBeforeAdd;
		
		System.out.print(TimeUnit.HOURS.convert(delta, TimeUnit.MILLISECONDS));
		
	}
	
}
