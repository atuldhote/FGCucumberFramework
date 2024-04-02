package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.ClaimsIntimation;
import POM.HR_Claimintimationpage;
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

public class HR_Claim_Request_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	HR_Claimintimationpage hRClaimintimationpage;
	ClaimsIntimation claimsIntimation;
	SoftAssert softAssert;
	
	public HR_Claim_Request_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver =testContextSetup.base.lounchBrowser();
		hRClaimintimationpage =new HR_Claimintimationpage(driver);
		claimsIntimation=new ClaimsIntimation(driver);
		softAssert=new SoftAssert();
	}
	

@When("TC_002_Verify search criteria drop down is visible and clickable{string}")
public void tcverify_submit_button_is_visible_and_clickable(String string) throws Exception {
	hRClaimintimationpage.selectCriteriadropdown(string);
}

@When("TC_003_Verify search For field is visible and clickable{string}")
public void tcverify_Verify_searchFor_fieldvisible_and_clickable(String string) throws Exception {
	hRClaimintimationpage.selectPolicyNodropdown(string);
}

@When("TC_004_Verify  search Button is visible and vlickable")
public void verify_searchButton_visible_and_clickable() throws Exception {
	hRClaimintimationpage.clicksearchButton();
}

@When("TC_005_Verify  click here for intimation link is visible and clickable")
public void tcverify_link_is_visible_and_clickable() throws Exception {
	Thread.sleep(4000);
	claimsIntimation.clickclickIntimation();
	Thread.sleep(8000);
	
}

@When("TC_006_Verify Search Hospital Name  field is visible and select hospital {string}")
public void tcverify_search_hospital_name_field_is_visible_and_select_hospital(String hospitalname) throws Exception {
	claimsIntimation.selecthospitalname(hospitalname, driver);
}

@When("TC_007_Verify Mobile Number field  is visible and clickable {string}")
public void tcverify_mobile_number_field_is_visible_and_clickable(String mobile_Number ) throws Exception {
	claimsIntimation.enterMobileNo(mobile_Number);
}

@When("TC_008_Verify  Email field is visible and clickable {string}")
public void tc_verify_email_field_is_visible_and_clickable(String email) {
String actual_mail=	claimsIntimation.checkemailfield();  
softAssert.assertEquals(actual_mail, email);
softAssert.assertAll();
}

@When("TC_009_Verify Diagnosis field is editable or not {string}")
public void tc_verify_diagnosis_field_is_editable_or_not(String diagnosis) throws Exception {
	claimsIntimation.enterDignosis(diagnosis);
}

@When("TC_010_Check Date Of Admission is selectable {string}")
public void __check_date_of_admission_is_selectable(String admission_date) {
	claimsIntimation.enter_DateofAdmission(admission_date);
}

@When("TC_011_Check Date Of Discharge is selectable {string}")
public void __check_date_of_discharge_is_selectable(String discharge_date) {
	claimsIntimation.enter_DateofDischarge(discharge_date);
}

@When("TC_012_Check Claimed Amount field is visible and clickable {string}")
public void t_check_claimed_amount_field_is_visible_and_clickable(String amount) throws Exception {
	claimsIntimation.enterClaimAmount(amount);
}

@When("TC_013_Verify account holder name is available {string}")
public void tcverify_account_holder_name_is_available(String account_holder_name) {
	String actual_accountholdername=claimsIntimation.checkaccounthodername();
	 softAssert.assertEquals(actual_accountholdername, account_holder_name);
	 softAssert.assertAll();
	
}

@When("TC_014_Verify Bank Name field  is available and select bank {string}")
public void tcverify_bank_name_field_is_available_and_select_bank(String bank_name) throws Exception {
	claimsIntimation.selectBankName(driver, bank_name);
}

@When("TC_015_Verify Branch name field is visible and select data {string}")
public void tcverify_branch_name_field_is_visible_and_select_data(String branch_name) throws Exception {
	claimsIntimation.selectBranchName(driver, branch_name);
}

@When("TC_016_Verify IFSC Code field is available and autoselet after selecting bank branch {string}")
public void tcverify_ifsc_code_field_is_available_and_autoselet_after_selecting_bank_branch(String ifsc_code) {
	claimsIntimation.sendIFSCcode(ifsc_code);
}

@When("TC_017_Verify MICR Code field is available and autoselet after selecting bank branch {string}")
public void tcverify_micr_code_field_is_available_and_autoselet_after_selecting_bank_branch(String micr) {
	claimsIntimation.sendMICRcode(micr);
}

@When("TC_018_Account number text box is visible and clickble {string}")
public void __account_number_text_box_is_visible_and_clickble(String account_Number) {
	claimsIntimation.enterAccountNumber(account_Number);
}

@When("TC_019_Re-Account number text box is visible and clickble {string}")
public void tcre_account_number_text_box_is_visible_and_clickble(String account_Number) {
	claimsIntimation.RenterAccountNumber(account_Number);
}

@When("TC_020_Verify Saving Account Type  button is visible and clikable")
public void t_verify_saving_account_type_button_is_visible_and_clikable() {
	claimsIntimation.selectSavingaccountTyperadioButton();
}

@When("TC_021_Verify Current  Account Type  button is visible and clikable")
public void tc_erify_current_account_type_button_is_visible_and_clikable() {
	claimsIntimation.selectcurrentaccountTyperadiobutton();
}

@When("TC_022_Verify submit button is visible and clickable")
public void tc_verify_submit_button_is_visible_and_clickable() throws Exception {
	claimsIntimation.checkSubmitButtonisDisplay(driver);
}

@When("TC_023_Verify claimNumber is available on claim intimate iframe")
public void tc_Verify_claimNumber_is_availableonclaimintimateiframe() throws Exception {
	//Thread.sleep(60000);
	Thread.sleep(30000);
	driver.switchTo().frame(4);
	String actualclaim_No=claimsIntimation.get_poup_claimNo();
	System.out.println(actualclaim_No);
	
}

@When("TC_024_Verify  NO button is available on claim intimate iframe and clickable")
public void tc_Verify_NO_button_is_available_on_claim_intimate_iframe_and_clickable() throws Exception {
boolean b=	claimsIntimation.click_poup_No();
softAssert.assertEquals(b, true);
softAssert.assertAll();
}

@When("TC_025_Verify  YES button is available on claim intimate iframe and clickable")
public void tc_Verify_YES_button_is_available_on_claim_intimate_iframe_and_clickable() throws Exception {
	claimsIntimation.click_poup_YES();
	driver.switchTo().defaultContent();
	
}


	
	

}
