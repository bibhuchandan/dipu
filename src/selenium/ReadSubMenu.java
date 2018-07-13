package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadSubMenu {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

 public static void main(String[] args) {
  WebDriver driver = new ChromeDriver(); //object created to start firefox driver
  
  Actions action = new Actions(driver); // object created to perfomr mouse operation
  
  driver.get("http://demo.lateralcode.com/css-drop-down-menus/"); // open url
  
  WebElement home = driver.findElement(By.linkText("Home")); // find home menu
  
  action.moveToElement(home).perform(); //put mouse pointer on Home menu
  
   List<WebElement> we = home.findElements(By.xpath("//*[@id='menu']/ul/li[1]/ul/li")); // common property of all sub menu item
  
  //travers through all submenu & print their text
  int count=we.size();
  for (int i =0; i<count;i++)
  {
   WebElement option = we.get(i); //print submenu text
  System.out.println(option.getText());
  }
 }

}
