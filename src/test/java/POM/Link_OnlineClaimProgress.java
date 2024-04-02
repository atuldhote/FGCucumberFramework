package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_OnlineClaimProgress {

	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  Link_OnlineClaimProgress(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
     
	@FindBy (id="")
	  WebElement clientRadioButton;
}
