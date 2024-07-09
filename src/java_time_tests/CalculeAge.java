package java_time_tests;

import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculeAge {
	
	private Clock clock;
	
	public CalculeAge(Clock clock) {
		this.clock = clock;
	}
	
	public long getAge(LocalDate bornDate) {
		return ChronoUnit.YEARS.between(bornDate, LocalDate.now(clock));
	}
	
}
