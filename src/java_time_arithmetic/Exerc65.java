package java_time_arithmetic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class Exerc65 {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		List<TemporalUnit> list = Duration.parse("PT1H30M4.5S").getUnits();
		System.out.println(list);
		
		boolean isMatch = Duration.parse("PT1H30M4.5S").getUnits().stream()
				.allMatch(now::isSupported);
		System.out.println(isMatch);
		
	}
	
}
