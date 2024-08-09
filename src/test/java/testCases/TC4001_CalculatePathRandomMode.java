package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC4001_CalculatePathRandomMode extends BaseClass {
	
	@Test
	public void verify_calculate_path_random_mode() {
		
		logger.info("****Starting TC4001_CalculatePathRandomMode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Calculate path with random nodes****");
			ac.enableRandonMode();
			ac.refresh();
			ac.calculateRandom();
			
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
		
		logger.info("*****Finished TC4001_CalculatePathRandomMode*****");
	}

}
