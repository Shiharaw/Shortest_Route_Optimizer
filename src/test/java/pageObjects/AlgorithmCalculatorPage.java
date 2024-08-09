package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testCases.$missing$;


public class AlgorithmCalculatorPage extends BasePage{

	public AlgorithmCalculatorPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements-Random Mode
	@FindBy(xpath = "//div[contains(@class,'toggle-wrapper flex ')]")
	WebElement checkboxRandomMode;
	
	@FindBy(xpath = "//button[@class='flex re-calculate-random ml-[16px] cursor-pointer']/img")
	WebElement iconRefreshRandomMode;
	
	@FindBy(xpath = "//button[normalize-space()='Calculate Random']")
	WebElement btnCalculateRandom;
		
	@FindBy(xpath = "//div[@id='fromNode']//div[@class=' css-olqui2-singleValue']")
	WebElement RndFromNodeValue;
	
	@FindBy(xpath = "//div[@id='toNode']//div[@class=' css-olqui2-singleValue']")
	WebElement RndToNodeValue;
	
	//Elements-Manual Mode
	@FindBy(xpath = "//div[@id='fromNode']/div")
	WebElement drpFromNode;
	
	@FindBy(xpath = "//div[contains(text(),'C')]")
	WebElement drpOptCFromNode;
	
	@FindBy(xpath = "//div[@id='fromNode']//div[@class=' css-1dimb5e-singleValue']")
	WebElement fromNodeValue;
	
	@FindBy(xpath = "//div[@id='toNode']/div")
	WebElement drpToNode;
	
	@FindBy(xpath = "//div[contains(text(),'F')]")
	WebElement drpOptFToNode;
	
	@FindBy(xpath = "//div[@id='toNode']//div[@class=' css-1dimb5e-singleValue']")
	WebElement toNodeValue;
	
	@FindBy(xpath = "//button[normalize-space()='Calculate']")
	WebElement btnCalculate;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	WebElement btnClear;
	
	
	//Elements-Result
	@FindBy(xpath = "//p[@class='mb-[24px] text-sm text-[#5A5B5D]']")
	WebElement path;
	
	@FindBy(xpath = "//p[@class='text-sm text-[#5A5B5D]']")
	WebElement distance;
		
	
	//Methods-Random Mode
	public void enableRandonMode() {
		checkboxRandomMode.click();
	}
	
	public void refresh() {
		iconRefreshRandomMode.click();
	}
	
	public String RndValueDrpFromNode() {
		try {
			return RndFromNodeValue.getText();
		}
		catch(Exception e){
			return(e.getMessage());
		}
	}
	
	public String RndValueDrpToNode() {
		try {
			return RndToNodeValue.getText();
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public void calculateRandom() {
		btnCalculateRandom.click();
	}
	
	public boolean checkboxRandonModeStatus() {
		try {
			return(checkboxRandomMode.isSelected());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean isIconRefreshExists() {
		try {
			return(iconRefreshRandomMode.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean isbtnCalculateRandomExists() {
		try {
			return(btnCalculateRandom.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}

	
	//Methods-Manual Mode
	public void UpdateDrpFromNode() {
		drpFromNode.click();
		drpOptCFromNode.click();
	}
	
	public void UpdateDrpToNode() {
		drpToNode.click();
		drpOptFToNode.click();
	}
	
	public String valueDrpFromNode() {
		try {
			return fromNodeValue.getText();
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String valueDrpToNode() {
		try {
			return toNodeValue.getText();
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public void calculateNormal() {
		btnCalculate.click();
	}
	
	public void clearSelection() {
		btnClear.click();
	}
	
	//Methods-Results
	public String getPath() {
		try {
			return path.getText();
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String getDistance() {
		try {
			return distance.getText();
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public boolean isCalculatedPathDisplayed() {
		try {
			return(path.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean isCalculatedDistanceDisplayed() {
		try {
			return(distance.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}
	
}
