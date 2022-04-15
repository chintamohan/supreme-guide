package frameworkcom.learnauto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver ldriver)
	{
		//ldriver will actually come from the actual main test case, what ever ldriver reference come from main gtest case   will store into driver
		
		this.driver=ldriver;
	}
	@FindBy(xpath="//input[@id='user-name']") WebElement user;
	@FindBy(xpath="//input[@id='password']") WebElement pass;
	@FindBy ( name= "//*[@id=\"login-button\"]") WebElement log;


 
public void loginToSwag(String usernameapp, String passwordapp)
{
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	user.sendKeys(usernameapp);
	pass.sendKeys(passwordapp);
	log.click();
}
}