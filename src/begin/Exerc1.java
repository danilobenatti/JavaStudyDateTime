package begin;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Exerc1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now.getTime());
		System.out.println(now);
		
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println(now.getTime() + " = " + now + " - "
				+ TimeZone.getDefault().getID());
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
		System.out.println(now.getTime() + " = " + now + " - "
				+ TimeZone.getDefault().getID());
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		System.out.println(now.getTime() + " = " + now + " - "
				+ TimeZone.getDefault().getID());
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
		Date test1 = new Date(118, 0, 10);//(1900 + 118)-(jan=0, fev=1, ...)-10
		System.out.println(test1);// 2028-1-10
		Date test2 = new Date(118, Calendar.JANUARY, 10);
		System.out.println(test2);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println(calendar);
		calendar.set(2018, Calendar.JANUARY, 1, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		System.out.println(calendar);
		calendar.set(Calendar.AM_PM, Calendar.PM);
		calendar.set(Calendar.HOUR, 5);
		System.out.println(calendar);
		
		System.out.println(new Date().getTime());
		System.out.println(calendar.getTime());
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		Date date = cal.getTime();
		long timestamp1 = date.getTime();
		long timestamp2 = cal.getTimeInMillis();
		long timestamp3 = cal.getTime().getTime();
		
		System.out.println(date);
		System.out.println(timestamp1);
		System.out.println(timestamp2);
		System.out.println(timestamp3);
		
	}
}
