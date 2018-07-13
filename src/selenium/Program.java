package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	
}
public static void myBrowser(WebDriver driver) {
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	
	driver.findElement(By.partialLinkText("tiTI")).click();
}
}
