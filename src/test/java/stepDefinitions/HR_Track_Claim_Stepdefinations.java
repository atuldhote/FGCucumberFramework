package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.ClaimsIntimation;
import POM.HR_Claimintimationpage;
import POM.HR_Claims_ClaimStatus;
import POM.HomePage;
import POM.Link_ViewDetails;
import POM.NEFT;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import POM.UploadpolicyBenifit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class HR_Track_Claim_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	HR_Claims_ClaimStatus hR_Claims_ClaimStatus;
	Link_ViewDetails	 linkviewDetails;
	SoftAssert softAssert;
	
	public HR_Track_Claim_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver =testContextSetup.base.lounchBrowser();
		hR_Claims_ClaimStatus =new HR_Claims_ClaimStatus(driver);
		 linkviewDetails=	 testContextSetup.pageObjectManager.open_link_ViewDetails();
		softAssert=new SoftAssert();
	}
	@When("TC_001_Verify Track Claims   sub module is visible and clickable")
	public void tc_verify_track_claims_sub_module_is_visible_and_clickable() throws Exception {
		homePage.clickClaims_Track_Claim(driver);
	}
	@When("TC_002_Verify Searchcriteria drop down is visible and clickable{string}")
	public void tc_Searchcriteriadropdown_visible_and_clickable(String string) throws Exception {
		hR_Claims_ClaimStatus.claimTrack_selectCriteriadropdown(string);
	}
	
	@When("TC_003_Verify searchFor field is visible and clickable{string}")
	public void tc_VerifysearchForfield_visible_and_clickable(String string) throws Exception {
		hR_Claims_ClaimStatus.claimTrack_enterdatainsearchFORbox(string);
	}
	
	@When("TC_004_Verify  search button is visible and clickable")
	public void tc_verify_saerch_button_is_visible_and_vlickable() {
		hR_Claims_ClaimStatus.claimTrack_clicksearchButton();
	}
	@When("TC_005_Verify Online_claim_progress_VIEW_link is visible and clickable")
	public void tc_verify_online_claim_progress_view_link_is_visible_and_clickable() throws Exception {
		hR_Claims_ClaimStatus.click_claimRequest_Table_View_OnlinClaimProgress();
		Thread.sleep(7000);
		ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
		String u = l.get(1);
		driver.switchTo().window(u);
		Thread.sleep(7000);
		String currenturl = driver.getCurrentUrl();
		boolean viewdetail3 = currenturl.contains("OnlineClaimProcess");
		softAssert.assertAll();
	}
	@When("TC_006_Verify viewDetail_VIEW_link is successfully open{string},{string},{string}")
	public void tc_verify_view_detail_view_link_is_successfully_open_phoolchand(String Patient_Name, String Claim_Amount, String Diagnosis) throws Exception {
	   
		ArrayList<String> lL = new ArrayList<String>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(lL.get(0));
		Thread.sleep(2000);
		hR_Claims_ClaimStatus.click_ClaimRequest_Table_ViewDetails(driver);
		Thread.sleep(7000);
		ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
		String u = l.get(1);
		driver.switchTo().window(u);
		Thread.sleep(7000);
		String currenturl = driver.getCurrentUrl();
		

		boolean viewdetail3 = currenturl.contains("ClaimDetailsInfo");
		
		String Actual_patient_name=linkviewDetails.check_patient_Name();
		
		
		softAssert.assertEquals(Actual_patient_name, Patient_Name);
			
		
		
		String claim_amount=linkviewDetails.check_Claim_Amount();
			System.out.println(claim_amount);
			softAssert.assertEquals(claim_amount, Claim_Amount);
			
			
			String Actual_diagnosis=linkviewDetails.check_diagnosis();
			
			
			softAssert.assertEquals(Actual_diagnosis, Diagnosis);
		
			if (viewdetail3 == true) {
				
				//sf.assertEquals(claim_amount, exp_Diagnosis);
				
				//========================================================driver.switchTo().window(l.get(0));
				
			}
			softAssert.assertAll();
	}
	@When("TC_007_Verify View_Claim_Letter_view_Link is visible and clickable")
	public void tc_verify_view_claim_letter_view_link_is_visible_and_clickable() throws Exception {
		ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(l.get(0));
		Thread.sleep(6000);
		String url=driver.getCurrentUrl();
		//driver.navigate().refresh();
		//WebElement element = driver.findElement(By.id("ctl00_PageBodyControls_grdIntimationDetail_ctl02_lnkbtn"));
//		element.click();
		//driver.manage().window().maximize();
		System.out.println("====url====="+url);
		
		hR_Claims_ClaimStatus.click_claimRequest_Table_View_Claim_Letter(driver);
	}


	
	

}
