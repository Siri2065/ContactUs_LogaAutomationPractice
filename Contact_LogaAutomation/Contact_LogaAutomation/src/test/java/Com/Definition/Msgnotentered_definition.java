package com.definition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages1.msgenotenteredpages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class msgenotentereddef {
	WebDriver driver;
	msgenotenteredpages mtp = new msgenotenteredpages(driver);
	@Given("^Open url in browser$")
	public void open_url_in_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		mtp.Launch("chrome", "http://automationpractice.com/index.php"); // launching the Loga Automation Practice
	}
	@When("^Click on contact us option$")
	public void click_on_contact_us_option() {
	    // Write code here that turns the phrase above into concrete actions
		
	mtp.click("//*[@id=\"contact-link\"]/a");  //clicking contact us option
	mtp.click("//*[@id=\"id_contact\"]"); // clicking dropdown
	mtp.click("//*[@id=\"id_contact\"]/option[2]"); //clicking option2 customercare from dropdown
	mtp.Enter("//*[@id=\"email\"]", "mattasirimounica.selenium@gmail.com"); //entering email address
	mtp.Enter("//*[@id=\"id_order\"]", "CXWE213UGJU"); //entering order reference
//	By fileupload = By.xpath("//*[@id=\"uniform-fileUpload\"]/span[2]");
	//mtp.click("//*[@id=\"fileUpload\"]"); //clicking on choose file upload button
	/*WebElement ele= driver.findElement(fileupload);
	ele.click();
	ele.sendKeys("C:\\Users\\BLTuser.BLT73\\Desktop\\loga\\dependencies.txt"); //uploading file);
*/	
	mtp.Enter("//*[@id=\"fileUpload\"]", "C:\\Users\\BLTuser.BLT73\\Desktop\\loga\\dependencies.txt");
	}

	@Then("^Click on Send button$")
	public void click_on_Send_button()  {
	    // Write code here that turns the phrase above into concrete actions
	 mtp.click("//*[@id=\"submitMessage\"]/span");   
	 Screenshot();
	}

}
