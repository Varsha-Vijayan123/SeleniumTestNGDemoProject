package demopackage;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utilities.ScreenShotUtility;
import utilities.WaitUtility;




public class Base {
	public WebDriver driver;
	@BeforeMethod(alwaysRun=true)//alwaysRun=true ensures that this method runs een if there are failures in the test ethods
	@Parameters("browser")//get the browser nae fro the l file
	
	public void browserIntialisation(String browser) throws Exception
	{
		//driver=new ChromeDriver();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Browser not supported");
		}
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));

		driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun=true)
		public void quitandClose(ITestResult iTestResult) throws IOException {
			if (iTestResult.getStatus() == ITestResult.FAILURE) {
				ScreenShotUtility scrShot = new ScreenShotUtility(); // creating obj
				scrShot.getScreenShot(driver, iTestResult.getName());

		}
		driver.quit();
		
	}
}


