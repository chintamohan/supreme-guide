package listenerss;

import org.testng.ITestListener;
import org.testng.ITestResult;

import automationbaseclass.AutopracticeBaseclaa;

public class Listeners extends AutopracticeBaseclaa implements ITestListener{
	
	
	public void onTestStart(ITestResult result ) {
		log.info("new test start : "+result.getName());
	} 
	public void onTestSucces(ITestResult result) {
		log.info("test successfully finished :"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		log.info("Test failed: "+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		log.info("test skipped :"+result.getName());
	}

}
