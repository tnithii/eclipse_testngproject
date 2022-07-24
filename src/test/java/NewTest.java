import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;

	@Test(priority=1)
	public void validtest() {
		System.out.println("hello test");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("page logged in");

	}

	@Test(priority=2,enabled=false)
	public void invalidtest() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin1");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
		driver.findElement(By.id("btnLogin")).click();
		String invalidmsg = driver.findElement(By.id("spanMessage")).getText();
		String expectedmsg = "Invalid credentials";
		if (invalidmsg.equals(expectedmsg)) {
			System.out.println("test pass");
		}

	}
	
	  @BeforeMethod 
	  public void beforeMethod(ITestResult result) {
		  Reporter.setCurrentTestResult(result);
	  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials"); 
	  driver.manage().window().maximize(); }
	 

	@AfterMethod
	public void afterMethod(ITestResult result) {
		Reporter.setCurrentTestResult(result);
		driver.close();
		Reporter.log("Browser closed");
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
