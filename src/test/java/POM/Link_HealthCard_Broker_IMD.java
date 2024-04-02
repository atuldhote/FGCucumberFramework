package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_HealthCard_Broker_IMD {

	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  Link_HealthCard_Broker_IMD(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
     
	@FindBy (xpath="//div[@id='inner-text']//tbody//tr[6]//td[3]")
	  WebElement insured_Name;
	
	@FindBy (xpath="//div[@id='inner-text']//tbody//tr[7]//td[3]")
	  WebElement policy_number;
	
	@FindBy (xpath="//div[@id='inner-text']//tbody//tr[1]//td[3]")
	  WebElement member_name;
	
	
	public String check_member_name() 
	{
	return 	member_name.getText();
	}
	public String check_insured_Name() 
	{
	return 	insured_Name.getText();
	}
	
	public String check_policy_number() 
	{
	return 	policy_number.getText();
	}
	
	
}
