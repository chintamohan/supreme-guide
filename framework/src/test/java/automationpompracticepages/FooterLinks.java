package automationpompracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterLinks {
	WebDriver driver;
	public FooterLinks(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'My credit slips')]") WebElement creditbo;
	@FindBy(xpath="//a[contains(text(),'My addresses')]") WebElement address;
	@FindBy(xpath="//a[contains(text(),'My personal info')]") WebElement info;
	@FindBy(xpath="//a[contains(text(),'About us')]") WebElement about ;
	@FindBy(xpath="//a[contains(text(),'Terms and conditions of use')]") WebElement terms;
	
	public WebElement getCreditbo() {
		return creditbo;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getInfo() {
		return info;
	}
	public WebElement getAbout() {
		return about;
	}
	public WebElement getTerms() {
		return terms;
	}

	

}
