package all;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettingprop {
	
	public WebDriver driver;
	public Properties property;
	public FileInputStream input;
	
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver","./Broserdrivers/chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		property= new Properties();
		input = new FileInputStream("C:\\eclipse_ origi\\framework\\src\\main\\resources\\readingproperties\\config.properties");
		property.load(input);
		driver.get(property.getProperty("Browser"));

		
	}

}
