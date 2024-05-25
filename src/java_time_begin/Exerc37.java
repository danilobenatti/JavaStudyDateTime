package java_time_begin;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exerc37 {
	
	public static void main(String[] args) {
		
		List<LocalDate> list = Arrays.asList(LocalDate.of(2018, 5, 4),
				LocalDate.of(1995, 5, 4), LocalDate.of(2018, 1, 20));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.reversed());
		
	}
	
}
