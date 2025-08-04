package demopackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void browserIntialisation() {
		 driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}
	public void quitandClose() {
		driver.close();
		driver.quit();
		
	}

}
