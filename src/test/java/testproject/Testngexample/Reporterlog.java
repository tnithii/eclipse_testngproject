package testproject.Testngexample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reporterlog {
	@Test
	public void f() {
		Reporter.log("hi ");
	}

	@Test
	public void f1() {
		Reporter.log("hello ");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		Reporter.setCurrentTestResult(result);
		Reporter.log("Browser closed");
	}

	@BeforeMethod
	public void beforeMethod(ITestResult result) {
		Reporter.setCurrentTestResult(result);
		Reporter.log("Browser opened");
	}
}
