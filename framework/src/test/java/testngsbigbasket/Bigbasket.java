package testngsbigbasket;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Bigbasket extends TestBse{
	WebDriver driver;
	
	@Test(groups= {"p1"}, dependsOnMethods = "test2")
	@Parameters({"vegName1","vegName2"})
	public void testcae1ve(String name1, String name2) {
		String veg =name1;

		Actions action = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id=\"input\"]"));
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(veg).build().perform();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		
	}
	
	@Test(groups= {"p2"})

	@Parameters({"vegName1","vegName2"})
	public void test2(String name1, String name2) {

		Actions act = new Actions(driver);
		WebElement cli = driver.findElement(By.xpath("//input[@id=\"input\"]"));
		act.moveToElement(cli).click().sendKeys(name2).click().build().perform();


		@Test(groups= {"p2"})

	@Parameters({"vegName1","vegName2"})
	public void test2(String name1, String name2) {

		Actions act = new Actions(driver);
		WebElement cli = driver.findElement(By.xpath("//input[@id=\"input\"]"));
		act.moveToElement(cli).click().sendKeys(name2).click().build().perform();

	
	
	}
	
	
	
	

		
		

	

}
