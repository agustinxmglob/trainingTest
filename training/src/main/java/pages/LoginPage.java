package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PageObjct for login page.
 * 
 * @author agustin.diez
 *
 */
public class LoginPage extends BasePage {

	private static final String USER_PASSWORD_INPUT_ID = "pwd";
	private static final String USER_NAME_INPUT_ID = "usr_name";

	@FindBy(css = "#usr_name")
	private WebElement userNameInput;
	@FindBy(css = "#pwd")
	private WebElement passwordInput;
	@FindBy(css = "input.btn:nth-child(2)")
	private WebElement loginButton;

	/**
	 * This method is the constructor and gets the static WebDriver.
	 * 
	 * @author agustin.diez
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * This method gets the userName and enters it in the field userNameInput.
	 * 
	 * @author agustin.diez
	 * @param userName
	 *            : String
	 */
	public void enterUsername(String userName) {
		this.userNameInput.sendKeys(userName);
	}

	/**
	 * This method returns the text of the userName input.
	 * 
	 * @author agustin.diez
	 * @return String
	 */
	public String getUsernameInputText() {
		return this.getWebElementValueById(USER_NAME_INPUT_ID);
	}

	/**
	 * This method gets the password and enters it in the field passwordInput.
	 * 
	 * @author agustin.diez
	 * @param userPassword
	 *            : String
	 */
	public void enterPassword(String userPassword) {
		this.passwordInput.sendKeys(userPassword);
	}

	/**
	 * This method returns the text of the userPassword input.
	 * 
	 * @author agustin.diez
	 * @return String
	 */
	public String getPasswordInputText() {
		return this.getWebElementValueById(USER_PASSWORD_INPUT_ID);
	}

	/**
	 * This method click loginButton and returns a WelcomePage instance.
	 * 
	 * @author agustin.diez
	 * @return PageObject
	 */
	public WelcomePage clickLoginButton() {
		this.loginButton.click();
		return PageFactory.initElements(driver, WelcomePage.class);
	}

}
