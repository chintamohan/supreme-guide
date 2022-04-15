package automationpompracticepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	WebDriver driver;
	public CreateAccount(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}

	
	@FindBy(xpath="//input[@id=\"id_gender1\"]") WebElement genderselectmale;
	@FindBy(xpath="(//input[@data-validate=\"isName\"])[1]") WebElement firstname;
	@FindBy(xpath="(//input[@data-validate=\"isName\"])[2]") WebElement lastname;
	@FindBy(xpath="(//input[@name=\"email\"])[1]") WebElement email;
	@FindBy(xpath="//input[@data-validate=\"isPasswd\"]") WebElement password;
	//dateof birth
	@FindBy(xpath="//select[@name=\"days\"]") WebElement date;
	@FindBy(xpath="//select[@name=\"months\"]") WebElement month;
	@FindBy(xpath="//select[@name=\"years\"]") WebElement year;
	@FindBy(xpath="//input[@id=\"newsletter\"]") WebElement newsletter;
	@FindBy(xpath="//input[@name=\"optin\"]") WebElement Recieveoffer;
	//your address
	@FindBy(xpath="//input[@id=\"firstname\"]") WebElement firstname1;
	@FindBy(xpath="//input[@id=\"lastname\"]") WebElement lastname1;
	@FindBy(xpath="//input[@id=\"company\"]") WebElement company;
	@FindBy(xpath="//input[@id=\"address1\"]") WebElement addrs;
	@FindBy(xpath="//input[@id=\"city\"]") WebElement city;
	@FindBy(xpath="//select[@id=\"id_state\"]") WebElement state;
	@FindBy(xpath="//input[@name=\"postcode\"]") WebElement postal;
	@FindBy(xpath="//select[@id=\"id_country\"]") WebElement country;
	@FindBy(xpath="//textarea[@cols=\"26\"]") WebElement text;
	@FindBy(xpath="//input[@id=\"phone_mobile\"]") WebElement phone;
	@FindBy(xpath="//input[@name=\"alias\"]") WebElement aliasaddress;
	@FindBy(xpath="//button[@id=\"submitAccount\"]") WebElement register;
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public WebElement getGenderselectmale() {
		return genderselectmale;
	}
	public void setGenderselectmale(String valu) {
		this.genderselectmale.sendKeys(valu);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(String valu) {
		this.firstname.sendKeys(valu);
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(String valu) {
		this.lastname.sendKeys(valu);
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String valu) {
		this.email.sendKeys(valu);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String valu) {
		this.password.sendKeys(valu);
	}
	public WebElement getDate() {
		return date;
	}
	public void setDate(String valu) {
		this.date.sendKeys(valu);
	}
	public WebElement getMonth() {
		return month;
	}
	public void setMonth(String valu) {
		this.month.sendKeys(valu);
	}
	public WebElement getYear() {
		return year;
	}
	public void setYear(String valu) {
		this.year.sendKeys(valu);
	}
	public WebElement getNewsletter() {
		return newsletter;
	}
	
	public WebElement getRecieveoffer(String valu) {
		return Recieveoffer;
	}
	public void setRecieveoffer(String valu) {
		Recieveoffer.sendKeys(valu);
	}
	public WebElement getFirstname1() {
		return firstname1;
	}
	public void setFirstname1(String valu) {
		this.firstname1.sendKeys(valu);
	}
	public WebElement getLastname1() {
		return lastname1;
	}
	public void setLastname1(String valu) {
		this.lastname1.sendKeys(valu);
	}
	public WebElement getCompany() {
		return company;
	}
	public void setCompany(String valu) {
		this.company.sendKeys(valu);
	}
	public WebElement getAddrs() {
		return addrs;
	}
	public void setAddrs(String valu) {
		this.addrs.sendKeys(valu);
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(String valu) {
		this.city.sendKeys(valu);
	}
	public WebElement getState() {
		return state;
	}
	public void setState(String valu) {
		this.state.sendKeys(valu);
	}
	public WebElement getPostal() {
		return postal;
	}
	public void setPostal(String valu) {
		this.postal.sendKeys(valu);
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(String valu) {
		this.country.sendKeys(valu);
	}
	public WebElement getText() {
		return text;
	}
	public void setText(String valu) {
		this.text.sendKeys(valu);
	}
	public WebElement getPhone() {
		return phone;
	}
	public void setPhone(String valu) {
		this.phone.sendKeys(valu);
	}
	public WebElement getAliasaddress() {
		return aliasaddress;
	}
	public void setAliasaddress(String valu) {
		this.aliasaddress.sendKeys(valu);
	}
	public WebElement getRegister() {
		return register;
	}
	public void setRegister(String valu) {
		this.register.sendKeys(valu);
	}

} 
