package com.durgasoft.webdriver.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	@Test
	public void tc_1() {
		System.out.println("this is my first test case");
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");*/
	}
	@Test
	public void tc_2() {
		System.out.println("this is my second test case");
	}
	@Test
	public void tc_3() {
		System.out.println("this is my third test case");
	}
	@BeforeMethod
	public void setUp() {
		System.out.println("launch browser");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("kill the browser");
	}
	@BeforeClass
	public void openApp() {
		System.out.println("open the app****************");
	}
	@AfterClass
	public void closeApp() {
		System.out.println("close app*************");
	}
	@BeforeSuite
	public void m1() {
		System.out.println("before suite+++++++");
	}
	@AfterSuite
	public void m2() {
		System.out.println("after suite+++++++++++++");
	}
	@BeforeTest
	public void m3() {
		System.out.println("before test_________");
	}
	@AfterTest
	public void m4() {
		System.out.println("After test___________");
	}
	
}
