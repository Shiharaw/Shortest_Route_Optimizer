package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC6001_ClearSelection extends BaseClass {
	
	@Test
	public void verify_clear_selection() throws InterruptedException {
		
		logger.info("****Starting TC4002_CalculatePathManualMode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Calculate path and distance****");
			ac.UpdateDrpFromNode();
			ac.UpdateDrpToNode();
			ac.calculateNormal();
			
			Thread.sleep(5000);
			logger.info("****All fields should be cleared and reset****");
			ac.clearSelection();
			
			logger.info("****Verify Calculated path and distance are do not display****");
			boolean pathDisplayed = ac.isCalculatedPathDisplayed();
			Assert.assertFalse(pathDisplayed);
			boolean distanceDisplayed = ac.isCalculatedDistanceDisplayed();
			Assert.assertFalse(distanceDisplayed);
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC6001_ClearSelection*****");
	}

}
