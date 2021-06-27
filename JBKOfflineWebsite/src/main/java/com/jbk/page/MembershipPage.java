package com.jbk.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.ObjectRepository.MembershipPageObjectRepository;

public class MembershipPage extends MembershipPageObjectRepository {

	WebDriver driver;

	public MembershipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyMemberTitle() {
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Registration Page";
		if (actual.equals(expected)) {
			System.out.println("you are in registration page " + actual);
			return true;
		} else
			System.out.println("you are not yet click on registration title " + expected);
		return false;
	}

	public boolean verifyURL() {
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		String expected = "file:///E:/Shreya%20Yadav/Offline%20Website/Offline%20Website/pages/examples/register.html";
		if (actual.equals(expected)) {
			System.out.println("Current Url is " + actual);
			return true;
		} else
			System.out.println("Wrong URL " + expected);
		return false;
	}

	public boolean verifyHeadline() {

		String actual = headline.getText();
		String expected = "Java By Kiran";
		if (actual.equals(expected)) {
			System.out.println("Headline " + actual);
			return true;
		} else
			System.out.println("Wrong headline " + expected);
		return false;

	}

	public boolean verifyTagline() {
		String actual = tagline.getText();
		String expected = "Register a new membership";
		if (actual.equals(expected)) {
			System.out.println("Tagline " + actual);
			return true;
		} else
			System.out.println("Wrong Tagline " + expected);
		return false;
	}

	public boolean verifyNamePlaceholder() {
		String actual = name.getAttribute("placeholder");
		String expected = "Name";
		if (actual.equals(expected)) {
			System.out.println("Correct Placeholder " + actual);
			return true;
		} else
			System.out.println("Wrong Placeholder " + expected);
		return false;
	}

	public boolean verifyMobilePlaceholder() {
		String actual = mobile.getAttribute("placeholder");
		String expected = "Mobile";
		Assert.assertEquals(actual, expected);
		if (actual.equals(expected)) {
			System.out.println("Correct Placeholder " + actual);
			return true;
		} else
			System.out.println("Wrong Placeholder " + expected);
		return false;
	}

	public boolean verifyEmailPlaceholder() {
		String actual = email.getAttribute("placeholder");
		String expected = "Email";
		Assert.assertEquals(actual, expected);
		if (actual.equals(expected)) {
			System.out.println("Correct Placeholder " + actual);
			return true;
		} else
			System.out.println("Wrong Placeholder " + expected);
		return false;
	}

	public boolean verifyPasswordPlaceholder() {
		String actual = password.getAttribute("placeholder");
		String expected = "Password";
		if (actual.equals(expected)) {
			System.out.println("Correct Placeholder " + actual);
			return true;
		} else
			System.out.println("Wrong Placeholder " + expected);
		return false;
	}

	public boolean verifyBlankName() {
		name.sendKeys("");
		submitbtn.click();
		String actual = name_error.getText();
		String expected = "Please enter Name.";
		if (actual.equals(expected)) {
			System.out.println("verify error message text " + actual);
			return true;
		} else
			System.out.println("not verify error message text " + expected);
		return false;
	}

	public boolean verifyBlankMobile() {
		mobile.sendKeys("");
		submitbtn.click();
		String actual = mobile_error.getText();
		String expected = "Please enter Mobile.";
		if (actual.equals(expected)) {
			System.out.println("verify error message text " + actual);
			return true;
		} else
			System.out.println("not verify error message text " + expected);
		return false;
	}

	public boolean verifyBlankEmail() {
		email.sendKeys("");
		submitbtn.click();
		String actual = email_error.getText();
		String expected = "Please enter Email.";
		if (actual.equals(expected)) {
			System.out.println("verify error message text " + actual);
			return true;
		} else
			System.out.println("not verify error message text " + expected);
		return false;
	}

	// verify Blank password Error Message
	@Test
	public boolean verifyBlankPassword() {
		password.sendKeys("");
		submitbtn.click();
		String actual = password_error.getText();
		String expected = "Please enter Password.";
		if (actual.equals(expected)) {
			System.out.println("verify error message text " + actual);
			return true;
		} else
			System.out.println("not verify error message text " + expected);
		return false;
	}

	public boolean verifyTextBox() {
		name.sendKeys("shreya");
		mobile.sendKeys("9763011849");
		email.sendKeys("shreya@gmail.com");
		password.sendKeys("shreya123");
		submitbtn.click();
		Alert al = driver.switchTo().alert();
		String actual = al.getText();
		al.accept();
		String expected = "User registered successfully.";
		if (actual.equals(expected)) {
			System.out.println("verify error message text " + actual);
			return true;
		} else
			System.out.println("not verify error message text " + expected);
		return false;
	}

	public boolean verifyAlreadyMemberLinkSpell() {
		String actual = already_membership_link.getText();
		String expected = "I already have a membership";
		if (actual.equals(expected)) {
			System.out.println("already have membership text " + actual);
			return true;
		} else
			System.out.println("already have membership text not right " + expected);
		return false;
	}

	public boolean verifyAlreadyMemberLink() {
		already_membership_link.click();
		String actual = driver.getTitle();
		String expected = "JavaByKiran | Log in";
		if (actual.equals(expected)) {
			System.out.println("successfully click on already have membership link " + actual);
			return true;
		} else
			System.out.println("not able to click on already have membership link " + expected);
		return false;
	}
}
