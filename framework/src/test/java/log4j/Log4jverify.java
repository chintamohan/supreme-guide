package log4j;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;	

public class Log4jverify {

	  public Logger log= LogManager.getLogger(Log4jverify.class.getName());

	  @Test
	  public void doIt() {
	    log.info("iam from info");
	    log.error("Did it again!");
	    System.out.println("we are done  .......fghbdfb");
	  }
	

}
