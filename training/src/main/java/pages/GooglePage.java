package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import decorator.VissibleWebElementDecorator;

public class GooglePage extends BasePage {
	
	
	private static final String AGUSTIN = "agustindxm";
//	private By by = new ById("sb_ifc0");
	private By by = new ById("sb_ifawdadwc0");
	private VissibleWebElementDecorator browserField = new VissibleWebElementDecorator(driver,by);

	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public void googlear(String query) {
		this.browserField.click();
		this.browserField.sendKeys(AGUSTIN);
	}

}
