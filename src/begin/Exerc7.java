package begin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exerc7 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat iso8607Format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mmXXX");
		
		try {
			String input = "2018-05-04T01:00Z";
			Date date = iso8607Format.parse(input);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
