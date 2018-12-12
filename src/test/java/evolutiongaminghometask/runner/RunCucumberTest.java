package evolutiongaminghometask.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources",
        glue = "evolutiongaminghometask.step_definitions")
public class RunCucumberTest {
}