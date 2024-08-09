package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC2001_RefreshRandomNodes extends BaseClass {
	
	@Test
	public void verify_refresh_random_nodes() throws InterruptedException {
		
		logger.info("****Starting TC2001_RefreshRandomNodes****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Enable the Random Mode button****");
			ac.enableRandonMode();
			String valueFrNodeBFR=ac.RndValueDrpFromNode();
			String valueToNodeBFR=ac.RndValueDrpToNode();
			
			logger.info("****Click Refresh button****");
			ac.refresh();
			Thread.sleep(2000);
			
			logger.info("****Verify From Node and To Node are refreshed****");
			String valueFrNodeAFR=ac.RndValueDrpFromNode();
			String valueToNodeAFR=ac.RndValueDrpToNode();
			if(valueFrNodeBFR!=valueFrNodeAFR && valueToNodeBFR!=valueToNodeAFR) {
				System.out.println("Rrandom refresh is verified- pass");
				Assert.assertTrue(true);
			}
			else {
				System.out.println("Rrandom refresh is verified- fail");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC2001_RefreshRandomNodes*****");
	}

}
