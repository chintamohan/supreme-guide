package automationbaseclass;

import java.io.File;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import automationpompracticepages.AuthenticationpageLogin;
import automationpompracticepages.CreateAccount;
import automationpompracticepages.FooterLinks;
import automationpompracticepages.HomePage;
import automationpompracticepages.Myaccountpage;
import listenerss.EventListener;
import log4j.Log4jverify;

public class AutopracticeBaseclaa {
	
	public File file;
	public FileInputStream inputstream;
	Properties prop;
	WebDriver ldriver;
	
	 public AuthenticationpageLogin authpage;
	 public FooterLinks footpage;
	 public CreateAccount createaccountpage;
	 public HomePage homepage;
	 public  Myaccountpage myaccountpage;
	 //for logreports
	  public Logger log= LogManager.getLogger(Log4jverify.class.getName());

	@BeforeClass(groups= {"a1","a2","a3"})
	public void navigateBrowser() throws IOException {

		file = new File("C:\\eclipse_ origi\\framework\\src\\main\\resources\\readingproperties\\config.properties");
	    inputstream = new FileInputStream(file);
		prop = new Properties();
		prop.load(inputstream);
		prop.getProperty("Browser");
		
		if(prop.getProperty("Browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Browserdrivers/chromedriver.exe");
			ldriver=new ChromeDriver();
		}else if(prop.getProperty("Broowser").equals("Edge")) {
			System.setProperty("webdriver.chrome.driver", "./Browserdrivers/msedgedriver.exe");
			ldriver=new EdgeDriver();
		}else if(prop.getProperty("Browser").equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Browserdrivers/geckodriver.exe");
			ldriver=new FirefoxDriver();
		}
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		//for eventlistener    -------------------------------------------------------------------------------------------->>>>
		
		//class file
		EventListener ecapture = new EventListener();
		
		//pass the driver to EventFringeWebDriver
		
		@SuppressWarnings("deprecation")
		EventFiringWebDriver eventhandler = new EventFiringWebDriver(ldriver);
		
		//pass ecapture to eventhandlger
		eventhandler.register(ecapture);
		
		//pass eventHandler as argumentto a;; the objects of the class instead of 'driver'
		
		authpage = new AuthenticationpageLogin(eventhandler);
		footpage = new FooterLinks(eventhandler);
		createaccountpage = new CreateAccount(eventhandler);
		homepage = new HomePage(eventhandler);
		myaccountpage = new Myaccountpage(eventhandler);

		
		
		//--------------------------------------------------------------------------------------
		
		/*authpage = new AuthenticationpageLogin(ldriver);
		footpage = new FooterLinks(ldriver);
		createaccountpage = new CreateAccount(ldriver);
		homepage = new HomePage(ldriver);
		myaccountpage = new Myaccountpage(ldriver);*/
	}
	@BeforeMethod(groups= {"a1","a2","a3"})
	public void beforelaunch() {
		ldriver.get(prop.getProperty("URL"));
		
	}
	@AfterMethod(groups= {"a1","a2","a3"})
	public void signout() {
		myaccountpage.getSignout().click();
	}
	@AfterClass(groups= {"a1","a2","a3"})
	public void closeBrowser() {
		ldriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	

}
