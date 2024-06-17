package java_time_arithmetic;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Exerc63 {
	
	public static void main(String[] args) {
		
		Duration duration = Duration.ofSeconds(3).plusMinutes(10)
				.plus(Duration.ofMillis(500)).plus(3, ChronoUnit.HOURS);
		
		System.out.println(duration);
		System.out.println(duration.toHoursPart());
		System.out.println(duration.toMinutesPart());
		System.out.println(duration.toSecondsPart());
		System.out.println(duration.toMillisPart());
		
	}
	
}
