package batch_bootcamp._batch_bootcamp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class url_after_5monthes {
   
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
//	int i=0;
	
	//سويت كليك على كرييت اكاونت عشان اجرب الاقي كل الاوبشن في الدروب داون
    //   tag       attribute      text
	// < option   value="1906">    1906   <option>
	//	WebElement crseate_acount=driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//	crseate_acount.click();
	
//	//اولا ايجاد التاغ نيم وهو اول حرف من يميز اللينك
    List<WebElement> alltags =driver.findElements(By.tagName("a"));
    //ثانيا بعد كل تاغ في اتربيوت ببدأ ب هريف 
    //ثالثا بما انها اكثر من ويب اليمنت لازم نخزنها ب ليست ويب اليمنت
//     for loop iteration 
        for (int i=0 ; i<alltags.size();i++) {
    	System.out.println("attribute href "+ alltags.get(i).getAttribute("href"));
    	System.out.println("attribute text "+alltags.get(i).getText());
    }
//    //for each
//    for (WebElement link:alltags ) {
//    	System.out.println(link.getAttribute("href"));
//    	System.out.println(link.getText());
//    	i++;
//    }
//    //iterator 
////    Iterator<WebElement> ite = alltags.iterator();
////    while(ite.hasNext()) {
////    	WebElement element = ite.next();
////    	System.out.println(element.getAttribute("href"));
////    	System.out.println(element.getText());
////     i++;
////    }
////    
//    //counter for links number
//    System.out.println(i);
	// هذا تابع لايجاد الاوبشن 
//    Thread.sleep(3000);
    //التاغ هو الاوبشن
//    List<WebElement> select= driver.findElements(By.tagName("option"));
//    for (int k=0;k<select.size();k++) {
//    	//الاتربيوت هو الفاليو
////    	System.out.println(select.get(k).getAttribute("value"));
//    	System.out.println(select.get(k).getText());

//    }
    driver.close();
	}

}
