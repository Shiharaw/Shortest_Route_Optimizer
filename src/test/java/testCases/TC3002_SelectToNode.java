package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlgorithmCalculatorPage;

public class TC3002_SelectToNode extends BaseClass {
	
	@Test
	public void verify_select_to_node() {
		
		logger.info("****Starting TC3002_SelectToNode****");
		
		try {
			AlgorithmCalculatorPage ac = new AlgorithmCalculatorPage(driver);
			
			logger.info("****Select option value H for To Node****");
			ac.UpdateDrpToNode();;
			
			logger.info("****Verify To Node option value is updated with F****");
			String valueToNode=ac.valueDrpToNode();
			System.out.println("To Node option value: "+ valueToNode);
			
			if(valueToNode.equals("F")) {
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
		
		logger.info("*****Finished TC3002_SelectToNode*****");
	}

}
