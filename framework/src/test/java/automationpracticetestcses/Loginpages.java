package automationpracticetestcses;


import org.testng.Assert;
import org.testng.annotations.Test;

import automationbaseclass.AutopracticeBaseclaa;

public class Loginpages extends AutopracticeBaseclaa{
	@Test(groups={"a2"})
	public void testCase001() {
		homepage.getSignin().click();
		authpage.setEmailbox("santosh@test.com");
		authpage.setPass("123456");
		authpage.getSgnin().click();
		
		System.out.println(myaccountpage.getSignout().isDisplayed());
		Assert.assertEquals(myaccountpage.getSignout().isDisplayed(), true);
		System.out.println("LoginTestcse001 Pass");
		
		//sysot print only cosole ony   ....
		//so print logrecords we use log4j
		log.info("LoginTestcse001 Pass");
		
		
	}
	@Test(groups= {"a3"})
	public void testCase002() {
		homepage.getSignin().click();
		authpage.setEmailbox("santosh@test.com");
		authpage.setPass("123456");
		authpage.getSgnin().click();
		System.out.println("LoginTestcse002 Pass");
		log.info("LoginTestcse002 Pass");
	
	

}
}