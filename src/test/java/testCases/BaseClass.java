package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.logging.log4j.LogManager;		//Log4j
import org.apache.logging.log4j.Logger;			//Log4j
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;		//Log4j
	

	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os, String br){
		
		logger= LogManager.getLogger(this.getClass());
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");	
		
		//Cross Browser testing
		switch (br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(options); break;		//Headless
		//case "chrome": driver = new ChromeDriver(); break;				//Headed
		default: System.out.println("Invalied browser name..."); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://curious-halva-9294ed.netlify.app/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();		
	}
	
	public String captureScreen(String tname) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takeScreenshort = (TakesScreenshot) driver;
		File sourseFile = takeScreenshort.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\screenshorts\\"+ tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		
		sourseFile.renameTo(targetFile);
		return targetFilePath;
		
	}

}
