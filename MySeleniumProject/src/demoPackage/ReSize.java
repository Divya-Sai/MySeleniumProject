package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		List<WebElement> list =driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath(".//div[@id='resizable']/div[3]"));
		 System.out.println(resize.getText());
		 
		 Actions action =new Actions(driver);
		 action.dragAndDropBy(resize, 100, 100).build().perform();

	}

}
