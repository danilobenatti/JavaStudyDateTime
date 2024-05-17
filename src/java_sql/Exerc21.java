package java_sql;

public class Exerc21 {
	
	public static void main(String[] args) {
		
		java.sql.Timestamp timestamp = new java.sql.Timestamp(1525464000000L);
		
		java.util.TimeZone.setDefault(
				java.util.TimeZone.getTimeZone("Amercia/Sao_Paulo"));
		System.out.println(timestamp);
		
		java.util.TimeZone
				.setDefault(java.util.TimeZone.getTimeZone("Asia/Tokyo"));
		System.out.println(timestamp);
		
		timestamp.setTime(1525464000123L);
		System.out.println(timestamp);
		System.out.println(timestamp.getTime());
		System.out.println(timestamp.getNanos());
		
	}
	
}
