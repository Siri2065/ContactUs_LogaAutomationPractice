package com.definition1;

import com.pages1.nosubjectpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class nosubjectdef {
	nosubjectpages nsp = new nosubjectpages();
	@Given("^open url in the browser$")
	public void open_url_in_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		nsp.Launch("chrome", "http://automationpractice.com/index.php"); // launching the Loga Automation Practice 
	}

	@When("^click on Contact us option$")
	public void click_on_Contact_us_option()  {
	    // Write code here that turns the phrase above into concrete actions
		nsp.Click("//*[@id=\"contact-link\"]/a");  //clicking contact us option  
		nsp.Enter("//*[@id=\"email\"]", "mattasirimounica.selenium@gmail.com"); //entering email address
		nsp.Enter("//*[@id=\"id_order\"]", "CXWE213UGJU"); //entering order reference
		nsp.Enter("//*[@id=\"fileUpload\"]", "C:\\Users\\BLTuser.BLT73\\Desktop\\loga\\dependencies.txt");
		nsp.Enter("//*[@id=\"message\"]", "qwertyuojshdg");
	}

	@Then("^click on Send button$")
	public void click_on_Send_button()  {
	    // Write code here that turns the phrase above into concrete actions
		nsp.Click("//*[@id=\"submitMessage\"]/span");   
		Screenshot();
	}
}
