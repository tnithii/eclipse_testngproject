package testproject.Testngexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Assertexample {
  @Test(dependsOnMethods={"registration"})
  public void login() {
	  
	  System.out.println("login success");
  } @Test
  public void registration() {
	  
	  SoftAssert softassert=new SoftAssert();
	 
	  softassert.assertEquals("valid","invalid");
	  System.out.println("registration success");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
