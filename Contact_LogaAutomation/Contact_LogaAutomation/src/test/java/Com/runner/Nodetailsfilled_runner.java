package com.runner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/feature/Loga1.feature",
		tags="@TC_001",
		glue="com.definition1",
		monochrome=true
		)
public class nodetailsfilledrunner {

}
