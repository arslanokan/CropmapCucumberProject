package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "json:target/xml-reports/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "",
        dryRun = false
)

public class Runner {
}
