package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NetworkServices {
	WebDriver ldriver;
	WebDriverWait wait;
	Actions act;
	public  NetworkServices(WebDriver rdriver)
	{   ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
	}
	@FindBy (id="ctl00_PageBodyControls_txtSearchText")
	@CacheLookup
	  WebElement searchHospital;
	
	@FindBy (id="ctl00_PageBodyControls_cmdSubmit")
	@CacheLookup
	  WebElement searchbutton;
	
	@FindBy (id="ctl00_PageBodyControls_btnRefresh")
	@CacheLookup
	  WebElement refreshbutton;
	
	@FindBy (xpath="//th[text()='City']")
	@CacheLookup
	  WebElement city;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grdNSPSearch']//tbody//tr[2]//td[5]")
	@CacheLookup
	  WebElement resultcityname;
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grdNSPSearch']//tbody//tr[1]")
	@CacheLookup
	  WebElement resulhospitalTableHeader;
	
	
	@FindBy (xpath="//table[@id='ctl00_PageBodyControls_grdNSPSearch']//tbody//tr[2]")
	@CacheLookup
	  WebElement resulhospitalDetail;
	
	public void senddatasearchHospitalfield(String data) {
		searchHospital.sendKeys(data);
	}
	public void senddatasearchHospitalfieldBroker() throws Exception {
		Thread.sleep(4000);
		searchHospital.sendKeys("Mumbai");
	}
	public void clicksearchButton() {
		searchbutton.click();
	}
	public void clickrefreshButton() {
		refreshbutton.click();
	
    }
	public String checkResultCityname() {
		
	String citynameresult=	 resultcityname.getText();
	return citynameresult;
	 
	
    }
    public String ResultHospitalTableHeader() {
		
		String header=	 resulhospitalTableHeader.getText();
		return header;
		 
		
	  }
	public String printResultHospitalDetail() {
		
		String citynameresult=	 resulhospitalDetail.getText();
		return citynameresult;
		 
		
	  }
	
	}
