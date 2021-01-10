package advancedJavaParkingFeesSystem;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	/**
	 * @author Faiz-Siddiqh
	 * 
	 *         Calculating the parking fees for an automated Parking system, By
	 *         taking fees/hr and using date and time API
	 *
	 */

	private static long hoursDifference(LocalDateTime ldt1, LocalDateTime ldt2) {
		long minutesDiff = ChronoUnit.MINUTES.between(ldt1, ldt2);
		long hoursDiff = Math.round(Math.ceil(minutesDiff / 60.0));
		return hoursDiff;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dayTimePricePerHour = sc.nextInt();
		LocalDateTime inTime;
		LocalDateTime outTime;

		// Setting current time
		LocalDateTime current = LocalDateTime.of(2019, 10, 29, 20, 10);
		// System.out.println(current);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		// String formattedDate=current.format(myFormatObj);
		System.out.println("In-time");
		String time1 = sc.nextLine();
		if (!time1.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})([ ]+)([0-2]{1})([0-9]{1}):([0-5]{1})([0-9]{1})")) {
			System.out.println(time1 + " is an Invalid In-Time");
			return;
		}

		try {
			inTime = LocalDateTime.parse(time1, myFormatObj);

			// System.out.println(inTime);
		} catch (DateTimeParseException e) {
			System.out.println(time1 + " is an Invalid In-Time");
			return;
		}

		if (!inTime.isBefore(current.minusMinutes(1)) || inTime.isEqual(current)) {
			System.out.println(inTime.format(myFormatObj) + " is an Invalid In-Time");
			return;
		}

		System.out.println("Out-time");
		String time2 = sc.nextLine();
		if (!time2.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})([ ]+)([0-2]{1})([0-9]{1}):([0-5]{1})([0-9]{1})")) {
			System.out.println(time2 + " is an Invalid Out-Time");
			return;
		}
		try {
			outTime = LocalDateTime.parse(time2, myFormatObj);
		} catch (DateTimeParseException e) {
			System.out.println(time2 + " is an Invalid Out-Time");
			return;
		}
		// System.out.println(outTime);
		if (!outTime.isAfter(inTime)) {
			System.out.println(outTime.format(myFormatObj) + " is an Invalid In-Time");
			return;
		}

		long hourDiff = hoursDifference(inTime, outTime);

		long Amount = hourDiff * dayTimePricePerHour;
		System.out.println(Amount + " Rupees");

	}
}