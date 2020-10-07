package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		List<WebElement> list =driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath(".//div[@id='draggable']"));
		 System.out.println(drag.getText());
		 
		 Actions action =new Actions(driver);
		 action.moveToElement(drag).dragAndDropBy(drag, 100, 150).build().perform();
		 
		 driver.close();

	}

}
