package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "@rerun/rerun.txt", glue ={"stepDefination"},//Cucumber picks the failed scenarios from this file 
    format = {"pretty", "html:target/site/cucumber-pretty",
            "json:target/cucumber.json"}
  )
public class FailedScenarios {

}