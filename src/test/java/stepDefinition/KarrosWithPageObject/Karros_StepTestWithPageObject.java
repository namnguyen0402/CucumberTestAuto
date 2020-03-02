package stepDefinition.KarrosWithPageObject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Karros_PageObject.KarrosLogInPage;
import Karros_PageObject.KarrosContentPage;

import managers.PageObjectManager;
import managers.WebDriverManager;

import net.thucydides.core.annotations.Screenshots;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Karros_StepTestWithPageObject {
	
	static WebDriver driver; 
	
	static PageObjectManager pageObjectManager;
	static WebDriverManager webDriverManager;
	
	static KarrosLogInPage karrosLogInPage;
	static KarrosContentPage karrosContentPage;

	static {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		
		pageObjectManager = new PageObjectManager(driver);
		
		karrosLogInPage = pageObjectManager.getkLoginPage();
		karrosContentPage = pageObjectManager.getkContentPage();
	}

	//Scenario Outline: Successful Login with Admin credentials
	@Test
	@Screenshots(afterEachStep=true)
	@Given("^Admin is on Login Page$")
	public void admin_is_on_login_page() {
		karrosLogInPage.navigateTo_KarrosLoginPage();
	}
	
	@When("^he enters \"(.*)\" and \"(.*)\"$")
	public void he_enters_email_and_password(String email, String password) throws Throwable {
		karrosLogInPage.enter_UserCredentials(email, password);
	}
	
	@And("^he clicks on Login button$")
	public void he_clicks_on_login_button() throws Throwable {
		karrosLogInPage.submit_Login();
	}
	
	@Then("^he navigates to Content Page$")
	public void he_navigates_to_content_page() {
		karrosContentPage.check_LogginSuccessfully();
	}

	
	//Scenario Outline: Admin can see how many Request with Approved status and in the year of 2019
	@When("^Admin enters Content page$")
	public void admin_enter_content_page() throws Throwable {
		karrosContentPage.check_UserInContentPage();
	}
	
	@Then("^he can see how many Request with Approved status and in the year of \"(.*)\" in table$")
	public void he_can_see_approved_request_in_2019(int expectedyear) {
		karrosContentPage.getTotalRequestWithApprovedStatusAndIn2019(expectedyear);
		webDriverManager.closeDriver();

	}	
}
