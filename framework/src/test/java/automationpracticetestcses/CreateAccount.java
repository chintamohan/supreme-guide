package automationpracticetestcses;

import org.testng.annotations.Test;

import automationbaseclass.AutopracticeBaseclaa;

public class CreateAccount extends AutopracticeBaseclaa {

	@Test(groups= {"a1"})
	public void testcae001() {
		homepage.getSignin().click();
		authpage.setEmailregibox("mohanch12fg@gmail.com");
		authpage.getCreateaccountbutton().click();
		createaccountpage.setFirstname("mohan");
		createaccountpage.getGenderselectmale().click();
		createaccountpage.setLastname("ranga");
		createaccountpage	.setPassword("bassdd");
		createaccountpage.setDate("12");
		createaccountpage.setMonth("July");
		createaccountpage.setYear("1996");
		createaccountpage.setFirstname1("mohan");
		createaccountpage.setLastname1("ranga");
		createaccountpage.setCompany("daeg");
		createaccountpage.setAddrs("gunyu");
		createaccountpage.setCity("hyd");
		createaccountpage.setCountry("ind");
		createaccountpage.setState("ap");
		createaccountpage.setPostal("52200");
		createaccountpage.setPhone("7996453212");
		createaccountpage.getRegister().click();
		
	

}
}