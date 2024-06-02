package java_time_zoned;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Exerc50 {
	
	public static void main(String[] args) {
		
		// 2018-05-04T17:00-03:00
		OffsetDateTime offsetDateTime = OffsetDateTime.of(2018, 5, 4, 17, 0, 0,
				0, ZoneOffset.of("-03:00"));
		ZoneId.getAvailableZoneIds().forEach(zoneName -> {
			ZoneId zone = ZoneId.of(zoneName);
			ZoneOffset offset = offsetDateTime.atZoneSameInstant(zone)
					.getOffset();
			if (offset.equals(offsetDateTime.getOffset())) {
				System.out.println(zoneName);
			}
		});
	}
	
}
