package com.learnauto.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utility.Browserfactory;

import frameworkcom.learnauto.pages.Loginpage;

public class Loginwithfarame extends Baseclass {


	@Test(groups="p1")

	public void loginApp() {

		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		loginpage.loginToSwag("standard_user", "secret_sauce");

	}
	
	@Test(groups="p2")
	public void logout() {
		System.out.println("gggg");

	}
	

}
