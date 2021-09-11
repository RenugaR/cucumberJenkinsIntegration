package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"json:src//test//resources//reports//cucumber.json","junit:target/Reports/data.xml" ,
		"rerun:target//rereun.txt"}, snippets = SnippetType.CAMELCASE, dryRun = false, 
		strict = true, tags = {
				"@TC03" }, 
		features = "src\\test\\resources\\Features", glue = "com.stepdef", monochrome = true)
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\cucumber.json");
	}
}
