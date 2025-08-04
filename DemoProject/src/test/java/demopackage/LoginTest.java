package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	@Test
	public void loginbothCorrect() {
		WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="admin";
		username1.sendKeys("admin");
		WebElement password1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="admin";
		password1.sendKeys("admin");
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void loginBothincorrect() {
		WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="varsha";
		username1.sendKeys("varsha");
		WebElement password1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="chinnu";
		password1.sendKeys("chinnu");
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
	}
	@Test
	public void Loginusercorrect() {
		WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="admin";
		username1.sendKeys("admin");
		WebElement password1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="chinnu";
		password1.sendKeys("chinnu");
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void Loginpassccorrect() {
		WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="varsha";
		username1.sendKeys("varsha");
		WebElement password1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="admin";
		password1.sendKeys("admin");
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

}
