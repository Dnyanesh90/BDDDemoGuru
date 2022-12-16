package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"AllFeatureFileFolder\\DemoGuru99.feature"},
		glue = {"StepDefination\\registerpage"},
		dryRun =false,
		monochrome=true
		)
public class TestRunnerA {

}
