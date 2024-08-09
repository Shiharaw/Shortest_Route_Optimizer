package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;


public class TC1002_DisableRandomMode extends BaseClass {
	
	@Test
	public void verify_disable_random_mode() {
		
		logger.info("****Starting TC1002_DisableRandomMode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Check disable the Random Mode button****");
			
			logger.info("****Check display the Refresh Icon****");
			boolean refreshIcon = ac.isIconRefreshExists();
			Assert.assertFalse(refreshIcon);
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC1002_DisableRandomMode*****");
	}

}
