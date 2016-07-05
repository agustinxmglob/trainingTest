package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.GlobalData;
import pages.LoginPage;
import pages.WelcomePage;

/**
 * Test Class for globantU Welcome Page feature.
 * 
 * @author agustin.diez
 *
 */
public class GlobantUWelcomePageTest extends BaseTest {

	/**
	 * this scripts verify testCase play_05
	 * 
	 * @author agustin.diez
	 */
	@Test
	public void testWelcomePageNavigator() {
		loadAplication();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		String userName = GlobalData.VALID_USERNAME;
		loginPage.enterUsername(userName);
		String password = GlobalData.VALID_PASSWORD;
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
		Assert.assertTrue(welcomePage.titleIsDisplayer());
		Assert.assertTrue(welcomePage.headerIsDisplayer());
		Assert.assertTrue(welcomePage.backbroundDrawingIsDisplayed());
		Assert.assertTrue(welcomePage.enrollButtonIsDisplayed());
		Assert.assertTrue(welcomePage.trainYourselfButtonIsDisplayed());
		Assert.assertTrue(welcomePage.getCertifiedButtonIsDisplayed());
	}

	/**
	 * this scripts verify testCase Play_06
	 * 
	 * @author agustin.diez
	 */
	@Test
	public void testWelcomePageNavigatorSideBar() {
		loadAplication();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		String userName = GlobalData.VALID_USERNAME;
		loginPage.enterUsername(userName);
		String password = GlobalData.VALID_PASSWORD;
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
		Assert.assertTrue(welcomePage.sideBarIsDisplayed());
		
	}
}
