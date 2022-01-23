package com.saucedemo.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/feature",
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-reports.html"},
        tags = "@smoke"
)
public class TestRunner {

}
