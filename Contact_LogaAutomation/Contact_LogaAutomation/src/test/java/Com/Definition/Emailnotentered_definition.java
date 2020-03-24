package com.definition1;

import com.pages1.emailnotenteredpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class emailnotentereddef {
	emailnotenteredpages enp = new emailnotenteredpages();
	@Given("^Open url in the chrome browser$")
	public void open_url_in_the_chrome_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		enp.Launch("chrome", "http://automationpractice.com/index.php");
	}

	@When("^Click on Contact_us Option$")
	public void click_on_Contact_us_Option()   {
	    // Write code here that turns the phrase above into concrete actions
	 	enp.click("//*[@id=\"contact-link\"]/a");  //clicking contact us option 
		
	}

	@When("^fill all details except email$")
	public void fill_all_details_except_email()  {
	   // Write code here that turns the phrase above into concrete actions
		enp.click("//*[@id=\"id_contact\"]"); // clicking dropdown
		enp.click("//*[@id=\"id_contact\"]/option[2]"); //clicking option2 customercare from dropdown
		enp.Enter("//*[@id=\"id_order\"]", "CXWE213UGJU"); //entering order reference
		enp.Enter("//*[@id=\"fileUpload\"]", "C:\\Users\\BLTuser.BLT73\\Desktop\\loga\\dependencies.txt");
		enp.Enter("//*[@id=\"message\"]", "website is worst");
	}

	@Then("^Click On Send_Button$")
	public void click_On_Send_Button()  {
	    // Write code here that turns the phrase above into concrete actions
		enp.click("//*[@id=\"submitMessage\"]/span"); 
		Screenshot();
	}
}
