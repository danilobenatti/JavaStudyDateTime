package begin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exerc11 {
	
	static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
	
	static ExecutorService pool = Executors.newCachedThreadPool();
	
	public static void main(String[] args) {
		
		String value = "01/02/2018";
		
		for (int i = 0; i < 100; i++) {
			pool.submit(() -> {
				try {
					SimpleDateFormat sdf = (SimpleDateFormat) SDF.clone();
					synchronized (sdf) {
						Date date = sdf.parse(value);
						String dateFormatted = sdf.format(date);
						if (!value.equals(dateFormatted)) {
							StringBuilder msg = new StringBuilder()
									.append(value).append(" different than ")
									.append(dateFormatted);
							System.out.println(msg);
						}
					}
				} catch (ParseException e) {
					System.err.println(e);
				}
			});
		}
	}
}
