
@HR_Login
Feature: Automation FG portal

 Background: Scenario_ID_01_LoginPage 
    Given user on Login page
    When TC_001 Verify userNamefield "40246561"
    When  TC_002 Verify passwordfield "Rana@5292"
    When  TC_003 Verify Group radiobutton is clickable
    When  TC_004 Verify Loginbutton is clickable
    Then user on Homepage
  
  
  @HR_changePassword
    Scenario: Scenario_ID_02 HR_ChangePassword TestCases 
    When TC_001 Verify changePassword link is clickable
    When TC_002 Verify oldPassword field "Rana@5292"
    When TC_003 Verify NewPassword field "Rana@5292"
    When TC_004 Verify confermPassword field "Rana@5292"
    When TC_005 Verify submit button 
    Then Successful update password meassage is show
     
   
     
     @HR_Claim_Request
     Scenario: Scenario_ID_06 HR_Claim_Request  TestCases 
     Given User on Homepage page
    When  TC_001_Verify Claims Request  sub module is visible and clickable
    When  TC_002_Verify search criteria drop down is visible and clickable"Policy no"
    When  TC_003_Verify search For field is visible and clickable"FGH-10-20-7000874-00-000"
    When  TC_004_Verify  search Button is visible and vlickable
    When  TC_005_Verify  click here for intimation link is visible and clickable
		When  TC_006_Verify Search Hospital Name  field is visible and select hospital "AADHAR"
		When  TC_007_Verify Mobile Number field  is visible and clickable "9604184296"
		When  TC_008_Verify  Email field is visible and clickable "abc@gmail.com"
		When  TC_009_Verify Diagnosis field is editable or not "Fever" 
		When  TC_010_Check Date Of Admission is selectable "03-04-2021"
		When  TC_011_Check Date Of Discharge is selectable "03-04-2021"
		When  TC_012_Check Claimed Amount field is visible and clickable "1000"
		When  TC_013_Verify account holder name is available "Phoolchand"
		When  TC_014_Verify Bank Name field  is available and select bank "ICICI"
		When  TC_015_Verify Branch name field is visible and select data "GURGAON - CYBER GREENS"
		When  TC_016_Verify IFSC Code field is available and autoselet after selecting bank branch "ICIC0000610"
		When  TC_017_Verify MICR Code field is available and autoselet after selecting bank branch "110229072"
		When  TC_018_Account number text box is visible and clickble "31476292911"
		When  TC_019_Re-Account number text box is visible and clickble "31476292911"
		When  TC_020_Verify Saving Account Type  button is visible and clikable
		When  TC_021_Verify Current  Account Type  button is visible and clikable
		When  TC_022_Verify submit button is visible and clickable
    When  TC_023_Verify claimNumber is available on claim intimate iframe
    When  TC_024_Verify  NO button is available on claim intimate iframe and clickable
    When  TC_025_Verify  YES button is available on claim intimate iframe and clickable
    
    @HR_Claim_Track
     Scenario Outline: Scenario_ID_07 HR_Claim_TrackTestCases 
     Given User on Homepage page
     When  TC_001_Verify Track Claims   sub module is visible and clickable
     When  TC_002_Verify Searchcriteria drop down is visible and clickable"<searchCriteria_Dropdown>"
     When  TC_003_Verify searchFor field is visible and clickable"<Claim_Number>"
     When  TC_004_Verify  search button is visible and clickable
     When  TC_005_Verify Online_claim_progress_VIEW_link is visible and clickable
     When  TC_006_Verify viewDetail_VIEW_link is successfully open"<Patient_Name>","<Claim_Amount>","<Diagnosis>"
     When  TC_007_Verify View_Claim_Letter_view_Link is visible and clickable
		
	
		 Examples:
     | Patient_Name|Claim_Amount|Diagnosis|Claim_Number|searchCriteria_Dropdown|
     | Phoolchand|0.00|Fever|10-FGH-23-3-700325-01|Claim No|
    
      @HR_Hospital_Locator
     Scenario Outline: Scenario_ID_08 HR_Hospital_Locator  TestCases 
     Given User on Homepage page
     When  TC_001_Verify  Hospital Locator link is visible and clickable
     When  TC_002_Verify  search Hospital field is available on Network servicepage and clickable "<hospital_cityname>"
     When  TC_003_Verify  search button is visible and clickable
     Then  Hospital datail is available as searching "<hospital_cityname>"
     Examples:
     | hospital_cityname|
     | Pune   |
     
     
   
       @HR_My_Policy_Benefit
     Scenario Outline: Scenario_ID_09 HR_My_Policy_Benefit  TestCases 
      Given User on Homepage page
     When  TC_001_To check weather My Policy Benefit link available and clickable
     When  TC_002_Verify the policy Number available on page"<Policy_No>"
     
      Examples:
     | Policy_No    |
     |FGH-10-22-7000989-00-000  |
     
      @HR_MyPolicy_ViewManagePassword
     Scenario Outline: Scenario_ID_10 HR_My Policy_ViewManagePassword TestCases 
      Given User on Homepage page
     When  TC_001_Verify the View manage password sub module link is available and open
     When  TC_002_Verify client radio button is visible and clickable
     When  TC_003_Verify client name  field is available and clickable"<Client_Name>"
     When  TC_004_Verify client code field is available and clickable"<Client_code>"
     When  TC_005_Verify Search button is visible and clickable
     Then   client name and client code show on page"<Client_Name>","<Client_code>"
     When  TC_006_Verify policy radio button is visible and clickable
     When  TC_007_Verify policy Number  field is visible and clickable"<policy_no>"
     When  TC_005_Verify Search button is visible and clickable

     
      Examples:
     | Client_Name    |Client_code|policy_no               |
     |      Prince    |   40246561|FGH-10-22-7000989-00-000|       
     
     @HR_Upload_Member_data
      Scenario Outline: Scenario_ID_11 HR_Upload_Member_Data TestCases 
      Given User on Homepage page
      When Verify the Upload Member Data sub module link is available and open
      When Verify Transiction Type drop down is visible and clickable"<TransictionType>"
      When Verify policy Number drop down is visible and clickable"<policyNo>"
      When Verify Corporate Name field is available"<Corporatemail>"
      When Verify Corporate HR Email ID field  is available and clickable"<FGmail>"
      When Verify FG Email ID field  is available and clickable"<FGmail>"
      When Verify Go to Dashbord button  is visible and clickable
      When Verify Go back  button  is visible and clickable
     
      
        Examples:
     | TransictionType|policyNo           |Corporatemail                 |FGmail               |
     | Policy    |FGH-10-20-7000853-00-000|Eicore Technologies Pvt. Ltd. |see@futuregenerali.in|
     
     
     
   