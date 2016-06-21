package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * BaseClass for all PageObjets. 
 * This class will contains logic common to all PageObjets.
 * @author agustin.diez
 *
 */
public abstract class BasePage {

	protected WebDriver driver;

	/**
	 * @param driver
	 */
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method returns the text value for the given webElement.
	 * 
	 * @author agustin.diez
	 * @param webElementId
	 *            : WebElement
	 * @return
	 */
	protected String getWebElementValueById(String webElementId) {
		if (webElementId != null) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return (String) js.executeScript(
					String.format("var webElementValue = document.getElementById('%s').value; return webElementValue;",
							webElementId));
		} else {
			throw new RuntimeException("Empty webElementId");
		}
	}

}
