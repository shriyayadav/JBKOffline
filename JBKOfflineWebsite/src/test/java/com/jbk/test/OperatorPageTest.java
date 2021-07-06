package com.jbk.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.page.OperatorPage;

import jxl.read.biff.BiffException;

public class OperatorPageTest extends TestBase {

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

	@Test
	public void verifyHeader() throws BiffException, IOException {
		Assert.assertTrue(op.verifyHeader());

	}

	@Test
	public void verifyNameAvlOnlyWhatApp() throws BiffException, IOException {
		Assert.assertTrue(op.verifyNameAvlOnlyWhatApp());

	}

	@Test
	public void verifyNameAvlTechnicalHelp() throws BiffException, IOException {
		Assert.assertTrue(op.verifyNameAvlTechnicalHelp());

	}

	@Test
	public void verifyNameAvlforEnquiry() throws BiffException, IOException {
		Assert.assertTrue(op.verifyNameAvlforEnquiry());

	}

	@Test
	public void verifyAvaibilityofDays() throws BiffException, IOException {
		Assert.assertTrue(op.verifyAvaibilityofDays());
	}

	@Test
	public void verifyserialnumber() throws BiffException, IOException {
		Assert.assertTrue(op.verifyserialnumber());

	}

	@Test
	public void verifyUserContactNoAndTiming() throws BiffException, IOException {
		Assert.assertTrue(op.verifyUserContactNoAndTiming());
	}

	@Test
	public void verifyDetailedDescription() throws BiffException, IOException {
		Assert.assertTrue(op.verifyDetailedDescription());

	}

	@Test
	public void verifyuserAvlAllModeofContact() throws BiffException, IOException {
		Assert.assertTrue(op.verifyuserAvlAllModeofContact());
	}

	@Test
	public void verifyMaximumTiming() {
		op.verifyMaximumTiming();
	}
}
