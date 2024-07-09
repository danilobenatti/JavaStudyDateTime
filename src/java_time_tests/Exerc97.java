package java_time_tests;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;

public class Exerc97 {
	
	public static void main(String[] args) {
		
		ZoneRules rules = ZoneId.of("America/Sao_Paulo").getRules();
		rules.getTransitions().forEach(System.out::print);
		
		ZoneOffsetTransition transition = rules.nextTransition(Instant.now());
		System.out.println(transition);
		System.out.println(rules.previousTransition(Instant.now()));
		System.out.println(rules.getOffset(Instant.now()));
		System.out.println(rules.isDaylightSavings(Instant.now()));
		System.out.println(rules.getValidOffsets(LocalDateTime.now()));
		
		ZoneId br = ZoneId.of("Brazil/East");
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		System.out.println(sp.equals(br));
		System.out.println(sp.getRules().equals(br.getRules()));
		
	}
	
}
