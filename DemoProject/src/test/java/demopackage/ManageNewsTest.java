package demopackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base {
	@Test(groups= {"regression"} ,retryAnalyzer=retry.Retry.class,description="to add a new news")
	public void manageNews() throws IOException
	{
		/*String news="New new is added";
		String user="admin";
		String pass="admin";*/
		String user=ExcelUtilities.getStringData(1, 0,"LoginPage");
		String pass=ExcelUtilities.getStringData(1, 1, "LoginPage");
		String news=ExcelUtilities.getStringData(1, 0, "ManageNews");
		
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsername(user);
	loginpage.enterPassword(pass);
	loginpage.clickSigninButton();
	ManageNewsPage managenews=new ManageNewsPage(driver);
	managenews.clickMoreInfo();
	managenews.clickNewButton();
	managenews.enterTheNews(news);
	managenews.clickSaveButton();
	
	boolean alertdisplayed=managenews.isAlertDisplayed();
	Assert.assertTrue(alertdisplayed);
	
	}
	@Test
	public void newsUpdate() throws IOException
	{
		/*String news="This is the updated news";
		String user="admin";
		String pass="admin";*/
		String user=ExcelUtilities.getStringData(1, 0,"LoginPage");
		String pass=ExcelUtilities.getStringData(1, 1, "LoginPage");
		String news=ExcelUtilities.getStringData(1, 1, "ManageNews");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsername(user);
	loginpage.enterPassword(pass);
	loginpage.clickSigninButton();
	ManageNewsPage managenews=new ManageNewsPage(driver);
	managenews.clickMoreInfo();
	managenews.clickNewButton();
	managenews.enterTheNews(news);
	managenews.clickSaveButton();
	
	boolean alertdisplayed=managenews.isAlertDisplayed();
	Assert.assertTrue(alertdisplayed);
}

}
