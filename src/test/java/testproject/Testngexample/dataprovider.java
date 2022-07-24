package testproject.Testngexample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void valid_and_invalid(String user, String pass) {
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("validation done");
		/*
		 * String invalidmsg = driver.findElement(By.id("spanMessage")).getText();
		 * String expectedmsg = "Invalid credentials"; if
		 * (invalidmsg.equals(expectedmsg)) { System.out.println("test pass"); }
		 */

	}

	@BeforeMethod
	public void beforeMethod(ITestResult result) {
		Reporter.setCurrentTestResult(result);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.manage().window().maximize();
		Reporter.log("Browser initialized");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		Reporter.setCurrentTestResult(result);
		driver.quit();
		Reporter.log("Browser closed");
	}

	@DataProvider(name = "testdata")
	public Object[][] data() {
		return new Object[][] { { "Admin", "admin123" }, { "admin1", "admin1234" } };
	}

	/*
	 * @AfterMethod public void reportTest(ITestResult result) {
	 * Reporter.setCurrentTestResult(result); Reporter.log("Message to be printed");
	 * }
	 */
}
