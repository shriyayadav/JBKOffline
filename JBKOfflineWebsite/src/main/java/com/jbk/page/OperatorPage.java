package com.jbk.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.OperatorPageObjectRepository;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class OperatorPage extends OperatorPageObjectRepository {

	WebDriver driver;

	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyHeader() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();

		for (WebElement header : header) {
			String a = header.getText();
			actual.add(a);
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {

				String a = sheet.getCell(j, i).getContents();
				expected.add(a);
			}
			System.out.println();
		}

		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	// Verify the user name available on Whatsapp Only
	public boolean verifyNameAvlOnlyWhatApp() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		HashMap<String, String> expected = new HashMap<String, String>();
		HashMap<String, String> actual = new HashMap<String, String>();

		for (int i = 0; i < wayofContact.size(); i++) {

			String value = wayofContact.get(i).getText();
			String key = person.get(i).getText();
			if (value.contains("Whats App Only")) {
				actual.put(key, value);
			}

		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Whats App Only")) {
					String value = sheet.getCell(j, i).getContents();
					String key = sheet.getCell(1, i).getContents();
					expected.put(key, value);

				}
			}
			System.out.println();
		}

		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	// Verify the user name available for Technical help
	public boolean verifyNameAvlTechnicalHelp() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		HashMap<String, String> expected = new HashMap<String, String>();
		HashMap<String, String> actual = new HashMap<String, String>();

		for (int i = 0; i < availablefor.size(); i++) {

			String value = availablefor.get(i).getText();
			String key = person.get(i).getText();
			if (value.contains("Technical")) {
				actual.put(key, value);
			}

		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Technical")) {
					String value = sheet.getCell(j, i).getContents();
					String key = sheet.getCell(1, i).getContents();
					expected.put(key, value);

				}
			}
			System.out.println();
		}

		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	// Verify the user name available for Enquiry
	public boolean verifyNameAvlforEnquiry() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		HashMap<String, String> expected = new HashMap<String, String>();
		HashMap<String, String> actual = new HashMap<String, String>();

		for (int i = 0; i < availablefor.size(); i++) {

			String value = availablefor.get(i).getText();
			String key = person.get(i).getText();
			if (value.contains("Enquiry")) {
				actual.put(key, value);
			}

		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Enquiry")) {
					String value = sheet.getCell(j, i).getContents();
					String key = sheet.getCell(1, i).getContents();
					expected.put(key, value);

				}
			}
			System.out.println();
		}

		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	// verify the availability user all day & weekend
	public boolean verifyAvaibilityofDays() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < days.size(); i++) {
			String day = days.get(i).getText();
			if (day.contains("Monday-Sunday") || day.contains("Saturday-Sunday")) {
				String name = person.get(i).getText();
				actual.add(name);
			}

		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Monday-Sunday")
						|| sheet.getCell(j, i).getContents().contains("Saturday-Sunday")) {
					String name = sheet.getCell(1, i).getContents();
					expected.add(name);

				}
			}
			System.out.println();

		}
		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}
	}

	// verify the serial number
	public boolean verifyserialnumber() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < serialnumber.size(); i++) {
			String n = serialnumber.get(i).getText();
			actual.add(n);
		}

		// return actual;

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < 1; j++) {
				if (i != 0) {
					String n = sheet.getCell(0, i).getContents();
					n = "0" + n;
					expected.add(n);
				}
			}
			System.out.println();
		}
		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	// verify contact no & timings of users
	public boolean verifyUserContactNoAndTiming() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		HashMap<String, List<String>> actual = new HashMap<String, List<String>>();
		HashMap<String, List<String>> expected = new HashMap<String, List<String>>();

		for (int i = 0; i < timing.size(); i++) {

			String key = person.get(i).getText();
			String timeDay = timing.get(i).getText();
			String contactNumber = contactNo.get(i).getText();
			String time = timeDay.substring(0, 20);
			List<String> l = new ArrayList<String>();
			l.add(time);
			l.add(contactNumber);

			actual.put(key, l);
		}

		// return actual;

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (i != 0) {
					String key = sheet.getCell(1, i).getContents();
					String timeDay = sheet.getCell(5, i).getContents();
					String contactNumber = sheet.getCell(4, i).getContents();
					String time = timeDay.substring(0, 20);
					List<String> l = new ArrayList<String>();
					l.add(time);
					l.add(contactNumber);

					expected.put(key, l);

				}
			}
			System.out.println();

		}
		// return expected;
		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	// verify the detailed description on contact
	public boolean verifyDetailedDescription() throws BiffException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < availablefor.size(); i++) {
			String description = availablefor.get(i).getText();

			if (description.contains("(") || description.contains(")")) {
				actual.add(description);
			}
		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("(")
						|| sheet.getCell(j, i).getContents().contains(")")) {
					String description = sheet.getCell(j, i).getContents();
					expected.add(description);
				}
			}
			System.out.println();
		}

		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	public boolean verifyuserAvlAllModeofContact() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\Operator.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("Operator");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < wayofContact.size(); i++) {
			String name = person.get(i).getText();
			String contactMode = wayofContact.get(i).getText();

			if (contactMode.contains("Whats App") && contactMode.contains("Phone Call") && contactMode.contains("SMS")
					&& contactMode.contains("eMail")) {
				actual.add(name);
			}
		}
		// return actual;

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Whats App")
						&& sheet.getCell(j, i).getContents().contains("Phone Call")
						&& sheet.getCell(j, i).getContents().contains("SMS")
						&& sheet.getCell(j, i).getContents().contains("eMail")) {
					String name = sheet.getCell(1, i).getContents();
					expected.add(name);
				}
			}
			System.out.println();
		}

		if (actual.equals(expected)) {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return true;
		} else {
			System.out.println("Actual Header  " + actual);
			System.out.println("Expected Header  " + expected);
			return false;
		}

	}

	public <K, V> void verifyMaximumTiming() {

		double inTimeinInt = 0;
		double outTimeinInt = 0;
		double workingTime = 0;

		HashMap<String, Double> hm = new HashMap<String, Double>();

		ArrayList<Double> workingHour = new ArrayList<Double>();

		for (int i = 0; i < timing.size(); i++) {

			String text = timing.get(i).getText();

			int firstIndex = text.indexOf(':');
			int lastIndex = text.lastIndexOf(':');

			String inTime = text.substring(firstIndex - 2, firstIndex + 6);
			String outTime = text.substring(lastIndex - 2, lastIndex + 6);

			// System.out.print(person.get(i).getText() + " In Time = " + inTime + " Out
			// Time = " + outTime);

			if (inTime.contains("PM"))
				inTimeinInt = Integer.parseInt(inTime.substring(0, 2)) + 12;
			else
				inTimeinInt = Integer.parseInt(inTime.substring(0, 2));

			if (outTime.contains("PM"))
				outTimeinInt = Integer.parseInt(outTime.substring(0, 2)) + 12;
			else
				outTimeinInt = Integer.parseInt(outTime.substring(0, 2));

			if (!text.substring(firstIndex + 1, firstIndex + 3).equals("00")) {
				int min = Integer.parseInt(text.substring(firstIndex + 1, firstIndex + 3));
				double m = (double) min / 60;
				inTimeinInt = inTimeinInt + m;
			}
			if (!text.substring(lastIndex + 1, lastIndex + 3).equals("00")) {
				int min = Integer.parseInt(text.substring(lastIndex + 1, lastIndex + 3));
				outTimeinInt = outTimeinInt + min / 60;
			}
			workingTime = outTimeinInt - inTimeinInt;
			// System.out.print(" Working Hours: " + workingTime + "\n");
			// workingHour.add(workingTime);
			String key = person.get(i).getText();
			double value = workingTime;
			hm.put(key, value);
		}
		HashMap<String, Double> hm1 = sortHashMap(hm);

		for (Map.Entry<String, Double> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
		}
		
		System.out.println(maxUsingCollectionsMax(hm1));

	}
	
	public <K, V extends Comparable<V>> V maxUsingCollectionsMax(Map<K, V> map) {
	    Entry<K, V> maxEntry = Collections.max(map.entrySet(), new Comparator<Entry<K, V>>() {
	        public int compare(Entry<K, V> e1, Entry<K, V> e2) {
	            return e1.getValue().compareTo(e2.getValue());
	        }
	    });
	    return maxEntry.getValue();
	}

	public static HashMap<String, Double> sortHashMap(HashMap<String, Double> hm) {
		// Create a list from elements of HashMap
		List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// put data from sorted list to hashmap
		HashMap<String, Double> temp = new LinkedHashMap<String, Double>();
		for (Map.Entry<String, Double> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
}
