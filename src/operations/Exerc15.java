package operations;

import java.util.Calendar;

public class Exerc15 {
	
	public static void main(String[] args) {
		
		Calendar currentDate = Calendar.getInstance();
		System.out.println(currentDate.getTime());
		
		// sum 2 hours
		currentDate.add(Calendar.HOUR_OF_DAY, 2);
		System.out.println(currentDate.getTime());
		
	}
	
}
