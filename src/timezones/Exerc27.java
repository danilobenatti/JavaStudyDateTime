package timezones;

import java.util.Calendar;

public class Exerc27 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, Calendar.OCTOBER, 14, 0, 0, 0);
		
		do {
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		} while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY);
		
		System.out.println(calendar.getTime());
	}
	
}
