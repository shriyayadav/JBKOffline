package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageObjectRepository {
	
	@FindBy(xpath = "//table[@class='table table-hover']")
	public WebElement table;

	@FindBy(tagName = "tr")
	public List<WebElement> rows;

	@FindBy(tagName = "th")
	public List<WebElement> header;

	@FindBy(tagName = "td")
	public List<WebElement> cols;

	@FindBy(xpath = "//td[2]")
	public List<WebElement> username;

	@FindBy(xpath = "//td[3]")
	public List<WebElement> mail;

	@FindBy(xpath = "//td[4]")
	public List<WebElement> mobile;

	@FindBy(xpath = "//td[5]")
	public List<WebElement> course;

	@FindBy(xpath = "//td[6]")
	public List<WebElement> gender;

	@FindBy(xpath = "//td[7]")
	public List<WebElement> state;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	public WebElement addUserButton;

	@FindBy(xpath = "//h1")
	public WebElement headline;
	
	@FindBy(xpath = "//h3[contains(text(),'Fill Below Details')]")
	public WebElement heading;
	
	@FindBy(id="username")
	public WebElement usernameAddUser;
	
	@FindBy(id="mobile")
	public WebElement mobileAddUser;
	
	@FindBy(id="email")
	public WebElement emailAddUser;
	
	@FindBy(id="course")
	public WebElement courseAddUser;
	
	@FindBy(id="Female")
	public WebElement FemaleAddUser;
	
	@FindBy(id="Male")
	public WebElement MaleAddUser;
	
	@FindBy(xpath="//div//following::select")
	public WebElement stateAddUser;
	
	@FindBy(id="password")
	public WebElement passwordAddUser;
	
	@FindBy(id="submit")
	public WebElement submitAddUser;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement cancelBtn;

}
