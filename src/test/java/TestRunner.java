import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/segmentify/web/qa/features/amazoncom.feature"},
        tags = {"@done"},
        monochrome = true,
        plugin = {"html:target/cucumber-html-report","html:target/cucumber-reports/advanced-reports","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber/xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner {
}
