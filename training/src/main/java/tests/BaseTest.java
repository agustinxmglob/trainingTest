package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

/**
 * BaseTest to all Tests
 * 
 * @author agustin.diez
 *
 */
public abstract class BaseTest {

	protected WebDriver driver = new FirefoxDriver();

	protected LoginPage loadAplication() {
		this.driver.get("https://globantu.globant.com/globantu/login");
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
