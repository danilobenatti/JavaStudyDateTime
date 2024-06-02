package java_time_zoned;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Exerc38 {
	
	public static void main(String[] args) {
		
		ZonedDateTime now1 = ZonedDateTime.now();
		System.out.println(now1);
		
		ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(now2);
		
		TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println(msg());
		
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
		System.out.println(msg());
		
		LocalDateTime nowSP = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println(nowSP);
		
		LocalDateTime nowTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(nowTokyo);
		
	}
	
	private static String msg() {
		return new StringBuilder()
				.append(ZoneId.systemDefault()).append("[").append(ZoneId
						.systemDefault().getRules().getOffset(Instant.now()))
				.append("]").toString();
	}
	
}
