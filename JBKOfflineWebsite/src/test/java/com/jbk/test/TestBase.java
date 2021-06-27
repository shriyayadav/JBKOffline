package com.jbk.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jbk.page.LoginPage;

public class TestBase {

	public static WebDriver driver;
	Properties prop = null;
	FileInputStream fis = null;
	public LoginPage lp = null;

	String readAnyProperty(String propName) throws IOException {
		String val = null;
		fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "/config.properties");
		prop = new Properties();
		prop.load(fis);
		val = prop.getProperty(propName);
		return val;
	}

	public WebDriver launchApplication() throws IOException {
		String url = readAnyProperty("url");
		String browser = readAnyProperty("browser");

		if ("Chrome".equals(browser)) {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if ("Firefox".equals(browser)) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
	
	public LoginPage loadLoginPage()
	{
		lp=new LoginPage(driver);
		return lp;
	}
}
