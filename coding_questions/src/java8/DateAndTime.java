package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate); //2025-07-17
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); //2025-07-17T19:21:01:05100
		LocalDate date1 = LocalDate.of(1993, 8, 8);
		System.out.println(date1);
		Period between = Period.between(date1, currentDate);
		System.out.println(between);
		long between2 = ChronoUnit.YEARS.between(date1, now.toLocalDate());
		System.out.println(between2);
	}

}
