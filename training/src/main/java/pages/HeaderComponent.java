package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for header component.
 * 
 * @author agustin.diez
 *
 */
public class HeaderComponent extends BasePage {

	@FindBy(css = ".navbar-inner")
	private WebElement headerWebElement;

	public HeaderComponent(WebDriver driver) {
		super(driver);
	}

	public boolean isDisplayed() {
		return this.headerWebElement.isDisplayed();
	}
	
	
}
