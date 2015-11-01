package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(
		format = "pretty",
	    features = "src/cucumberfeatures/"  //refer to Feature file
	)
public class CucumberRunner {

}
