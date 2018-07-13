package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("java");
	
	String xp="//div[contains(text(),'java')]";
	 List<WebElement> allAST = driver.findElements(By.xpath(xp));
	 int count=allAST.size();
	 System.out.println(count);
	 for(WebElement option:allAST) {
		String text =option.getText();
		System.out.println(text);
	 }
}
}
