package automationpompracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Women')]") WebElement women;
	@FindBy(xpath="//a[contains(text(),'Popular')]") WebElement pop;	
	@FindBy(xpath="//a[contains(text(),'My orders')]") WebElement orders;
	@FindBy(xpath="(//a[@title=\"Dresses\"])[1]") WebElement dresses;
	@FindBy(xpath="//a[@title=\"View my shopping cart\"]") WebElement cart;
	@FindBy(xpath="//button[@name=\"submit_search\"]") WebElement button;
	@FindBy(xpath="//a[contains(text(),'Contac Us')]") WebElement contact;
	@FindBy(xpath="//input[@name=\"search_query\"]") WebElement search;
	@FindBy(xpath="//a[contains(text(),'Sign in')]") WebElement signin;


	public WebElement getSignin() {
		return signin;
	}
	
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(String valu) {
		this.search.sendKeys(valu);
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getPop() {
		return pop;
	}
	public WebElement getOrders() {
		return orders;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getButton() {
		return button;
	}
	public WebElement getContact() {
		return contact;
	}
}