package Excel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
	public static void main(String[] args) {
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(ofPattern.format(now));

	}

}
