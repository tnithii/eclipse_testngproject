package valid.invalidpacgefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Validlogin {

WebDriver driver;

	
	public Validlogin(WebDriver driver)
	{
			this.driver=driver;
	}
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement submit;
	
	public void Validloginmethod(String user,String pass) {
		

		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();

		
	}

}
