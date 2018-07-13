package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/om/Desktop/dipuu.html");
	
	List<WebElement> alltd=driver.findElements(By.xpath("//table[2]//td"));
	for(WebElement td:alltd) {
		String text = td.getText();
		System.out.println(text);
		
	}
	driver.close();
}
}
