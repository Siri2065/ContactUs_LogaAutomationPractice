package com.pages1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class noorderrefpages {
	WebDriver driver;
	public void Launch(String browser,String URL)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(URL);
	}
public void click(String xpath)
{
	driver.findElement(By.xpath(xpath)).click();
}
public void Enter(String xpath, String value)
{
	driver.findElement(By.xpath(xpath)).sendKeys(value);
}

}


