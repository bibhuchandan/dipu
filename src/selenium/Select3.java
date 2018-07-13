package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select3 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/om/Desktop/dipuuuu.html");
	WebElement listbox = driver.findElement(By.id("SLV"));
	Select select=new Select(listbox);
	List<WebElement> alloptions = select.getOptions();
	ArrayList<String> alltext=new ArrayList<String>();
	
	for(int i=0;i<alloptions.size();i++) {
		WebElement option = alloptions.get(i);
		String text = option.getText();
		alltext.add(text);
	}
	Collections.sort(alltext,String.CASE_INSENSITIVE_ORDER);
	for (String text1 : alltext) {
		System.out.println(text1);
	}
}
}
