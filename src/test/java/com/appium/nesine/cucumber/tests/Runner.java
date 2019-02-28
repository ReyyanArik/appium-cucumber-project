package com.appium.nesine.cucumber.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/java/com/appium/nesine/cucumber/features/Football.feature",
        glue = {"com.appium.nesine.cucumber.steps"},
        format = {"pretty",
                "html:target/cucumber-report/loginCandidate",
                "json:target/cucumber-report/loginCandidate/cucumber.json",
                "junit:target/cucumber-report/loginCandidate/cucumber.xml"})
public class Runner extends AbstractTestNGCucumberTests {
}

