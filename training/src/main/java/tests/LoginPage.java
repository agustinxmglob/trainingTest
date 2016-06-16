package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(css = "#usr_name")
	private WebElement userNameInput;

	@FindBy(css = "#pwd")
	private WebElement passwordInput;

	@FindBy(css = "input.btn:nth-child(2)")
	private WebElement loginButton;

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String userName) {
		this.userNameInput.sendKeys(userName);
	}

	public String getUsernameInputText() {
		return this.getWebElementValueById("usr_name");
	}

	public void enterPassword(String password) {
		this.passwordInput.sendKeys(password);
	}

	public String getPasswordInputText() {
		return this.passwordInput.getText();
	}

	public WelcomePage clickLoginButton() {
		this.loginButton.click();
		return new WelcomePage();
	}

	public String getWebElementValueById(String webElementId) {
		if (webElementId != null) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return (String) js.executeScript(String.format("var webElementValue = document.getElementById('%s').value; return webElementValue;", webElementId));
		} else {
			throw new RuntimeException("Empty webElementId");
		}
	}

}
