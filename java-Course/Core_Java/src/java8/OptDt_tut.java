package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Optional;
import java.util.Set;

/*
 * default and static method
 * lambda expression
 * method reference
 * predefined functional interfaces
 * stream
 * Optional class
 * Date and Time API
 */
public class OptDt {
	public static void main(String[] args) {
		opt();
	}

	private static void opt() {
		Optional o1 = Optional.of("abc");
//		Optional o2 = Optional.of(null);
		Optional o2 = Optional.ofNullable("code");

		System.out.println(o1);// o1.get()
//		System.out.println(o2.get());//NPE
		System.out.println(o2.orElse("default1"));
		o2.ifPresent(a -> System.out.println(a));
		o2.ifPresentOrElse(a -> System.out.println(a), () -> System.out.println("default2"));
		o2.isEmpty();
		o2.isPresent();
		o2.filter(n -> n.equals("code"));
		o2.map((a) -> a);
//		o2.flatMap();
		o2.orElseThrow();
		try {
			o2.orElseThrow(() -> new RuntimeException("error"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	private static void dt() {
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.now();
		ld1.plusDays(3);
		ld1.minusYears(3);
		ld1.isLeapYear();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		Set<String> z = ZoneId.getAvailableZoneIds();
//		Duration d = Duration.between(start, end);
//		Period p = Period.between(start, end);
	}
}
