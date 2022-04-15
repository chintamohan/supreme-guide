package automationpompracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccountpage {
	
	WebDriver driver;
	public Myaccountpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Sign out')])[1]") WebElement signout;
	@FindBy(xpath="(//span[contains(text(),'Order history and details')])[1]") WebElement orderhitory;
	@FindBy(xpath="(//span[contains(text(),'My credit slips')])[1]") WebElement creditslip;
	@FindBy(xpath="(//span[contains(text(),'My addresses')])[1]") WebElement address;
	@FindBy(xpath="//a[@title=\"Home\"]//child::span") WebElement homee;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getOrderhitory() {
		return orderhitory;
	}
	public WebElement getCreditslip() {
		return creditslip;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getHomee() {
		return homee;
	}
}
