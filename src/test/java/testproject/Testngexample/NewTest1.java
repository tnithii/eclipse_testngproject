package testproject.Testngexample;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(groups= {"odd"})
  public void testcase1() {
	  System.out.println("odd");
  }
  @Test(groups= {"even"})
  public void testcase2() {
	  System.out.println("even");
  }
  @Test(groups= {"odd"})
  public void testcase3() {
	  System.out.println("odd");
  }
  
  @Test(groups= {"even"})
  public void testcase4() {
	  System.out.println("even");
  }
  @Test(groups= {"odd"})
  public void testcase5() {
	  System.out.println("odd");
  }
}
