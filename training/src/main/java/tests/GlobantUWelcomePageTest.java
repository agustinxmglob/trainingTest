package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

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
		this.driver.get("https://globantu.globant.com/globantu/login");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		String userName = "agustin.diez";
		loginPage.enterUsername(userName);
		String password = "123";
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
		Assert.assertTrue(welcomePage.titleIsDisplayer());
		Assert.assertTrue(welcomePage.backbroundDrawingIsDisplayed());
		Assert.assertTrue(welcomePage.enrollButtonIsDisplayed());
		Assert.assertTrue(welcomePage.trainYourselfButtonIsDisplayed());
		Assert.assertTrue(welcomePage.getCertifiedButtonIsDisplayed());
	}
}
