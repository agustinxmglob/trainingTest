package decorator;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class WebElementDecorator implements org.openqa.selenium.WebElement {

	protected org.openqa.selenium.WebElement webElementToBeDecorated;
	protected WebDriver driver;
	protected By locator;
	protected final static Logger LOGGER = Logger.getLogger(WebElementDecorator.class);

	public WebElementDecorator(By locator,WebDriver driver) {
		this.webElementToBeDecorated = driver.findElement(locator);
		this.driver = driver;
		this.locator = locator;
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		return webElementToBeDecorated.getScreenshotAs(arg0);
	}

	@Override
	public void clear() {
		webElementToBeDecorated.clear();
	}

	@Override
	public void click() {
		LOGGER.info("clicking WebElement");
		webElementToBeDecorated.click();
	}

	@Override
	public WebElement findElement(By arg0) {
		return webElementToBeDecorated.findElement(arg0);
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		return webElementToBeDecorated.findElements(arg0);
	}

	@Override
	public String getAttribute(String arg0) {
		return webElementToBeDecorated.getAttribute(arg0);
	}

	@Override
	public String getCssValue(String arg0) {
		return webElementToBeDecorated.getCssValue(arg0);
	}

	@Override
	public Point getLocation() {
		return webElementToBeDecorated.getLocation();
	}

	@Override
	public Rectangle getRect() {
		return webElementToBeDecorated.getRect();
	}

	@Override
	public Dimension getSize() {
		return webElementToBeDecorated.getSize();
	}

	@Override
	public String getTagName() {
		return webElementToBeDecorated.getTagName();
	}

	@Override
	public String getText() {
		return webElementToBeDecorated.getText();
	}

	@Override
	public boolean isDisplayed() {
		return webElementToBeDecorated.isDisplayed();
	}

	@Override
	public boolean isEnabled() {
		return webElementToBeDecorated.isEnabled();
	}

	@Override
	public boolean isSelected() {
		return webElementToBeDecorated.isSelected();
	}

	@Override
	public void sendKeys(CharSequence... arg0) {
		webElementToBeDecorated.sendKeys(arg0);
	}

	@Override
	public void submit() {
		webElementToBeDecorated.submit();
	}

}
