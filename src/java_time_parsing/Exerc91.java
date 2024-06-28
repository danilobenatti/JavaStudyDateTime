package java_time_parsing;

import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class Exerc91 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.LENIENT);
		
		String date = "99/00/2018";
		System.out.println("a. " + LocalDate.parse(date, formatter));
		
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		ParsePosition position = new ParsePosition(0);
		
		TemporalAccessor parsed = parser.parseUnresolved(date, position);
		
		if (position.getErrorIndex() >= 0) {
			System.out.println(
					"b. Error in position " + position.getErrorIndex());
		} else if (position.getIndex() < date.length()) {
			System.out.println("b. No parse for string 'date', stop in "
					+ position.getIndex());
		} else {
			System.out.println("b. " + parsed);
		}
		
		int year = (int) parsed.getLong(ChronoField.YEAR);
		int month = (int) parsed.getLong(ChronoField.MONTH_OF_YEAR);
		
		if (month == 0) {
			month = 1;
		}
		
		YearMonth yearMonth = YearMonth.of(year, month);
		LocalDate newDate;
		
		int day = (int) parsed.getLong(ChronoField.DAY_OF_MONTH);
		
		if (day > yearMonth.lengthOfMonth()) {
			newDate = yearMonth.atEndOfMonth();
		} else {
			newDate = yearMonth.atDay(day);
		}
		
		System.out.println("c. " + newDate);
		
		System.out.println("d. " + challenge("99/00/2018"));
		System.out.println("e. " + challenge("-02/15/2018"));
		
	}
	
	public static LocalDate challenge(String date) {
		
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
				.appendPattern("[-]dd/MM/uuuu").parseLenient().toFormatter();
		
		TemporalAccessor parsed = formatter.parseUnresolved(date,
				new ParsePosition(0));
		
		System.out.println("ch. " + parsed);
		
		int year = (int) parsed.getLong(ChronoField.YEAR);
		int month = (int) parsed.getLong(ChronoField.MONTH_OF_YEAR);
		
		if (month == 0) {
			month = 1;
		} else if (month > 12) {
			year = year + Math.floorDiv(month, 12);
			month = Math.floorMod(month, 12);
		}
		
		YearMonth yearMonth = YearMonth.of(year, month);
		LocalDate newDate;
		
		int day = (int) parsed.getLong(ChronoField.DAY_OF_MONTH);
		
		if (day > yearMonth.lengthOfMonth()) {
			newDate = yearMonth.atEndOfMonth();
		} else if (date.startsWith("-")) {
			newDate = yearMonth.atDay(day == 0 ? 1 : day).minusDays(day);
		} else {
			newDate = yearMonth.atDay(day);
		}
		
		return newDate;
		
	}
	
}
