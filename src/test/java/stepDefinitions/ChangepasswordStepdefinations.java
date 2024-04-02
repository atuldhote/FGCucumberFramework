package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.ChangePassword;
import POM.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class ChangepasswordStepdefinations {

	TestContextSetup testContextSetup;
	ChangePassword changePassword;
	HomePage homePage;
	
	public ChangepasswordStepdefinations(TestContextSetup testContextSetup){
		this.testContextSetup=testContextSetup;
		changePassword=	testContextSetup.pageObjectManager.open_ChangePassword();
		homePage=testContextSetup.pageObjectManager.openHomePage();
	}
	
	
	@When("TC_001 Verify changePassword link is clickable")
	public void tc_verify_change_password_link_is_clickable() throws Exception {
	WebDriver driver=	testContextSetup.base.lounchBrowser();
		homePage.clickChangePassword(driver);
		
	}

	@When("TC_002 Verify oldPassword field {string}")
	public void tc_verify_old_password_field( String string) {
		changePassword.sendoldpassword(string);
	 
	}

	@When("TC_003 Verify NewPassword field {string}")
	public void tc_verify_new_password_field(String string) {
		changePassword.sendNewpassword(string);

	}

	@When("TC_004 Verify confermPassword field {string}")
	public void tc_verify_conferm_password_field( String string) {
		changePassword.sendConfpassword(string);
		
	}

	@When("TC_005 Verify submit button")
	public void tc_verify_submit_button() throws Exception {
		changePassword.clicksubmitbutton();
		Thread.sleep(3000);
	}

	@Then("Successful update password meassage is show")
	public void Sucssesfulmessage_show() throws Exception {
		String b=changePassword.getpasswordupdateresponcemassage();
		System.out.println(b);
		boolean c=b.contains("Your New Password is match with Old Password, Please enter diffrent new password!");
		Assert.assertEquals(true, c);
		
	}

}
