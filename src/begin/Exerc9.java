package begin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exerc9 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat parser = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
		parser.setLenient(true); // false
		
		Date date = parser.parse("2018-02-01T10:20:30.123456");
		System.out.println(date);
		System.out.println(parser.format(date));
	}
	
}
