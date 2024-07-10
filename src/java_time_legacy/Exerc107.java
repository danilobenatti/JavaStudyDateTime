package java_time_legacy;

import static java.time.format.DateTimeFormatter.ofPattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;

public class Exerc107 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		
		try {
			System.out.println(sdf.parse("17:00"));
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
		dtf.withResolverStyle(ResolverStyle.LENIENT);
		dtf.withResolverFields(ChronoField.AMPM_OF_DAY);
		try {
			System.out.println(dtf.parse("10:00 PM"));
			System.out.println(ofPattern("HH:mm").parse("17:00"));
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
