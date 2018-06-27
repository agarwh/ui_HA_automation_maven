package com.worldpay.cucumber.runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/feature/"},
        glue = {"stepDefinition"},
        tags = {"@login"}
)
public class RunTest {


}
