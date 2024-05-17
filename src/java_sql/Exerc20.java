package java_sql;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exerc20 {
	
	public static void main(String[] args) throws ParseException {
		
		java.sql.Date sqlDate = java.sql.Date.valueOf("2018-05-04");
		java.sql.Time time = java.sql.Time.valueOf("10:00:00");
		
		System.out.println(sqlDate + " " + time);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = formatter.parse("04/05/2018");
		
		java.sql.Date sqlDate2 = new java.sql.Date(date.getTime());
		System.out.println(sqlDate2);
		
	}
	
}
