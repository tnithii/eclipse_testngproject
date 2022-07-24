package testproject.Testngexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class invocationcountexample {
  @Test(invocationCount=2)
  public void f() {
	  System.out.println("hello");
	  Reporter.log("report testpass",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("welcome");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("here");
  }

}
