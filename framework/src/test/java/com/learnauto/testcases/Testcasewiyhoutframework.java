package com.learnauto.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcasewiyhoutframework {


	@Test()
		public void test1()
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver  driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id=\"user-name\"] ")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id=\"password\"] ")).sendKeys("secret_sauce");
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//input[@id=\"login-button\"]  ")).click();
			

			
			
		}
	
}
