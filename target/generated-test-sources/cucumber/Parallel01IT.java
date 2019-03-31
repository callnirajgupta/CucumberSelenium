import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Video/SeleniumCumber/src/test/resources/featurefile/Module2/AddToCart.feature"},
        plugin = {"json:E:/Video/SeleniumCumber/target/cucumber-parallel/1.json", "html:E:/Video/SeleniumCumber/target/cucumber-parallel/1"},
        monochrome = false,
        tags = {"~@ignored"},
        glue = {"com.automation"})
public class Parallel01IT {
}
