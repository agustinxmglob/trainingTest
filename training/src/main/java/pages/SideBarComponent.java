package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideBarComponent extends BasePage {
	
	@FindBy (css = ".row-filter")
	private WebElement sideBarWebElement;

	public SideBarComponent(WebDriver driver) {
		super(driver);
	}

	public boolean isDisplayed() {
		return this.sideBarWebElement.isDisplayed();
	}
	

}
