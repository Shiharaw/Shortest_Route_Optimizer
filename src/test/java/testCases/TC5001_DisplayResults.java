package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC5001_DisplayResults extends BaseClass {
	
	@Test
	public void verify_dispay_results() {
		
		logger.info("****Starting TC4002_CalculatePathManualMode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Calculate path and distance****");
			ac.UpdateDrpFromNode();
			ac.UpdateDrpToNode();
			ac.calculateNormal();
			
			logger.info("****Verify Calculated path and distance display format****");
			String actualPath = ac.getPath();
			String actualDistance = ac.getDistance();
			
			if(actualPath.equals("From Node Name = “C”, To Node Name = ”F”: C. D. G. F")) {
				Assert.assertTrue(true);
			}
			else {
				logger.error("Test failed");
				logger.debug("Debug logs...");
				Assert.assertTrue(false);
			}
			
			if(actualDistance.equals("Total Distance: 13")) {
				Assert.assertTrue(true);
			}
			else {
				logger.error("Test failed");
				logger.debug("Debug logs...");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC5001_DisplayResults*****");
	}

}
