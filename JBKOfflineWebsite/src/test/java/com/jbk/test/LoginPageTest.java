package com.jbk.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.page.LoginPage;

public class LoginPageTest extends TestBase {

	WebDriver driver;
	public LoginPage lp = null;
	
	@BeforeMethod
	public void setUp() throws IOException {

		driver = super.launchApplication();
		lp = loadLoginPage();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyURL() {
		assertTrue(lp.verifyURL());
	}

	@Test
	public void verifyBlankEmail() {
		assertTrue(lp.verifyBlankEmail());
	}

	@Test
	public void verifyBlankPassword() {
		assertTrue(lp.verifyBlankPassword());
	}

	@Test
	public void verifyWrongEmail() {
		assertTrue(lp.verifyWrongEmail());
	}

	@Test
	public void verifyWrongPassword() {
		assertTrue(lp.verifyWrongPassword());
	}

	@Test
	public void verifyLogIn() {
		assertTrue(lp.verifyLogIn());

	}

	@Test
	public void verifyText() {
		assertTrue(lp.verifyText());
	}

	@Test
	public void verifyMemberLinkSpell() {
		assertTrue(lp.verifyMemberLinkSpell());
	}

	@Test
	public void verifySubject() {
		assertTrue(lp.verifySubject());
	}

	@Test
	public void verifyEmailPlaceholder() {
		assertTrue(lp.verifyEmailPlaceholder());
	}

	@Test
	public void verifyPasswordPlaceholder() {
		assertTrue(lp.verifyPasswordPlaceholder());
	}

	@Test
	public void verifyLogo() {
		assertTrue(lp.verifyLogo());
	}

	@Test
	public void verifyMemberLink() {
		assertTrue(lp.verifyMemberLink());
	}

}
