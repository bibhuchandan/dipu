package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehobr {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.actimind.com/");
	Thread.sleep(2000);
	String xp="//a[@class='c-link dropdown-toggle']";
	WebElement menu=driver.findElement(By.xpath(xp));
	Actions action=new Actions(driver);
	action.moveToElement(menu).perform();
	//driver.findElement(By.xpath("//a[.='MS Office Plug-ins']"));
	System.out.println(driver.findElements(By.xpath(xp)).size());

	
}
}

