package com.jbk.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.page.MembershipPage;

public class MemberPageTest extends TestBase {

	WebDriver driver;
	public MembershipPage mp = null;

	@BeforeMethod
	public void setUp() throws IOException {

		driver = super.launchApplication();
		mp = loadLoginPage().navigateToMembershipPage(driver);
		mp = new MembershipPage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyMemberTitle() {
		assertTrue(mp.verifyMemberTitle());
	}

	@Test
	public void verifyURL() {
		assertTrue(mp.verifyURL());
	}

	@Test
	public void verifyHeadline() {
		assertTrue(mp.verifyHeadline());
	}

	@Test
	public void verifyTagline() {
		assertTrue(mp.verifyTagline());
	}

	@Test
	public void verifyNamePlaceholder() {
		assertTrue(mp.verifyNamePlaceholder());
	}

	@Test
	public void verifyMobilePlaceholder() {
		assertTrue(mp.verifyMobilePlaceholder());
	}

	@Test
	public void verifyEmailPlaceholder() {
		assertTrue(mp.verifyEmailPlaceholder());
	}

	@Test
	public void verifyPasswordPlaceholder() {
		assertTrue(mp.verifyPasswordPlaceholder());
	}

	@Test
	public void verifyBlankName() {
		assertTrue(mp.verifyBlankName());
	}

	@Test
	public void verifyBlankMobile() {
		assertTrue(mp.verifyBlankMobile());
	}

	@Test
	public void verifyBlankEmail() {
		assertTrue(mp.verifyBlankEmail());
	}

	@Test
	public void verifyBlankPassword() {
		assertTrue(mp.verifyBlankPassword());
	}

	@Test
	public void verifyTextBox() {
		assertTrue(mp.verifyTextBox());
	}

	@Test
	public void verifyAlreadyMemberLinkSpell() {
		assertTrue(mp.verifyAlreadyMemberLinkSpell());
	}

	@Test
	public void verifyAlreadyMemberLink() {
		assertTrue(mp.verifyAlreadyMemberLink());
	}

}
