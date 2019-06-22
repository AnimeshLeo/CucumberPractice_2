package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "C:\\Users\\saptadeepa pc\\workspace\\PracticeCucumber\\src\\main\\java\\com\\qa\\feature\\Test.feature",
		glue= {"com\\qa\\stepDefinition"},
		format= {"pretty","html:test-output_1"},
		monochrome= true,
		dryRun= false
		
		)


public class TestRunner {

}
