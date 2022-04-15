package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {

	public static WebDriver startApplication(WebDriver driver, String browser, String url) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecho.driver", "./Drivers/gechodriver.exe");
			driver = new FirefoxDriver();

		}else if (browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/iedriver.exe");
			driver = new InternetExplorerDriver();
		}
			else
			{
			System.out.println("we do not support browser");	
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
			

		
		return driver;
	}
	public static void quitApplication(WebDriver driver)
	{
		driver.quit();
	}
		
		


	

}
