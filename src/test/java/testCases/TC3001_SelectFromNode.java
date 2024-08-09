package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC3001_SelectFromNode extends BaseClass{
	
	@Test
	public void verify_select_from_node() {
		
		logger.info("****Starting TC3001_SelectFromNode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Select option value C for From Node****");
			ac.UpdateDrpFromNode();
			
			logger.info("****Verify From Node option value is updated with C****");
			String valueFrNode=ac.valueDrpFromNode();
			System.out.println("From Node option value: "+ valueFrNode);
			
			if(valueFrNode.equals("C")) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		logger.info("*****Finished TC3001_SelectFromNode*****");
	}

}
