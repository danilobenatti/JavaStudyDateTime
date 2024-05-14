package operations;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Exerc14 {
	
	public static void main(String[] args) {
		
		Date dateNow = new Date();
		
		System.out.println(dateNow);
		
		long twoHoursInMilliseconds = TimeUnit.MILLISECONDS.convert(2,
				TimeUnit.HOURS);
		
		// sum 2 hours
		dateNow.setTime(dateNow.getTime() + twoHoursInMilliseconds);
		System.out.println(dateNow);
		
	}
	
}
