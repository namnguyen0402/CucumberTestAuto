package Karros_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class KarrosLogInPage {
	private WebDriver driver;
	static WebDriverWait wait;
	
	public KarrosLogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='formHorizontalEmail']") 
	private WebElement txtbx_Email;
	
	@FindBy(how = How.XPATH, using = "//*[@id='formHorizontalPassword']") 
	private WebElement txtbx_Password;
	
	@FindBy(how = How.XPATH, using = "//a[@class='col-login__btn']") 
	private WebElement btn_LogIn;
	
	public void enter_UserCredentials(String email, String password) {		
		txtbx_Email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formHorizontalEmail']")));
		txtbx_Email.clear();
		txtbx_Email.sendKeys(email);
		
		txtbx_Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formHorizontalPassword']")));
		txtbx_Password.clear();
		txtbx_Password.sendKeys(password);
	}
	
	public void submit_Login() {
		btn_LogIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='col-login__btn']")));
		btn_LogIn.click();
	}
	
	public void navigateTo_KarrosLoginPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

}
