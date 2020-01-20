package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This class is the runner class
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "classpath:features",
        glue = "steps")
public class RunCucumberTest {
}
