package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MembershipPageObjectRepository {
	
	@FindBy(xpath = "//b")
	public WebElement headline;

	@FindBy(xpath = "//p")
	public WebElement tagline;

	@FindBy(id = "name")
	public WebElement name;

	@FindBy(id = "mobile")
	public WebElement mobile;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "name_error")
	public WebElement name_error;
	
	@FindBy(id = "mobile_error")
	public WebElement mobile_error;

	@FindBy(id = "email_error")
	public WebElement email_error;
	
	@FindBy(id = "password_error")
	public WebElement password_error;
	
	@FindBy(partialLinkText="I already")
	public WebElement already_membership_link;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitbtn;

}
