package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	WebElement listbox = driver.findElement(By.id("year"));
	Select select=new Select(listbox);
	List<WebElement> allOptions = select.getOptions();
	int count=allOptions.size();
	System.out.println(count);
	
	for (WebElement webElement : allOptions) {
		String text=webElement.getText();
		System.out.println(text);
	}
	
	
	driver.close();
}
}
