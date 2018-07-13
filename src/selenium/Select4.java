package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select4 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/om/Desktop/dipuuuu.html");
	
	WebElement listbox = driver.findElement(By.id("SLV"));
	Select select=new Select(listbox);
	if(select.isMultiple()) {
		System.out.println("this is a multiple select box");
	}
	else {
		System.out.println("this is a single box");
	}
}
}
