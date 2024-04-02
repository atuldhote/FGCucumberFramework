package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"

,monochrome=true, tags ="@Broker_MyPolicy_ViewManagePassword",
plugin= {"pretty","html:target/htmlreport.html"} )
public class TestRunner extends AbstractTestNGCucumberTests{

}
