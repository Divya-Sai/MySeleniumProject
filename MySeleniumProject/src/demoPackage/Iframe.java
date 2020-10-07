package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		List<WebElement> list =driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		/*
		 * 
		 * 
		 * //1st Method driver.switchTo().frame(0);
		 *  WebElement ele
		 * =driver.findElement(By.xpath(".//div[@id='draggable']"));
		 * System.out.println(ele.getText());
		 * 
		 * driver.switchTo().defaultContent(); WebElement Pageelement
		 * =driver.findElement(By.xpath(
		 * ".//div[@id='content']/h1[contains(.,'Draggable')]"));
		 * System.out.println(Pageelement.getText());
		 */
		
		//2nd Method
		WebElement frame =driver.findElement(By.xpath(".//div[@id='content']/iframe"));
		
		driver.switchTo().frame(frame);
		
		WebElement ele = driver.findElement(By.xpath(".//div[@id='draggable']"));
		 System.out.println(ele.getText());
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement Pageelement=driver.findElement(By.xpath(".//div[@id='content']/h1[contains(.,'Draggable')]"));
		 System.out.println(Pageelement.getText());
		 
		
		
				
				
		
		

	}

}
