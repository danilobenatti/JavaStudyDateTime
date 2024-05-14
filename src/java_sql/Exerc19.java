package java_sql;

import java.util.Calendar;

public class Exerc19 {
	
	public static void main(String[] args) {
		
		java.sql.Date sqlDate1 = new java.sql.Date(1525464000000L);
		java.sql.Date sqlDate2 = new java.sql.Date(1525464000001L);
		
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		
		System.out.println("Equals? " + sqlDate1.equals(sqlDate2));
		System.out.println(
				"sqlDate1 before sqlDate2? " + sqlDate1.before(sqlDate2));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(1525464000000L);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		java.sql.Date sqlDate3 = new java.sql.Date(calendar.getTimeInMillis());
		System.out.println(sqlDate3);
	}
	
}
