package cucumbertests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature"
		,glue={"stepdefination"}
		,monochrome=true
		,plugin={"pretty","html:target/report1.html","json:target/report2.json","junit:target/report3.xml"}	
		,strict=true
		,dryRun=false
		,tags="@Smmoke"
				
		)


public final class TestRunner {

}
