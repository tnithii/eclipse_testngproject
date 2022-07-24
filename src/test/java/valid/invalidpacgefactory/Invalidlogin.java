package valid.invalidpacgefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Invalidlogin {

WebDriver driver;

	
	public Invalidlogin(WebDriver driver)
	{
			this.driver=driver;
	}
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement submit;
	/*
	 * @FindBy(id="spanMessage") WebElement message;
	 */
	
	public void invalidloginmethod(String user,String pass) {
		

		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		/*
		 * String invalidmsg = message.getText(); System.out.println(invalidmsg); String
		 * expectedmsg = "Invalid credentials"; if (invalidmsg.equals(expectedmsg)) {
		 * System.out.println("test pass"); }
		 */ 
		
	}

}

