package java_timestamp;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;

public class Exerc58 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 10, 4);
		
		MonthDay monthDay = MonthDay.from(date);
		YearMonth yearMonth = YearMonth.from(date);
		
		System.out.println(monthDay);
		System.out.println(yearMonth);
		
	}
	
}
