package com.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",glue = "com.stepdefinition",monochrome = true)




public class ProressiveBddTest {

}
