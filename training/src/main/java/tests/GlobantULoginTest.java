package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.WelcomePage;

/**
 * Test Class for globantU login flow feature.
 * 
 * @author agustin.diez
 *
 */
public class GlobantULoginTest extends BaseTest {

	/**
	 * This scripts verify testCase Play_01.
	 * 
	 * @author agustin.diez
	 */
	@Test
	public void testLoginSuccessCase() {
		LoginPage loginPage = this.loadAplication();
		String userName = "UserName";
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
		String password = "Password";
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
	}

	public void testLoginInvalidPassword() {
		LoginPage loginPage = this.loadAplication();
		String userName = "UserName";
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
	}

}
