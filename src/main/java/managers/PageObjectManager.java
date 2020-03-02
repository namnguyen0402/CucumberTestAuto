package managers;

import org.openqa.selenium.WebDriver;
import Karros_PageObject.KarrosLogInPage;
import Karros_PageObject.KarrosContentPage;


public class PageObjectManager {

	private WebDriver driver;
	private KarrosLogInPage kLogInPage;
	private KarrosContentPage kContentPage;
	

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}	
	
	public KarrosLogInPage getkLoginPage(){
		return (kLogInPage == null) ? kLogInPage = new KarrosLogInPage(driver) : kLogInPage;
	}
	
	public KarrosContentPage getkContentPage(){
		return (kContentPage == null) ? kContentPage = new KarrosContentPage(driver) : kContentPage;
	}
}