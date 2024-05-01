package begin;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Exerc3 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		Locale.setDefault(Locale.of("en", "US"));
		Locale localeBR = Locale.of("pt", "BR");
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
		
		SimpleDateFormat sdfUS = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfBR = new SimpleDateFormat("dd/MM/yyyy", localeBR);
		
		String dateFormatted = sdfUS.format(date);
		
		System.out.println(Calendar.getInstance());
		System.out.println(TimeZone.getDefault());
		System.out.println(ZoneId.systemDefault());
		System.out.println(Locale.getDefault());
		
		System.out.println(dateFormatted);
		
		sdfUS.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		System.out.println(sdfUS.format(date));
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(sdfUS.format(calendar.getTime()));
		
		sdfUS.applyPattern("EEEE dd/MM/yyyy");
		sdfBR.applyPattern("EEE dd/MMMM/yyyy");
		System.out.println(sdfUS.format(new Date()));
		System.out.println(sdfBR.format(new Date()));
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy",
				Locale.ENGLISH);
		formatter.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
		System.out.println(formatter.format(new Date()));
	}
	
}
