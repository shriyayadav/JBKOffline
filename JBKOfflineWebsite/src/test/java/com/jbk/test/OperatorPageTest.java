package com.jbk.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.jbk.page.OperatorPage;
import com.jbk.page.UserPage;

public class OperatorPageTest extends TestBase{
	
	WebDriver driver;
	public OperatorPage op = null;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = super.launchApplication();
		op = loadLoginPage().navigateToDashboardPage(driver).navigateToOperatorPage(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
