package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select5 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.istqb.in/");
	
	WebElement menu = driver.findElement(By.linkText("FOUNDATION"));
	Actions action=new Actions(driver);
	action.moveToElement(menu).perform();
	
	driver.findElement(By.linkText("ENROLLMENT")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("//input[@id='field9']")).click();
}
}
