package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target//rereun.txt", glue = "com.stepdef", monochrome = true)
public class ReRunner {

}