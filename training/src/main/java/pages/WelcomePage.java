package pages;

import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {
	

	public WelcomePage(WebDriver driver){
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

}
