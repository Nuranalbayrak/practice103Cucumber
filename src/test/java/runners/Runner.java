package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)//test calistirici notasyonu
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false
)






public class Runner {

}
