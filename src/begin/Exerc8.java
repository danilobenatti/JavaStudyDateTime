package begin;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exerc8 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		parser.setLenient(false);
		
		System.out.println(parser.parseObject("01/02/2018 10:30"));
		
		System.out.println(parser.parse("31/02/2018"));
	}

}
