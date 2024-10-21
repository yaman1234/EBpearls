package utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

//import pageObjects.A4SpotQuoteQueue;

/**
 * This class contains methods to deal with dates from a table
 * 
 *
 */
public class DateOperations extends UtilBase {

	public static String getCurrentTimestamp() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddHHmmss");
		return now.format(formatter);
	}

	public static String getCurrentDate() {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return today.format(formatter);
	}

}
