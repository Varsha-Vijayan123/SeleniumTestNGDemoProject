package demopackage;

import java.io.IOException;

import org.testng.Assert;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	public void testAddAdmin() throws IOException {
		String loginUserName = ExcelUtilities.getStringData(1,0, "LoginPage"); // Fetching username from Excel file. 1,0 represent cell position
		String loginPassword = ExcelUtilities.getStringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(loginUserName);
		loginPage.enterPassword(loginPassword);
		loginPage.clickSigninButton();
		
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickAddAdminLink();
		adminuserspage.clickAddNewAdminButton();
		
		//String loginUserNameAdmin = ExcelUtility.getstringData(1,0, "Admins"); // Fetching username from Excel file. 1,0 represent cell position
		//String loginPasswordAdmin = ExcelUtility.getstringData(1,1, "Admins");
		FakerUtility fakerutility = new FakerUtility();
		String loginUserNameAdmin = fakerutility.createARandomFirstName(); //generating random username using FakerUtility
		String loginPasswordAdmin = fakerutility.createARandomFirstName();// Generating random password using FakerUtility
		adminuserspage.enterNewAdminUsername(loginUserNameAdmin);
		adminuserspage.enterNewAdminPassword(loginPasswordAdmin);
		adminuserspage.selectUserType();
		adminuserspage.clickSaveAdminButton();
		Assert.assertTrue(adminuserspage.isSuccessAlertDisplayed());
		
	}

}


