package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
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

public class Client_NEFT_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	NEFT neft;
	SoftAssert softAssert;
	
	public Client_NEFT_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver =testContextSetup.base.lounchBrowser();
		neft=new NEFT(driver);
		softAssert=new SoftAssert();
	}
	
	 @When("TC_001_Verify NEFT  sub module is visible and clickable")
	 public void tc__verify_neft_sub_module_is_visible_and_clickable() throws Exception {
		 homePage.click_client_NEFT(driver);
	 }
	 @When("TC_002_Verify account holder name is available{string}")
	 public void tc_verify_account_holder_name_is_available(String string) throws Exception {
		 Thread.sleep(6000);
		String actual_name= neft.check_account_HolderName();
		System.out.println(actual_name);
		softAssert.assertEquals(actual_name, string);
		softAssert.assertAll();
	 }
	 @When("TC_005_Verify Bank Name field  is available and auto desplay bankname after selecting IFSC code{string}")
	 public void tc_verify_bank_name_field_is_available_and_select_bank(String string) throws Exception {
	 String actual_name= neft.check_bankname();
	 System.out.println(actual_name);
		softAssert.assertEquals(actual_name, string);
		softAssert.assertAll();
	 }
	 @When("TC_004_Verify Branch name field  is available and auto desplay bankname after selecting IFSC code{string}")
	 public void tc_verify_branch_name_field_is_visible_and_select_data(String string) throws Exception {
		 String actual_name= neft.check_branch_name();
		 System.out.println(actual_name);
			softAssert.assertEquals(actual_name, string);
			softAssert.assertAll();

	 }
	 @When("TC_003_Verify IFSC Code field is available and clickable{string}")
	 public void tc__verify_ifsc_code_field_is_available_and_autoselect_after_selecting_bank_branch(String string) throws Exception {
	    neft.sendIFSCcode(string);
	    Thread.sleep(6000);
	 }
	 @When("TC_006_Verify MICR Code field is available and autoselect after selecting IFSC code{string}")
	 public void tc__verify_micr_code_field_is_available_and_autoselect_after_selecting_bank_branch(String string) throws Exception {
		 String actual_name= neft.check_MICR_code();
		 System.out.println(actual_name);
			softAssert.assertEquals(actual_name, string);
			softAssert.assertAll();

	 }
	 @When("TC_007_Verify Bank Address field is available and autoselect after selecting IFSC{string}")
	 public void tc__verify_bank_address_field_is_available_and_autoselect_after_selecting_bank_branch(String string) {
	   
	 }
	 @When("TC_008_Account number text box is visible and clickble{string}")
	 public void tc_account_number_text_box_is_visible_and_clickble(String string) {
		 neft.sendaccountNumber(string);
	 }
	 @When("TC_009_Re-Account number text box is visible and clickble{string}")
	 public void tc_re_account_number_text_box_is_visible_and_clickble(String string) {
		 neft.send_reEnteraccountNumber(string);
	 }
	 @When("TC_010_Verify Saving Account Type  button is visible and clikable")
	 public void tc_verify_saving_account_type_button_is_visible_and_clikable() {
		 neft.clicksavingradiobuttonbutton();
	 }
	 @When("TC_011_Verify Current  Account Type  button is visible and clikable")
	 public void tc_verify_current_account_type_button_is_visible_and_clikable() throws Exception {
	    neft.clickcurrentradiobuttonbutton();
	 //   neft.click_checkbox();
	 }
	 @When("TC_012_Verify check box is visible and clickable")
	 public void tc_verify_check_box_is_visible_and_clickable() throws Exception {
		 neft.click_checkbox();
	 }

	 @When("TC_013_Verify submit button is visible and clickable")
	 public void tcverify_submit_button_is_visible_and_clickable() throws Exception {
	//	 neft.click_save_button(driver);
		
	 }
	 

	
	

}
