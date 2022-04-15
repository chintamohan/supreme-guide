package testngsbigbasket;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBse {
	WebDriver driver;

	@BeforeMethod(groups= {"p1","p2"})
	 public void navigatetoApplication() {
		System.setProperty("webdriver.chrome.driver", "./Browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");

	}
	@AfterMethod(groups= {"p1","p2"})
	public void closeApplication() {
		//driver.close();

}
}