package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.ClaimsIntimation;
import POM.HR_Claimintimationpage;
import POM.HR_View_Client_Info;
import POM.HomePage;
import POM.NEFT;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import POM.UploadpolicyBenifit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class HR_ViewManage_Password_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	HR_View_Client_Info hR_View_Client_Info;
	SoftAssert softAssert;
	
	public HR_ViewManage_Password_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		
		driver =testContextSetup.base.lounchBrowser();
		hR_View_Client_Info=new HR_View_Client_Info(driver);
		softAssert=new SoftAssert();
	}
	
	@When("TC_001_Verify the View manage password sub module link is available and open")
	public void tc__verify_the_view_manage_password_sub_module_link_is_available_and_open() throws Exception {
		
		homePage.click_HR_View_Manage_Password(driver);
	}
	@When("TC_002_Verify client radio button is visible and clickable")
	public void tc__verify_client_radio_button_is_visible_and_clickable() {
		hR_View_Client_Info.select_clientRadiobutton();
	}
	@When("TC_003_Verify client name  field is available and clickable{string}")
	public void tc__verify_client_name_field_is_available_and_clickable(String string) {
		hR_View_Client_Info.enterdata_clientNameField(string);
	}
	@When("TC_004_Verify client code field is available and clickable{string}")
	public void tc__verify_client_code_field_is_available_and_clickable(String string) {
		hR_View_Client_Info.enterdata_ClientCodeField(string);
	}
	@When("TC_005_Verify Search button is visible and clickable")
	public void tc_verify_search_button_is_visible_and_clickable() throws Exception {
		hR_View_Client_Info.click_SearchButton();
		Thread.sleep(9000);
	}
	@Then("client name and client code show on page{string},{string}")
	public void tcverify_search_button_is_visible_and_clickable(String s1,String s2) throws Exception {
		String actual_clientcode=hR_View_Client_Info.ActualTable_clientcode();
		softAssert.assertEquals(actual_clientcode, s2);
		System.out.println(actual_clientcode);
		softAssert.assertAll();
	}

	@When("TC_006_Verify policy radio button is visible and clickable")
	public void tc__verify_policy_radio_button_is_visible_and_clickable() {
		hR_View_Client_Info.select_policyRadioButton();
	}
	@When("TC_007_Verify policy Number  field is visible and clickable{string}")
	public void tc__verify_policy_number_field_is_visible_and_clickable(String string) {
		hR_View_Client_Info.enterdata_policynofield(string);
	}



	
	

}
