package com.learnauto.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.Browserfactory;

public class Baseclass {
	
	  public WebDriver driver;
	@BeforeClass(groups={"p1","p2"})
	public void setUp()
	
	{
		driver =Browserfactory.startApplication(driver, "chrome", "https://www.saucedemo.com/");

	}
	@AfterClass
	public void tearDown()
	{
		Browserfactory.quitApplication(driver); 

	}

}
