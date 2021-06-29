package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjectRepository {
	
	@FindBy(xpath = "//b[contains(text(),'Java By Kiran')]")
	public WebElement text;

	@FindBy(xpath = "//h1")
	public WebElement dashboardlabel;

	@FindBy(partialLinkText = "LOGOUT")
	public WebElement logoutbtn;

	@FindBy(xpath = "//li[contains(text(),'MAIN NAVIGATION')]")
	public WebElement main_navigation_text;

	@FindBy(xpath = "//p[contains(text(),'Logout successfully')]")
	public WebElement logout_Successfully_text;

	@FindBy(xpath = "//li//span")
	public List<WebElement> dashboardMenu;

	@FindBy(xpath = "//h3")
	public List<WebElement> courses;

	@FindBy(xpath = "//section[@class='content' ]//following::p")
	public List<WebElement> subcourses;

	@FindBy(xpath = "//section[@class='content' ]//following::a")
	public List<WebElement> link;
	
	@FindBy(xpath="//li[3]/a/span")
	public WebElement userpagelink;
	
	@FindBy(xpath="//li[4]/a/span")
	public WebElement operatorpagelink;

}
