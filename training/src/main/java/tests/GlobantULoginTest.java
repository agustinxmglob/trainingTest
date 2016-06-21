package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.WelcomePage;

/**
 * Test Class for globantU login feature.
 * 
 * @author agustin.diez
 *
 */
public class GlobantULoginTest {

	private WebDriver driver = new FirefoxDriver();

	/**
	 * This scripts verify testCase Play_01.
	 * 
	 * @author agustin.diez
	 */
	@Test
	public void testSuccessfulLogin() {
		LoginPage loginPage = this.loadAplication();
		String userName = "UserName";
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
		String password = "Password";
		loginPage.enterPassword(password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
	}

	private LoginPage loadAplication() {
		this.driver.get("https://globantu.globant.com/globantu/login");
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
