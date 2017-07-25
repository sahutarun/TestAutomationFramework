package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "." , 
glue ={"stepDefination"},
plugin = {"pretty", "html:target/cucumber-reports",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"})
public class TestRunner {

}
