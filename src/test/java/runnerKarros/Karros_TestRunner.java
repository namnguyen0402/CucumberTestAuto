package runnerKarros;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report"},
		features = "Feature",
		glue = {"stepDefinition/KarrosWithPageObject"},
		monochrome = true		
		)

public class Karros_TestRunner {

}
