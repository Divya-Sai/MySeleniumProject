package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		
		driver.findElement(By.xpath(".//input[@id='header-search-input']")).sendKeys("selenium");
		
		Thread.sleep(5000);
		
		  List<WebElement> list
		  =driver.findElements(By.xpath("//*[contains(@id,'applet_p_50000372')]/div/div/div/div/div/div/form/div/div/div/ul/li/span"));
		  System.out.println(list.size());
		  
		  list.get(5).click();
		 
		
		//driver.findElement(By.xpath("//header/div[@id='applet_p_50000372']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")).click();
		
		
	}

}
