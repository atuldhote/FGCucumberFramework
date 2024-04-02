package POM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummy_method {

	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  Dummy_method(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
    
	
	@FindBy (id="//a[contains(text(),'My Policy')]")
	
	  WebElement my_policy;
	
	public void mouse_Action(WebDriver ldriver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		Actions act=new Actions(ldriver);
		Thread.sleep(3000);
		act.moveToElement(my_policy).perform();
	}
}
