package com.jbk.test;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.page.UserPage;

import jxl.read.biff.BiffException;

public class UserPageTest extends TestBase {
	WebDriver driver;
	public UserPage up = null;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = super.launchApplication();
		up = loadLoginPage().navigateToDashboardPage(driver).navigateToUserPage(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void printtable() throws BiffException, IOException {
		ArrayList<String> actual = up.printtable();
		ArrayList<String> expected = up.readExcelData();
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void printMaleusers() throws BiffException, IOException {

		Assert.assertTrue(up.printMaleusers());
	}

	@Test
	public void male() throws BiffException, IOException {

		Assert.assertTrue(up.male());
	}

	@Test
	public void verifyUsersFromMaharashtra() throws BiffException, IOException {

		Assert.assertTrue(up.verifyUsersFromMaharashtra());
	}

	@Test
	public void verifyUserFromPunjab() throws BiffException, IOException {

		Assert.assertTrue(up.verifyUserFromPunjab());
	}

	@Test
	public void sortedUsername() throws BiffException, IOException {
		Assert.assertTrue(up.sortedUsername());
	}

	@Test
	public void verifyMailId() throws BiffException, IOException {
		Assert.assertTrue(up.verifyMailId());
	}

	@Test
	public void verifyUserEnteredCorrectGender() throws BiffException, IOException {
		Assert.assertTrue(up.verifyUserEnteredCorrectGender());
	}

	@Test
	public void countmaleUsers() throws BiffException, IOException {
		Assert.assertTrue(up.countmaleUsers());
	}

	@Test
	public void countFemaleUsers() throws BiffException, IOException {
		Assert.assertTrue(up.countFemaleUsers());
	}

	@Test
	public void verifyMobile() throws BiffException, IOException {
		up.verifyMobile();
	}

	@Test
	public void verifyCourse() throws BiffException, IOException {
		Assert.assertTrue(up.verifyCourse());
	}

	@Test
	public void verifyAddUserBtn() {
		Assert.assertTrue(up.verifyAddUserBtn());
	}

	@Test
	public void verifyHeadline() {
		Assert.assertTrue(up.verifyHeadline());
	}

	@Test
	public void verifyHeading() {
		Assert.assertTrue(up.verifyHeading());
	}

	@Test
	public void verifydetails() {
		Assert.assertTrue(up.verifydetails());
	}

}
