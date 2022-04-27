package runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources",
        glue = {"steps", "hooks"},
        plugin = {"json:build/cucumber.json",
                "html:build/site/cucumber-pretty"}
        )
public class Runner {
}

