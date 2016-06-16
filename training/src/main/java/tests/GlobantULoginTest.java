package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobantULoginTest {

	private WebDriver driver = new FirefoxDriver();

	@Test
	public void testSuccessfulLogin() {
		LoginPage loginPage = this.loadAplication();
		String userName = "UserName";
		loginPage.enterUsername(userName);
		Assert.assertEquals(loginPage.getUsernameInputText(), userName);
		String password = "Password";
		loginPage.enterPassword(password);
		Assert.assertNotEquals(loginPage.getPasswordInputText(), password);
		WelcomePage welcomePage = loginPage.clickLoginButton();
		Assert.assertTrue(welcomePage.isdisplayed());
	}

	private LoginPage loadAplication() {
		this.driver.get("https://globantu.globant.com/globantu/login");
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
