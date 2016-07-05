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
		String userName = GlobalData.VALID_USERNAME;
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
		String password = GlobalData.VALID_PASSWORD;
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
	}

	/**
	 * This scripts verify testCase Play_02
	 * 
	 * @author agustin.diez
	 */
	public void testLoginInvalidPassword() {
		LoginPage loginPage = this.loadAplication();
		String userName = GlobalData.VALID_USERNAME;
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
		String password = GlobalData.INVALID_PASSWORD;
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertFalse(welcomePage.isdisplayed());
	}

	/**
	 * This scripts verify testCase Play_03
	 * 
	 * @author agustin.diez
	 */
	public void testLoginInvalidUserAndPassword() {
		LoginPage loginPage = this.loadAplication();
		String userName = GlobalData.INVALID_USERNAME;
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
		String password = GlobalData.INVALID_PASSWORD;
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertFalse(welcomePage.isdisplayed());
	}

}
