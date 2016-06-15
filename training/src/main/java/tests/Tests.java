package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class Tests {

	WebDriver driver;

	@BeforeMethod
	public void before() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	private void after() {
		driver.quit();
	}

	@Test(timeOut = 10000)
	public void wikipediaSearch() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.go(driver);
		homePage.search("Globant", "Español");
	}
}
