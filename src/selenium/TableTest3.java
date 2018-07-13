package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest3 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/om/Desktop/dipuuu.HTML");
	
	int sum=0;
	List<WebElement> alltd = driver.findElements(By.xpath("//tr[position()>1 and position()<last()]/td[last()]"));
	for( WebElement td :alltd) 
	{
		String text=td.getText();
		sum=sum+Integer.parseInt(text);
	}
	System.out.println("the sum of total marks"+sum);
	
	String xp2="//tr[last()]/td[last()]";
	String text=driver.findElement(By.xpath(xp2)).getText();
	int total=Integer.parseInt(text);
	System.out.println("total marks is"+total);
	
	
	if(sum==total) {
		System.out.println("all is righat");
	}
	else {
		System.out.println("not pass fail there is an error");
	}
}
}
