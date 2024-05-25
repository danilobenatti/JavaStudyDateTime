package java_time_begin;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Exerc31 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		int dayOfYear = date.getDayOfYear();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		
		System.out.println(date);
		System.out.println(dayOfYear);
		System.out.println(dayOfWeek.getValue());
		System.out.println(dayOfWeek);
		System.out.println(
				dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
		
	}
	
}
