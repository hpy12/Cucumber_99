package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Allfeaturefiles"},
glue= {"StepDefination"},
dryRun=false
)
public class Runnerclass {

}
