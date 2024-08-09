package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AlgorithmCalculatorPage;


public class TC1001_EnableRandomMode extends BaseClass {
	
	@Test
	public void verify_enable_random_mode() throws InterruptedException {
		
		logger.info("****Starting TC1001_EnableRandomMode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Enable Random Mode****");
			ac.enableRandonMode();
		
			
			Thread.sleep(5000);
			
			logger.info("****Check enable the Random Mode button****");
			
			logger.info("****Check display the Refresh Icon****");
			boolean refreshIcon = ac.isIconRefreshExists();
			Assert.assertTrue(refreshIcon);
			
			logger.info("****Check existence of the Calculate Random button****");
			boolean calculateRandomBtn = ac.isbtnCalculateRandomExists();
			Assert.assertTrue(calculateRandomBtn);
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		logger.info("*****Finished TC1001_EnableRandomMode*****");
	}

}
