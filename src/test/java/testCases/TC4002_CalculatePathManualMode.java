package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC4002_CalculatePathManualMode extends BaseClass{
	
	@Test
	public void verify_calculate_path_maual_mode() {
		
		logger.info("****Starting TC4002_CalculatePathManualMode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Calculate path and distance****");
			ac.UpdateDrpFromNode();
			ac.UpdateDrpToNode();
			ac.calculateNormal();
			
			logger.info("****Verify Calculated path and distance are displayed****");
			boolean pathDisplayed = ac.isCalculatedPathDisplayed();
			Assert.assertTrue(pathDisplayed);
			boolean distanceDisplayed = ac.isCalculatedDistanceDisplayed();
			Assert.assertTrue(distanceDisplayed);
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC4002_CalculatePathManualMode*****");
	}

}
