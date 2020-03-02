package Karros_PageObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KarrosContentPage {
	static WebDriverWait wait;

	public KarrosContentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='basic-nav-dropdown']") 
	private WebElement login_name;
		
	@FindBy(how = How.XPATH, using = "//table[@class='table table-hover table-bordered table-condensed table-header']/thead") 
	private WebElement header_tbl;

	
	@FindAll(@FindBy(how = How.XPATH, using = "//table[@class='table table-hover table-bordered table-condensed table-header']/thead/tr/th"))
	private List<WebElement> column_List;	
	
	@FindBy(how = How.XPATH, using = "//table[@class='table table-striped table-bordered table-hover table-condensed table-body']/tbody") 
	private WebElement content_table;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//table[@class='table table-striped table-bordered table-hover table-condensed table-body']/tbody/tr"))
	private List<WebElement> row_List;	
	
	public void check_LogginSuccessfully() {
		if (login_name.isDisplayed()) {
			System.out.println("Login with Admin successfully!");
		}
	}
	
	public void check_UserInContentPage() {
		if (header_tbl.isDisplayed()) {
			System.out.println("user is in Content Page!");
		}
	}
	
	public void getTotalRequestWithApprovedStatusAndIn2019(int expectedyear) {
		int totalrows = row_List.size();
		int totalCols = column_List.size();

		int numberOfDesired = 0;	
		int getColNumberOfDate = 0;
		for (int j=1; j<=totalCols; j++)
		{
			WebElement eachCols = column_List.get(j);
			String columnTxt = eachCols.getText();
			if (columnTxt.trim().equals("Date Submitted"))	
			{
				getColNumberOfDate = j+1;
				for (int i=1; i<=totalrows; i++)
				{
					WebElement eachRows = wait.until(ExpectedConditions.visibilityOfElementLocated
							(By.xpath("//table[@class='table table-striped table-bordered table-hover table-condensed table-body']/tbody/tr["+i+"]/td["+j+"]")));
					String rowTxt = eachRows.getText();
					if (rowTxt.trim().equals("Approved"))	
					{
						WebElement eRow_dt = wait.until(ExpectedConditions.visibilityOfElementLocated 
								(By.xpath("//table[@class='table table-striped table-bordered table-hover table-condensed table-body']/tbody/tr["+i+"]/td["+getColNumberOfDate+"]")));
						String dateTimeOfRow = eRow_dt.getText();
						
						String pattern = "mm/dd/yyyy hh:mm";
						SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
						
						Date resultOfDate;
						int resultOfYear = 0;
						Calendar cal = Calendar.getInstance();
						
						try{
							resultOfDate = dateFormat.parse(dateTimeOfRow);
							cal.setTime(resultOfDate);
							resultOfYear = cal.get(Calendar.YEAR);					    
						} 
						catch (Exception e){
						System.err.println("[ERROR]: " + e.toString());
						}
						if (resultOfYear == expectedyear)
						{
							numberOfDesired = numberOfDesired + 1;
						}
					}
				}
				break;
			}
		}
		
		System.out.println("Number of Request with \"Approved\" status AND in 2019 is: "+ numberOfDesired);		
	}
}
