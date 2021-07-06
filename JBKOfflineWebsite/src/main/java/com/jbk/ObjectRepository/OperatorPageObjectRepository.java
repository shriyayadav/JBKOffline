package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPageObjectRepository extends PageBase{

	@FindBy(xpath = "//th")
	public List<WebElement> header;

	@FindBy(xpath = "//td[1]")
	public List<WebElement> serialnumber;

	@FindBy(xpath = "//td[2]")
	public List<WebElement> person;

	@FindBy(xpath = "//td[3]")
	public List<WebElement> availablefor;

	@FindBy(xpath = "//td[4]")
	public List<WebElement> wayofContact;

	@FindBy(xpath = "//td[5]")
	public List<WebElement> contactNo;

	@FindBy(xpath = "//td[6]//following-sibling::b")
	public List<WebElement> days;

	@FindBy(xpath = "//td[6]")
	public List<WebElement> timing;

}
