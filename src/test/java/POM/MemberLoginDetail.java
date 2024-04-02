package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MemberLoginDetail {

	WebDriver ldriver;
	WebDriverWait wait;
	
	public MemberLoginDetail(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (id="ctl00_PageBodyControls_btnNext")
	  WebElement nextbutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnPrevious")
	  WebElement previousbutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnFirst")
	  WebElement firstbutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnLast")
	  WebElement lastbutton;
	
	public void clickfirstbutton() {
		firstbutton.click();
	}
	
	public void clickNextButton() {
		nextbutton.click();
		}
	   
	public void clicklastbutton() {
		lastbutton.click();
	}
	
	public void clickpreviousbutton() {
		previousbutton.click();
	}
	
}
