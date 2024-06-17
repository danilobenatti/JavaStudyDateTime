package java_time_arithmetic;

import static org.apache.commons.lang3.StringUtils.joinWith;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Exerc64 {
	
	public static void main(String[] args) {
		
		Duration duration = Duration.parse("PT3H10M3.5S");
		System.out.println(duration);
		System.out.println(joinWith(", ", duration.toHoursPart() + " hours",
				duration.toMinutesPart() + " minutes",
				duration.toSecondsPart() + " seconds",
				duration.toMillisPart() + " milliseconds"));
		
		Period period = Period.parse("P1M40D");
		System.out.println(period);
		System.out.println(period.toTotalMonths());
		System.out.println(period.getDays());
		System.out.println(joinWith(", ", period.getMonths() + " mounths",
				period.getDays() + " days"));
		
		LocalDateTime dateTime = LocalDateTime.of(2018, 5, 4, 17, 0);
		System.out.println(dateTime);
		
		dateTime = dateTime.plus(duration).minus(period);
		System.out.println(dateTime);
		
	}
	
}
