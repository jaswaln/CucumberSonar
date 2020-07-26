import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/",
        glue = "stepdefinition/",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/HtmlReport"}
)
public class RunnerTest {
}
