package Concepts;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ITREATE_ARRAY {
    public static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
		
	driver.close();
		
}


    
}
	


