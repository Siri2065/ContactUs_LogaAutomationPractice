package com.definition1;

import com.pages1.noorderrefpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class noorderrefdef {
	 noorderrefpages nop = new  noorderrefpages();
	@Given("^Open URL in chrome browser$")
	public void open_URL_in_chrome_browser()  {
	    // Write code here that turns the phrase above into concrete actions
	  nop.Launch("chrome", "http://automationpractice.com/index.php");
	}

	@When("^Click on Contactus Option$")
	public void click_on_Contactus_Option()  {
	    // Write code here that turns the phrase above into concrete actions
		nop.click("//*[@id=\"contact-link\"]/a");  //clicking contact us option
		
	}

	@When("^enter all details except order reference$")
	public void enter_all_details_except_order_reference()  {
	    // Write code here that turns the phrase above into concrete actions
		nop.click("//*[@id=\"id_contact\"]"); // clicking dropdown
		nop.click("//*[@id=\"id_contact\"]/option[2]"); //clicking option2 customercare from dropdown
		nop.Enter("//*[@id=\"email\"]", "mattasirimounica.selenium@gmail.com"); //entering email address
		nop.Enter("//*[@id=\"fileUpload\"]", "C:\\Users\\BLTuser.BLT73\\Desktop\\loga\\dependencies.txt");
		nop.Enter("//*[@id=\"message\"]", "website is worst");
	}

	@Then("^Click On Send Button$")
	public void click_On_Send_Button()  {
	    // Write code here that turns the phrase above into concrete actions
		nop.click("//*[@id=\"submitMessage\"]/span");  
	    
	}


}
