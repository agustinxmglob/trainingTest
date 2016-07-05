package decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VissibleWebElementDecorator extends WebElementDecorator {
	private static final int WAITING_TIME = 10;

	public VissibleWebElementDecorator(WebDriver driver, By locator) {
		super(locator, driver);
	}

	@Override
	public void click() {
		WebDriverWait wait = new WebDriverWait(driver, WAITING_TIME);
		wait.until(ExpectedConditions.elementToBeClickable(this.locator));
		super.click();
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
