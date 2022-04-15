package automationpompracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationpageLogin {
	WebDriver driver; 
	public AuthenticationpageLogin(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//a[@title=\"Return to Home\"]") WebElement home;
	@FindBy(xpath="(//label[contains(text(),'Email address')])[1]]") WebElement email;
	@FindBy(xpath="//input[@id=\"email_create\"]") WebElement emailregibox;
	@FindBy(xpath="//input[@id=\"email\"]") WebElement emailbox;
	@FindBy(xpath="//button[@name=\"SubmitLogin\"]") WebElement sgnin;
	@FindBy(xpath="//input[@id=\"passwd\"]") WebElement pass;
	@FindBy(xpath="//button[@id=\"SubmitCreate\"]") WebElement createaccountbutton;
	
	
	public WebElement getCreateaccountbutton() {
		return createaccountbutton;
	}
	public WebElement getEmailregibox() {
		return emailregibox;
	}
	public void setEmailregibox(String valu) {
		this.emailregibox.sendKeys(valu);
	}
	public WebElement getEmailbox() {
		return emailbox;
	}
	public void setEmailbox(String valu) {
		this.emailbox.sendKeys(valu);
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(String valu) {
		this.pass.sendKeys(valu);;
	}
	public WebElement getHome() {
		return home;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getSgnin() {
		return sgnin;
	}


}
