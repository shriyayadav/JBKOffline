package com.jbk.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jbk.ObjectRepository.LoginPageObjectRepository;

public class LoginPage extends LoginPageObjectRepository {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyURL() {
		String actual_title = driver.getTitle();
		String expected = "JavaByKiran | Log in";
		if (actual_title.equals(expected)) {
			System.out.println(actual_title + "  Title Match");
			return true;
		} else
			System.out.println(expected + "  Title not Match");
		return false;
	}

	public boolean verifyBlankEmail() {

		email.sendKeys("");
		password.sendKeys("123456");
		submitbtn.click();
		String actual = email_error.getText();
		String expected = "Please enter email";
		if (actual.equals(expected)) {
			System.out.println("Verify Blank email error message  " + actual);
			return true;
		} else
			System.out.println("Not Verify Blank email  error message " + expected);
		return false;

	}

	public boolean verifyBlankPassword() {

		email.sendKeys("kiran@gmail.com");

		password.sendKeys("");

		submitbtn.click();
		String actual = password_error.getText();
		String expected = "Please enter password.";
		if (actual.equals(expected)) {
			System.out.println("Verify Blank password error password  " + actual);
			return true;
		} else
			System.out.println("Not Verify Blank passworderror password  " + expected);
		return false;

	}

	public boolean verifyWrongEmail() {

		email.sendKeys("ikhfjh");

		password.sendKeys("123456");

		submitbtn.click();
		String actual = email_error.getText();
		String expected = "Please enter email as kiran@gmail.com";
		if (actual.equals(expected)) {
			System.out.println("Verify Wrong Email message  " + actual);
			return true;
		} else
			System.out.println("Not Verify Wrong Email  " + expected);
		return false;

	}

	public boolean verifyWrongPassword() {

		email.sendKeys("kiran@gmail.com");

		password.sendKeys("45666");
		submitbtn.click();
		String actual = password_error.getText();
		String expected = "Please enter password 123456";
		if (actual.equals(expected)) {
			System.out.println("Verify Wrong Password error message  " + actual);
			return true;
		} else
			System.out.println("Not Verify Wrong Password error message  " + expected);
		return false;

	}
	
	public DashboardPage navigateToDashboardPage(WebDriver driver) {

		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		submitbtn.click();
		return new DashboardPage(driver);
	}
	

	public boolean verifyLogIn() {

		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		submitbtn.click();
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Dashboard";
		if (actual.equals(expected)) {
			System.out.println("you are in dashboard page");
			return true;
		} else
			System.out.println("you are not in dashboard page , u still in log in page");
		return false;

	}

	public boolean verifyText() {
		String actual = sign_in_to_text.getText();
		String expected = "Sign in to start your session";
		if (actual.equals(expected)) {
			System.out.println("verify the text of Sign in to start your session");
			return true;
		} else
			System.out.println("not verify the text of Sign in to start your session");
		return false;
	}

	public boolean verifyMemberLinkSpell() {
		String actual = memberlink.getText();
		String expected = "Register a new membership";
		if (actual.equals(expected)) {
			System.out.println("verify text of register member link , the text is  " + actual);
			return true;
		} else
			System.out.println("not verify text of register member link, the text is  " + expected);
		return false;
	}

	public boolean verifySubject() {
		String actual = subject.getText();
		String expected = "JAVA | SELENIUM | PYTHON";
		Assert.assertEquals(actual, expected);
		if (actual.equals(expected)) {
			System.out.println("verify subject  " + actual);
			return true;
		} else
			System.out.println("not verify subject  " + expected);
		return false;
	}

	public boolean verifyEmailPlaceholder() {
		String actual = email.getAttribute("placeholder");
		String expected = "Email";
		if (actual.equals(expected)) {
			System.out.println("verify email placeholder : " + actual);
			return true;
		} else
			System.out.println("not verify email placeholder : " + expected);
		return false;
	}

	public boolean verifyPasswordPlaceholder() {
		String actual = password.getAttribute("placeholder");
		String expected = "Password";
		if (actual.equals(expected)) {
			System.out.println("verify password placeholder : " + actual);
			return true;
		} else
			System.out.println("not verify password placeholder : " + expected);
		return false;
	}

	public boolean verifyLogo() {
		return logo.isDisplayed();

	}

	public boolean verifyMemberLink() {

		memberlink.click();
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Registration Page";
		if (actual.equals(expected)) {
			System.out.println("verify Registration link & the title is " + actual);
			return true;
		} else
			System.out.println("not verify Registration link & the title is " + expected);
		return false;

	}
	
	public MembershipPage navigateToMembershipPage(WebDriver driver)
	{
		memberlink.click();
		return new MembershipPage(driver);
	}


}
