package java_time_zoned;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exerc44 {
	
	public static void main(String[] args) {
		
		// 2018-05-04T17:00-03:00[America/Sao_Paulo]
		ZoneId zoneSP = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdtSP = ZonedDateTime.of(2018, 5, 4, 17, 0, 0, 0, zoneSP);
		
		// 2018-05-04T23:00+09:00[Asia/Tokyo]
		ZoneId zoneTK = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zdtTK = ZonedDateTime.of(2018, 5, 4, 23, 0, 0, 0, zoneTK);
		
		System.out.println(zdtSP.isBefore(zdtTK)); // false
		System.out.println(zdtSP.isAfter(zdtTK)); // true
		
	}
	
}
