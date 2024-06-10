package java_timestamp;

import static org.apache.commons.lang3.StringUtils.capitalize;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.EnumSet;
import java.util.Locale;

public class Exerc57 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 5, 4);
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		
		System.out.println(capitalize(dayOfWeek.getDisplayName(TextStyle.FULL,
				Locale.of("pt", "BR"))));
		
		System.out.println(date.query(isItWeekend()));
		
		LocalDateTime dateTime = LocalDateTime.of(2018, 5, 6, 17, 0);
		
		System.out.println(capitalize(dateTime.getDayOfWeek()
				.getDisplayName(TextStyle.FULL, Locale.of("pt", "BR"))));
		
		System.out.println(dateTime.query(isItWeekend()));
		
		ZonedDateTime zdt = dateTime.atZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println(zdt.query(isItWeekend()));
		
		System.out.println(DateUtils.isItWeekend(date));
		System.out.println(DateUtils.isItWeekend(dateTime));
		System.out.println(zdt.query(DateUtils::isItWeekend));
		
		System.out.println(LocalDate.now().query(DateUtils::isItWeekend));
		
	}
	
	private static final TemporalQuery<Boolean> isItWeekend() {
		return temporal -> {
			int dayOfWeek = temporal.get(ChronoField.DAY_OF_WEEK);
			return dayOfWeek == DayOfWeek.SATURDAY.getValue()
					|| dayOfWeek == DayOfWeek.SUNDAY.getValue();
		};
	}
}

class DateUtils {
	
	DateUtils() {
	}
	
	private static final EnumSet<DayOfWeek> WEEKENDS = EnumSet
			.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
	
	public static boolean isItWeekend(TemporalAccessor temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.from(temporal);
		return WEEKENDS.contains(dayOfWeek);
	}
	
}
