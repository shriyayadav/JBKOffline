package com.jbk.page;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.DashboardPageObjectRepository;

public class DashboardPage extends DashboardPageObjectRepository {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public UserPage navigateToUserPage(WebDriver driver)
	{
		userpagelink.click();
		return new UserPage(driver);
	}
	
	public OperatorPage navigateToOperatorPage(WebDriver driver)
	{
		operatorpagelink.click();
		return new OperatorPage(driver);
	}

	public boolean verifyTitle() {
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Dashboard";
		if (actual.equals(expected)) {
			System.out.println("Title match : " + actual);
			return true;
		} else
			System.out.println("Title not match : " + expected);
		return false;
	}

	public boolean verifyText() {
		String actual = text.getText();
		String expected = "Java By Kiran";
		if (actual.equals(expected)) {
			System.out.println("text match : " + actual);
			return true;
		} else
			System.out.println("text not match : " + expected);
		return false;
	}

	public boolean verifyDashboardTableLabel() {
		String actual = dashboardlabel.getText();
		String expected = "Dashboard Courses Offered";
		if (actual.equals(expected)) {
			System.out.println("Dashboard table match : " + actual);
			return true;
		} else
			System.out.println("Dashboard table not match : " + expected);
		return false;
	}

	public boolean verifyLogOutBtn() {
		logoutbtn.click();
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Log in";
		if (actual.equals(expected)) {
			System.out.println("after logout log in page title  match : " + actual);
			return true;
		} else
			System.out.println("after logout log in page title not  match: " + expected);
		return false;
	}

	public boolean verifyTextofMainNavigation() {
		String actual = main_navigation_text.getText();
		String expected = "MAIN NAVIGATION";
		if (actual.equals(expected)) {
			System.out.println("main navigation text  match : " + actual);
			return true;
		} else
			System.out.println("main navigation text not  match: " + expected);
		return false;

	}

	public boolean verifyLogoutsuccessful() {
		logoutbtn.click();
		String actual = logout_Successfully_text.getText();
		String expected = "Logout successfully";
		if (actual.equals(expected)) {
			System.out.println("Logout succefully message display ");
			return true;
		} else
			System.out.println("not get logout ");
		return false;

	}

	public boolean verifyDashboardMenus() {
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();

		expected.add("Dashboard");
		expected.add("Users");
		expected.add("Operators");
		expected.add("Useful Links");
		expected.add("Downloads");
		expected.add("Logout");

		for (WebElement element : dashboardMenu) {
			System.out.println(element.getText());
			actual.add(element.getText());
		}

		System.out.println("Actual Dashboard Menu is  " + actual);
		System.out.println("Expected Dashboard Menu is  " + expected);

		if (actual.equals(expected)) {
			System.out.println("Dashboard Menu's Match");
			return true;
		} else
			System.out.println("Dashboard Menu's are Not Match");
		return false;

	}

	public boolean verifyCourses() {
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();

		expected.add("Selenium");
		expected.add("Java / J2EE");
		expected.add("Python");
		expected.add("Php");

		for (WebElement element : courses) {
			System.out.println(element.getText());
			actual.add(element.getText());
		}

		System.out.println("Actual course ArrayList is  " + actual);
		System.out.println("Expected course ArrayList is  " + expected);

		if (actual.equals(expected)) {
			System.out.println("Courses Match");
			return true;
		} else
			System.out.println("Courses Not Match");
		return false;

	}

	public boolean verifySubCourses() {
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();

		expected.add("Automation Testing");
		expected.add("Software Development");
		expected.add("Data Science");
		expected.add("Web Development");

		for (WebElement element : subcourses) {
			System.out.println(element.getText());
			actual.add(element.getText());
		}

		System.out.println("Actual sub-course ArrayList is  " + actual);
		System.out.println("Expected sub-course ArrayList is  " + expected);

		if (actual.equals(expected)) {
			System.out.println("Sub-Courses Match");
			return true;
		} else
			System.out.println("Sub-Courses Not Match");
		return false;

	}

//	public void verifymoreinfo() {
//
//		System.out.println(link.size());
//		for (WebElement element : link) {
//
//			element.click();
//			System.out.println(element.getText());
//		}
//
//	}

}
