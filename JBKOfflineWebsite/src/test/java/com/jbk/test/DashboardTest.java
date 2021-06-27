package com.jbk.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.page.DashboardPage;

public class DashboardTest extends TestBase {

	WebDriver driver;
	public DashboardPage dp = null;

	@BeforeMethod
	public void setUp() throws IOException {

		driver = super.launchApplication();
		dp = loadLoginPage().navigateToDashboardPage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyTitle() {
		Assert.assertTrue(dp.verifyTitle());
	}

	@Test
	public void verifyLogOutBtn() {
		Assert.assertTrue(dp.verifyLogOutBtn());
	}

	@Test
	public void verifyTextofMainNavigation() {
		Assert.assertTrue(dp.verifyTextofMainNavigation());
	}

	@Test
	public void verifyLogoutsuccessful() {
		Assert.assertTrue(dp.verifyLogoutsuccessful());
	}

	@Test
	public void verifyDashboardMenus() {
		Assert.assertTrue(dp.verifyDashboardMenus());
	}

	@Test
	public void verifyCourses() {
		Assert.assertTrue(dp.verifyCourses());
	}

	@Test
	public void verifySubCourses() {
		Assert.assertTrue(dp.verifySubCourses());
	}

//	@Test
//	public void verifymoreinfo()
//	{
//		
//		Assert.assertEquals(actual, expected);
//	}

}
