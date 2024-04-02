package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.HomePage;
import POM.NetworkServices;
import POM.UpdateMobileEmail;
import POM.UploadpolicyBenifit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class MyPolicy_Benefit_Stepdefinations {

	TestContextSetup testContextSetup;
	HomePage homePage;
	WebDriver driver;
	UploadpolicyBenifit uploadpolicyBenifit;
	SoftAssert softAssert;
	
	public MyPolicy_Benefit_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver =testContextSetup.base.lounchBrowser();
		uploadpolicyBenifit =new UploadpolicyBenifit(driver);
		softAssert=new SoftAssert();
	}
	
	
	@When("TC_001_To check weather My Policy Benefit link available and clickable")
	public void tc__My_Policy_Benefit_link_is_visible_and_clickable()
	{
		homePage.clickMyPolicy_MyPolicyBenefit(driver);
	}

	 @When("TC_002_Verify the policy Number available on page{string}")
	 public void tc__Verify_the_policy_Number_available(String string) throws Exception
	{
		String actual_policyNo =uploadpolicyBenifit.getpolicyno();
		
		System.out.println(actual_policyNo);
		softAssert.assertEquals(actual_policyNo,string );
	
	 }

	
	

}
