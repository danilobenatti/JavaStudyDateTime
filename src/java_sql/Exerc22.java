package java_sql;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exerc22 {
	
	public static void main(String[] args) throws ParseException {
		
		java.sql.Timestamp timestamp = java.sql.Timestamp
				.valueOf("2018-05-04 10:30:45.123456789");
		System.out.println(timestamp);
		System.out.println(timestamp.getTime());
		System.out.println(timestamp.getNanos());
		
		String input = "04/05/2018 10:30:45.123456789";
		String[] nanoseconds = input.split("\\.");
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = parser.parse(nanoseconds[0]);
		java.sql.Timestamp ts = new java.sql.Timestamp(date.getTime());
		ts.setNanos(Integer.parseInt(nanoseconds[1]));
		System.out.println(ts);
		System.out.println(ts.getTime());
		System.out.println(ts.getNanos());
		
	}
	
}
