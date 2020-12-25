import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Video/CucumberSelenium/src/test/resources/featurefile/Module2/Login.feature"},
        plugin = {"json:E:/Video/CucumberSelenium/target/cucumber-parallel/1.json", "html:E:/Video/CucumberSelenium/target/cucumber-parallel/1"},
        monochrome = false,
        tags = {"@niraj"},
        glue = {"com.automation"})
public class Parallel01IT {
}
