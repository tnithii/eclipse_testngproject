package testproject.Testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterisation {
	WebDriver driver;
	 
	  @Test
	  @Parameters({"user","pass"})
	  public void invalidtest(String user_name,String paas_word) 
	  {

			driver.findElement(By.id("txtUsername")).sendKeys(user_name);
			driver.findElement(By.id("txtPassword")).sendKeys(paas_word);
			driver.findElement(By.id("btnLogin")).click();
			System.out.println("hello");
		
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
			driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		 driver.close();
		  
	  }



	}
