package testproject.Testngexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import valid.invalidpacgefactory.Invalidlogin;
import valid.invalidpacgefactory.Validlogin;

public class OrangeHRM_testNG_Pagefactory {
	WebDriver driver;
	Validlogin validlog;
	Invalidlogin invalidlog;
	@FindBy(id = "spanMessage")
	WebElement message;
	File f;
	FileInputStream fis;
	Properties p;

	@Test(priority = 1)
	public void validtest() {
		System.out.println("hello test");
		validlog = new Validlogin(driver);

		Validlogin validlog = PageFactory.initElements(driver, Validlogin.class);
		validlog.Validloginmethod(p.getProperty("Username_value"), p.getProperty("Password_value"));

	}

	@Test(priority = 2)
	public void invalidtest() {
		System.out.println("hello all");
		Invalidlogin invalidlog = PageFactory.initElements(driver, Invalidlogin.class);
		invalidlog.invalidloginmethod(p.getProperty("InvalidUsername_value"), p.getProperty("Invalidpassword_value"));

		/*
		 * String invalidmsg = message.getText(); System.out.println(invalidmsg); String
		 * expectedmsg = "Invalid credentials"; if (invalidmsg.equals(expectedmsg)) {
		 * System.out.println("test pass"); }
		 */

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		f = new File("C:\\Users\\Home\\Selenium_Starts\\Testngexample\\config4.properties");
		fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		driver.get(p.getProperty("Url"));
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
