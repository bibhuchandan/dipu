package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[.='REPORTS']")).click();
	driver.findElement(By.xpath("//td[@class='configHeaderRemoveCell']")).click();
	
	Alert alert =driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	driver.close();
}
}
