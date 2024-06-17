package java_time_arithmetic;

import java.time.Period;

public class Exerc61 {
	
	public static void main(String[] args) {
		
		System.out.println(Period.parse("P1Y2M20D"));
		System.out.println(Period.of(1, 2, 20));
		
		System.out.println(Period.ofYears(1).plusMonths(2).plusDays(20));
		
		Period period = Period.ofMonths(1);
		period = period.plusDays(40);
		System.out.println(period);
		
		Period period2 = Period.parse("P1Y3M");
		period2 = period2.plus(Period.parse("P5M10D"));
		System.out.println(period2);
		System.out.println(period2.getYears());
		System.out.println(period2.getMonths());
		System.out.println(period2.getDays());
		
	}
	
}
