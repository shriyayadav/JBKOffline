package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepository extends PageBase{
	
	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitbtn;

	@FindBy(id = "email_error")
	public WebElement email_error;

	@FindBy(id = "password_error")
	public WebElement password_error;

	@FindBy(xpath = "//p")
	public WebElement sign_in_to_text;

	@FindBy(xpath = "//a[starts-with(@href, \"pages\")]")
	public WebElement memberlink;

	@FindBy(xpath = "//h4")
	public WebElement subject;

	@FindBy(xpath = "//img")
	public WebElement logo;

}
