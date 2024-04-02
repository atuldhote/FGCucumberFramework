package stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.ChangePassword;
import POM.Client_MemberCardSearch2;
import POM.DependentMaster;
import POM.HomePage;
import POM.Link_HealthCard_Broker_IMD;
import POM.Link_Profile_Broker_IMD;
import POM.NetworkServices;
import POM.PolicyProfileSearc;
import POM.UpdateMobileEmail;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class MyPolicy_Detail_Stepdefinations {

	TestContextSetup testContextSetup;
	WebDriver driver;
	HomePage homePage;
	PolicyProfileSearc policyProfileSearc;
	Link_Profile_Broker_IMD 	link_Profile_Broker_IMD;
	Link_HealthCard_Broker_IMD link_HealthCard_Broker_IMD;
	Client_MemberCardSearch2  client_MemberCardSearch2 ;
	SoftAssert softAssert;
	
	public MyPolicy_Detail_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
		homePage=testContextSetup.pageObjectManager.openHomePage();
		driver=testContextSetup.base.lounchBrowser();
		policyProfileSearc=new PolicyProfileSearc(driver);
		link_Profile_Broker_IMD=new Link_Profile_Broker_IMD(driver);
		link_HealthCard_Broker_IMD=new Link_HealthCard_Broker_IMD(driver);
		client_MemberCardSearch2 = new Client_MemberCardSearch2(driver);
		softAssert=new SoftAssert();
		}
	@When("TC_001_Verify My Policy detail module is visible and clickable")
	public void tc__verify_my_policy_detail_module_is_visible_and_clickable() {
	   
		homePage.clickMyPolicy_toseepolicyDeatail(driver);
	}
	@When("TC_002_Verify the expected Client Code availale on page{string}")
	public void tc__verify_the_expected_client_code_availale_on_page_fgh100212951(String string) {
		String actula_client_code=policyProfileSearc.check_clintcode();
		System.out.println(actula_client_code);
		softAssert.assertEquals(actula_client_code, string);
		softAssert.assertAll();
	}
	@When("TC_003_Verify the expected Client Name availale on page{string}")
	public void tc__verify_the_expected_client_name_availale_on_page_prince_wadhwa(String string) {
		String actula_client_Name=policyProfileSearc.check_ClientName();
		System.out.println(actula_client_Name);
		softAssert.assertEquals(actula_client_Name, string);
		softAssert.assertAll();
	}
	@When("TC_004_Verify the expected Policy  No availale on page {string}")
	public void tc__verify_the_expected_policy_no_availale_on_page_policy_no(String string) throws Exception {
		String actula_client_PolicyNumber=policyProfileSearc.check_policy_Number();
		System.out.println(actula_client_PolicyNumber);
		softAssert.assertEquals(actula_client_PolicyNumber, string);
		softAssert.assertAll();
		
	}
	@When("TC_005_To check weather Profile link is clickable and successfully open{string},{string},{string},{string}")
	public void tc__to_check_weather_profile_link_is_clickable(String s1,String s2,String s3,String s4) throws Exception {
		policyProfileSearc.checkProfile();
		Thread.sleep(10000);
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		
		ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
		String u = l.get(1);
		driver.switchTo().window(u);
		Thread.sleep(7000);
		String currenturl = driver.getCurrentUrl();
		String actual_client_Name=link_Profile_Broker_IMD.check_client_Name();
		System.out.println(actual_client_Name);
		softAssert.assertEquals(actual_client_Name, s1);
		String actual_client_code=link_Profile_Broker_IMD.check_Claim_code();
		System.out.println(actual_client_code);
		softAssert.assertEquals(actual_client_code, s2);
		String actual_email=link_Profile_Broker_IMD.check_email();
		System.out.println(actual_email);
		softAssert.assertEquals(actual_email, s3);
		
		String actual_mail=link_Profile_Broker_IMD.check_mobile_no();
		softAssert.assertEquals(actual_mail, s4);
		softAssert.assertAll();
		
		
		//driver.close();
		//driver.switchTo().window(list.get(0));
	}
	@When("TC_006_To check weather  Health Card link is clickable and  successfully open {string},{string},{string}")
	public void tc__to_check_weather_health_card_link_is_clickable(String s1,String s2,String s3) throws Exception {
		//=====================================
		ArrayList<String> m2 = new ArrayList<String>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(m2.get(0));
		//====
		policyProfileSearc.checkhealthCard(driver);
		Thread.sleep(7000);
		//ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		ArrayList<String> m = new ArrayList<String>(driver.getWindowHandles());
		String d = m.get(1);
		driver.switchTo().window(d);
		Thread.sleep(7000);
		
		String act_memberName=link_HealthCard_Broker_IMD.check_member_name();
		System.out.println(act_memberName);
		 softAssert.assertEquals(act_memberName, s1);
		String actual_PolicyNumber=link_HealthCard_Broker_IMD.check_policy_number();
		System.out.println(actual_PolicyNumber);
		 softAssert.assertEquals(actual_PolicyNumber, s2);
		 String actual_insured_namer=link_HealthCard_Broker_IMD.check_insured_Name();
		 System.out.println(actual_insured_namer);
		softAssert.assertEquals(actual_insured_namer, s3);
			softAssert.assertAll();
		
		//	driver.switchTo().window(m.get(0));
			
			
	}
	@When("TC_007_To check weather Member details  View link is clickable and  successfully open{string}")
	public void tc__to_check_weather_member_details_view_link_is_clickable(String string) throws Exception {
		Thread.sleep(4000);
		ArrayList<String> m2 = new ArrayList<String>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(m2.get(0));
		
		policyProfileSearc.checkview(driver);
		Thread.sleep(7000);
		
	String actual_PolicyNumber	=client_MemberCardSearch2.check_policy_No();
	System.out.println(actual_PolicyNumber);
	softAssert.assertEquals(actual_PolicyNumber, string);
	
	softAssert.assertAll();
	
	}
	
	

	
	

}
