package calendar;

import java.util.Calendar;

public class Exerc28 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, Calendar.FEBRUARY, 16);
		// set last day
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 3);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		
		System.out.println(calendar.getTime());
		
	}
	
}
