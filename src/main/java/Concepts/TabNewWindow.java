package Concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabNewWindow {
	    public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException  {
			
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	    WebElement bestSellers=  driver.findElement(By.xpath("(//*[text()='Best Sellers'])[1]"));
        Actions windows =new Actions(driver);	
        windows.keyDown(Keys.LEFT_CONTROL).build().perform();
        Thread.sleep(2000);
        bestSellers.click();
        Thread.sleep(2000);
        windows.keyUp(Keys.LEFT_CONTROL).build().perform();
        Thread.sleep(2000);
        
        Set<String>  winsession =  driver.getWindowHandles() ; 
        Iterator <String> itr = winsession.iterator();
        String win1= itr.next();
        String win2=itr.next();
        driver.switchTo().window(win2);
        WebElement shoeOnSecondWindow=  driver.findElement(By.xpath("//*[@class='a-dynamic-image p13n-sc-dynamic-image p13n-product-image']"));
		 shoeOnSecondWindow.click();
		 Thread.sleep(2000);
		 driver.switchTo().window(win1);
		 Thread.sleep(2000);

        driver.quit();
	}

}
