package tests;

import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleBrowser extends BaseTest {
	/**
	 * 
	 * @author agustin.diez
	 */
	@Test
	public void testLoginSuccessCase() {
		GooglePage google = this.loadGoogleAplication();
		String userName = GlobalData.VALID_USERNAME;
		google.googlear(userName);
	}

}
