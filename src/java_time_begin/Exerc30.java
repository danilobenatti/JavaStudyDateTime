package java_time_begin;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exerc30 {
	
	private static final Locale LOCALE = Locale.of("pt", "BR");
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, Month.MAY, 4);
		int dayOfMonth = date.getDayOfMonth();
		int year = date.getYear();
		Month month = date.getMonth();
		int monthValue = date.getMonthValue();
		
		System.out.println(dayOfMonth);
		System.out.println(year);
		System.out.println(month);
		System.out.println(month.getDisplayName(TextStyle.FULL, LOCALE));
		System.out.println(month.getValue());
		System.out.println(monthValue);
	}
	
}
