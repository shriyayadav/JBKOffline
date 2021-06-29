package com.jbk.page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.jbk.ObjectRepository.UserPageObjectRepository;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UserPage extends UserPageObjectRepository {

	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ArrayList<String> printtable() {
		ArrayList<String> actual = new ArrayList<String>();
		// List<WebElement> data = null;
		for (int i = 0; i < header.size(); i++) {
			String a = header.get(i).getText();
			actual.add(a);
		}
		for (int i = 0; i < cols.size(); i++) {
			String a = cols.get(i).getText();
			actual.add(a);
		}

		return actual;
	}

	public ArrayList<String> readExcelData() throws BiffException, IOException {

		ArrayList<String> expected = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook woorkbook = Workbook.getWorkbook(fis);
		Sheet sheet = woorkbook.getSheet("user");

		System.out.println("row  " + sheet.getRows());
		System.out.println("col  " + sheet.getColumns());

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				System.out.print(sheet.getCell(j, i).getContents() + "      ");
				String a = sheet.getCell(j, i).getContents();
				expected.add(a);
			}
			System.out.println();
		}

		return expected;
	}

	// Print name of Male users
	public boolean printMaleusers() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook woorkbook = Workbook.getWorkbook(fis);
		Sheet sheet = woorkbook.getSheet("user");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < gender.size(); i++) {
			String genderName = gender.get(i).getText();
			if (genderName.equals("Male")) {
				String name = username.get(i).getText();
				actual.add(name);
			}
		}

		// return actual;
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Male")) {
					String a = sheet.getCell(1, i).getContents();
					expected.add(a);
				}
			}
		}
//		return expected;
		if (actual.equals(expected)) {
			System.out.println("Both are equal");
			System.out.println(actual);
			System.out.println(expected);
			return true;
		} else
			return false;

	}

	// print name of male users using Hashmap
	public boolean male() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook woorkbook = Workbook.getWorkbook(fis);
		Sheet sheet = woorkbook.getSheet("user");

		HashMap<String, String> actual = new HashMap<String, String>();
		HashMap<String, String> expected = new HashMap<String, String>();

		for (int i = 0; i < gender.size(); i++) {
			String value = gender.get(i).getText();
			String key = username.get(i).getText();
			if (value.equals("Male")) {
				actual.put(key, value);
			}
		}

		// return actual;
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Male")) {
					String value = sheet.getCell(j, i).getContents();
					String key = sheet.getCell(1, i).getContents();
					expected.put(key, value);

				}
			}
		}
		if (actual.equals(expected)) {
			System.out.println(actual);
			System.out.println(expected);
			return true;
		}

		return false;
	}

	// print name of users from maharashtra
	public boolean verifyUsersFromMaharashtra() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("user");

		HashMap<String, String> actual = new HashMap<String, String>();
		HashMap<String, String> expected = new HashMap<String, String>();

		for (int i = 0; i < state.size(); i++) {
			String value = state.get(i).getText();
			String key = username.get(i).getText();

			if (value.equals("Maharashtra")) {
				actual.put(key, value);
			}
		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Maharashtra")) {
					String value = sheet.getCell(j, i).getContents();
					String key = sheet.getCell(1, i).getContents();
					expected.put(key, value);

				}
			}
		}

		if (actual.equals(expected)) {
			System.out.println(actual);
			System.out.println(expected);
			return true;
		} else {
			System.out.println(actual);
			System.out.println(expected);
			return false;
		}

	}

	public boolean verifyUserFromPunjab() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("user");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < state.size(); i++) {
			String state1 = state.get(i).getText();
			if (state1.equals("Punjab")) {
				String name = username.get(i).getText();
				actual.add(name);
			}
		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Punjab")) {
					String a = sheet.getCell(1, i).getContents();
					expected.add(a);
				}
			}
		}

		if (actual.equals(expected)) {
			System.out.println(actual);
			System.out.println(expected);
			return true;
		} else {
			System.out.println(actual);
			System.out.println(expected);
			return false;
		}

	}

	public boolean sortedUsername() throws BiffException, IOException {

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Kimaya");
		expected.add("Kiran");
		expected.add("Monica");
		expected.add("Sagar");

		for (WebElement name : username) {
			String n = name.getText();
			actual.add(n);
			Collections.sort(actual);
		}

		if (actual.equals(expected)) {
			System.out.println(actual);
			System.out.println(expected);
			return true;
		} else {
			System.out.println(actual);
			System.out.println(expected);
			return false;
		}

	}

	public boolean verifyMailId() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("user");

		HashMap<String, String> actual = new HashMap<String, String>();
		HashMap<String, String> expected = new HashMap<String, String>();

		for (int i = 0; i < mail.size(); i++) {
			String value = mail.get(i).getText();
			String key = username.get(i).getText();

			if (value.contains("@gmail.com")) {
				actual.put(key, value);
			}
		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("@gmail.com")) {
					String value = sheet.getCell(j, i).getContents();
					String key = sheet.getCell(1, i).getContents();
					expected.put(key, value);

				}
			}
		}

		if (actual.equals(expected)) {
			System.out.println(actual);
			System.out.println(expected);
			return true;
		} else {
			System.out.println(actual);
			System.out.println(expected);
			return false;
		}

	}

	public boolean verifyUserEnteredCorrectGender() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("user");

		ArrayList<String> actual = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();

		for (int i = 0; i < header.size(); i++) {
			String g = header.get(5).getText();
			actual.add(g);
		}
		for (int i = 0; i < gender.size(); i++) {
			String g = gender.get(i).getText();
			actual.add(g);
		}
		HashSet<String> hs = new HashSet<String>(actual);
		System.out.println(hs);

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {

				String value = sheet.getCell(5, i).getContents();
				expected.add(value);

			}
		}
		HashSet<String> hs1 = new HashSet<String>(expected);
		System.out.println(hs1);

		if (hs.equals(hs1)) {
			return true;
		} else
			return false;

	}

	public boolean countmaleUsers() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook woorkbook = Workbook.getWorkbook(fis);
		Sheet sheet = woorkbook.getSheet("user");

		int count_actual = 0;
		int count_expected = 0;

		for (int i = 0; i < gender.size(); i++) {
			String genderName = gender.get(i).getText();
			if (genderName.equals("Male")) {
				count_actual++;
			}
		}

		// return actual;
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Male")) {
					count_expected++;
				}
			}
		}
//		return expected;
		if (count_actual == count_expected) {
			System.out.println("Both are equal");
			System.out.println(count_actual);
			System.out.println(count_expected);
			return true;
		} else
			return false;

	}

	public boolean countFemaleUsers() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook woorkbook = Workbook.getWorkbook(fis);
		Sheet sheet = woorkbook.getSheet("user");

		int count_actual = 0;
		int count_expected = 0;

		for (int i = 0; i < gender.size(); i++) {
			String genderName = gender.get(i).getText();
			if (genderName.equals("Female")) {
				count_actual++;
			}
		}

		// return actual;
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				if (sheet.getCell(j, i).getContents().contains("Female")) {
					count_expected++;
				}
			}
		}
//		return expected;
		if (count_actual == count_expected) {
			System.out.println("Both are equal");
			System.out.println(count_actual);
			System.out.println(count_expected);
			return true;
		} else
			return false;

	}

	public void verifyMobile() {

		for (int i = 0; i < mobile.size(); i++) {
			String m = mobile.get(i).getText();
			if (m.length() != 10) {
				String name = username.get(i).getText();
				System.out.println(name + ":" + "Please enter Correct Mobile number");

			}
		}

	}

	public ArrayList<Boolean> verifyMobile2() {
		ArrayList<Boolean> al = new ArrayList<Boolean>();
		boolean flag = false;
		for (int i = 0; i < mobile.size(); i++) {
			String m = mobile.get(i).getText();
			if (m.length() != 10) {
				System.out.println(" Incorrect Mobile number");
				al.add(flag);
			} else
				System.out.println("Correct Mobile number");
			al.add(!flag);
		}
		return al;
	}

	/*
	 * public void mobilelength() { boolean flag = false; SoftAssert sa = new
	 * SoftAssert(); for (int i = 0; i < mobile.size(); i++) { String m =
	 * mobile.get(i).getText(); if (m.length() != 10) { sa.assertTrue(flag); } else
	 * sa.assertTrue(!flag); } sa.assertAll(); }
	 */

	public boolean verifyCourse() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\JBKOfflineWebsite\\data.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("user");
		String value;
		String key;
		HashMap<String, String> actual = new HashMap<String, String>();
		HashMap<String, String> expected = new HashMap<String, String>();

		for (int i = 0; i < header.size(); i++) {
			value = header.get(4).getText();
			key = header.get(1).getText();
			actual.put(key, value);
		}
		for (int i = 0; i < course.size(); i++) {
			value = course.get(i).getText();
			key = username.get(i).getText();
			actual.put(key, value);
		}

		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				value = sheet.getCell(4, i).getContents();
				key = sheet.getCell(1, i).getContents();
				expected.put(key, value);
			}
		}
		if (actual.equals(expected)) {
			System.out.println(actual);
			System.out.println(expected);
			return true;
		} else {
			System.out.println(actual);
			System.out.println(expected);
			return false;
		}

	}

	public boolean verifyAddUserBtn() {
		addUserButton.click();
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Add User";
		if (actual.equals(expected)) {
			System.out.println("actual" + actual);
			System.out.println("expected" + expected);
			return true;
		} else
			System.out.println("actual" + actual);
		System.out.println("expected" + expected);
		return false;
	}

	public boolean verifyHeadline() {
		addUserButton.click();
		String actual = headline.getText();
		String expected = "Add User";
		if (actual.equals(expected)) {
			System.out.println("actual" + actual);
			System.out.println("expected" + expected);
			return true;
		} else
			System.out.println("actual" + actual);
		System.out.println("expected" + expected);
		return false;

	}

	public boolean verifyHeading() {
		addUserButton.click();
		String actual = heading.getText();
		String expected = "Fill Below Details";
		if (actual.equals(expected)) {
			System.out.println("actual" + actual);
			System.out.println("expected" + expected);
			return true;
		} else
			System.out.println("actual" + actual);
		System.out.println("expected" + expected);
		return false;
	}

	public boolean cancelbtn() {
		addUserButton.click();
		cancelBtn.click();
		String actual = driver.getTitle();
		String expected = "JavaByKiran | User";
		if (actual.equals(expected)) {
			System.out.println("actual" + actual);
			System.out.println("expected" + expected);
			return true;
		} else
			System.out.println("actual" + actual);
		System.out.println("expected" + expected);
		return false;
	}

	public boolean verifydetails() {
		addUserButton.click();
		usernameAddUser.sendKeys("shreya");
		mobileAddUser.sendKeys("11111");
		emailAddUser.sendKeys("shreya@gmail.com");
		courseAddUser.sendKeys("selenium");
		FemaleAddUser.click();
		Select select = new Select(stateAddUser);
		select.selectByValue("Maharashtra");
		passwordAddUser.sendKeys("shreya777");
		submitAddUser.click();

		Alert al = driver.switchTo().alert();
		String actual = al.getText();
		al.accept();

		String expected = "User Added Successfully. You can not see added user.";

		if (actual.equals(expected)) {
			System.out.println("actual" + actual);
			System.out.println("expected" + expected);
			return true;
		} else
			System.out.println("actual" + actual);
		System.out.println("expected" + expected);
		return false;
	}

}
