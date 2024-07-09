package java_time_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

class Exerc96 {
	
	@Test
	void test() {
		ZonedDateTime z = ZonedDateTime
				.parse("2010-01-09T00:00-03:00[America/Sao_Paulo]");
		
		CalculeAge calc = new CalculeAge(
				Clock.fixed(z.toInstant(), z.getZone()));
		
		LocalDate bornDate = LocalDate.of(2000, 1, 10);
		
		long age = calc.getAge(bornDate);
		
		assertEquals(age, 9);
		
	}
	
}
