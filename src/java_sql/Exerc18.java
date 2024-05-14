package java_sql;

import java.text.SimpleDateFormat;

public class Exerc18 {
	
	public static void main(String[] args) {
		
		java.sql.Date date = new java.sql.Date(1525464000000L);
		
		java.sql.Time time = new java.sql.Time(1525464000000L);
		
		System.out.println(date);
		System.out.println(time);
		
		java.util.TimeZone
				.setDefault(java.util.TimeZone.getTimeZone("Asia/Tokyo"));
		
		System.out.println(date);
		System.out.println(time);
		
		java.util.TimeZone.setDefault(
				java.util.TimeZone.getTimeZone("America/Sao_Paulo"));
		
		java.sql.Date sqlDate = new java.sql.Date(1525464000000L);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(formatter.format(sqlDate));
		
	}
	
}
