package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/om/Desktop/dipuuu.HTML");
	String xp="//tr[position()>1 and position()<last()]/td[last()]";
	
	List<WebElement> alltd = driver.findElements(By.xpath(xp));
	int sum=0;
	for(WebElement td :alltd) {
		String text=td.getText();
		try {
			int v=Integer.parseInt(text);
			sum=sum+v;
		
			
		}
		catch(NumberFormatException e) {
			
		}
		
	}
	System.out.println(sum);
	driver.close();
}
}
