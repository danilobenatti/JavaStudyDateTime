package timezones;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Exerc23 {
	
	public static void main(String[] args) {
		
		TimeZone zone = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(zone.getID());
		System.out.println(zone.getDisplayName());
		System.out.println(zone.getDisplayName(Locale.US));
		System.out.println(zone.getDisplayName(zone.useDaylightTime(),
				TimeZone.SHORT, Locale.US));
		System.out.println(zone.inDaylightTime(new Date()));
		System.out.println(zone.getOffset(System.currentTimeMillis()));
		System.out.println(TimeUnit.HOURS.convert(
				zone.getOffset(System.currentTimeMillis()),
				TimeUnit.MILLISECONDS));
		
	}
	
}
