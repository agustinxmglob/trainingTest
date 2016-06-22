package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * This method returns true if the welcomePage is displayed.
	 * 
	 * @author agustin.diez
	 * @return boolean
	 */
	public boolean isdisplayed() {
		return true;
	}

	@FindBy(css = "#certifFilters")
	private WebElement sideBar;
	@FindBy(css = "#mainView h2")
	private WebElement title;
	@FindBy(css = ".span12.homesection")
	private WebElement backbroundDrawing;
	@FindBy(css = ".ico-enroll")
	private WebElement enrollButton;
	@FindBy(css = ".ico-training")
	private WebElement trainYourselfButton;
	@FindBy(css = ".ico-cert")
	private WebElement CertifiedButton;

	/**
	 * returns true if the page title is displayed.
	 * 
	 * @author agustin.diez
	 * @return boolean
	 */
	public boolean titleIsDisplayer() {
		return this.title.isDisplayed();
	}

	/**
	 * returns true if the backbroundDrawing is displayed.
	 * 
	 * @author agustin.diez
	 * @return boolean
	 */
	public boolean backbroundDrawingIsDisplayed() {
		return this.backbroundDrawing.isDisplayed();
	}

	/**
	 * returns true if the enrollButton is displayed.
	 * 
	 * @author agustin.diez
	 * @return boolean
	 */
	public boolean enrollButtonIsDisplayed() {
		return this.enrollButton.isDisplayed();
	}

	/**
	 * returns true if the trainYourselfButton is displayed.
	 * 
	 * @author agustin.diez
	 * @return boolean
	 */
	public boolean trainYourselfButtonIsDisplayed() {
		return this.trainYourselfButton.isDisplayed();
	}

	/**
	 * returns true if the getCertifiedButton is displayed.
	 * 
	 * @author agustin.diez
	 * @return boolean
	 */
	public boolean getCertifiedButtonIsDisplayed() {
		return this.CertifiedButton.isDisplayed();
	}

}
