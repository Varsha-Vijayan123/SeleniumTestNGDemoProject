package demopackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test(priority=1,groups= {"regression"})
	public void loginWithValidCredentials()throws IOException {
		//String user="admin";
		//String pass="admin";
		String user1=ExcelUtilities.getStringData(1,0,"LoginPage");
		String pass1=ExcelUtilities.getStringData(1,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user1);
		loginpage.enterPassword(pass1);
		loginpage.clickSigninButton();
	boolean isdashboarddisplayed=loginpage.isHomePageLoaded();
	Assert.assertTrue(isdashboarddisplayed);
	}
	@Test(priority=2)
	public void loginWithInvalidCredentials()throws IOException {
		//String user="adm";
		//String pass="chinnu";
		String user1=ExcelUtilities.getStringData(2,0,"LoginPage");
		String pass1=ExcelUtilities.getStringData(2,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user1);
		loginpage.enterPassword(pass1);
		loginpage.clickSigninButton();
	boolean isalertdisplayed=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertdisplayed);
	}
	@Test(priority=3)
	public void loginWithValidUsername()throws IOException {
		//String user="admin";
		//String pass="chinnu";
		String user1=ExcelUtilities.getStringData(3,0,"LoginPage");
		String pass1=ExcelUtilities.getStringData(3,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user1);
		loginpage.enterPassword(pass1);
		loginpage.clickSigninButton();
	boolean isalertdisplayed=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertdisplayed);
	}
	
	@Test(priority=4)
	public void loginWithValidPassword()throws IOException {
		//String user="adn";
		//String pass="admin";
		String user1=ExcelUtilities.getStringData(4,0,"LoginPage");
		String pass1=ExcelUtilities.getStringData(4,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(user1);
		loginpage.enterPassword(pass1);
		loginpage.clickSigninButton();
	boolean isalertdisplayed=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertdisplayed);
	}
	
		
		

}
