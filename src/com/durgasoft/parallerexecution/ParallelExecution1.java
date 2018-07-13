package com.durgasoft.parallerexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public WebDriver driver;
	@Parameters("myBrowser")
	@BeforeClass
	public void launchBrowser(String myBrowser) {
		
		if(myBrowser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(myBrowser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
		
		
	}
@Test
public void tc_1() {
	System.out.println("this is first testcase");
	driver.get("http://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
}
 
}
