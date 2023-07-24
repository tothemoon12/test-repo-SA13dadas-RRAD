package com.cucumber.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import utils.DriverManager;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        features = "classpath:com/cucumber/testng/features"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
