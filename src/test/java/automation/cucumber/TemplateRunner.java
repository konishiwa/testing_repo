package automation.cucumber;

import org.junit.runner.RunWith;

import automation.base.TestBase;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/"
,glue = "src/test/java/automation.cucumber.maps/"
)
public class TemplateRunner extends TestBase{
	

}
