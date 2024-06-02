package java_time_zoned;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class Exerc39 {
	
	public static void main(String[] args) {
		
		Map<String, String> abrev = new HashMap<>();
		abrev.put("EST", "America/New_York");
		abrev.put("IST", "Asia/Kolkata");
		
		ZoneId zoneId = ZoneId.of("IST", abrev);
		
		LocalDate now = LocalDate.now(zoneId);
		System.out.println(now);
	}
	
}
