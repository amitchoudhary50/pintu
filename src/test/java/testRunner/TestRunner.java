package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\vinit\\eclipse-workspace\\cucumber\\src\\main\\java\\Features", glue= {"stepDefinition"})
public class TestRunner {

}
