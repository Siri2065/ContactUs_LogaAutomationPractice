package com.definition1;

import com.pages1.nodetailsfilledpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class nodetailsfilleddef {
	nodetailsfilledpages ndp =new nodetailsfilledpages();
	@Given("^Open Url in the browser$")
	public void open_url_in_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		ndp.Launch("chrome", "http://automationpractice.com/index.php");
	}
	@When("^click on contact us option$")
	public void click_on_contact_us_option()  {
	    // Write code here that turns the phrase above into concrete actions
	  
		ndp.Click("//*[@id=\"contact-link\"]/a"); 
	}

	@Then("^click on send button$")
	public void click_on_send_button()  {
	    // Write code here that turns the phrase above into concrete actions
	ndp.Click("//*[@id=\"submitMessage\"]");
	Screenshot();
	}


}
