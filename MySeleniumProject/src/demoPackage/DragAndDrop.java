package demoPackage;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		List<WebElement> frame =driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		driver.switchTo().frame(0);
		
		WebElement drag =driver.findElement(By.xpath(".//div[@id='draggable']"));
		WebElement drop= driver.findElement(By.xpath(".//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
	}

}
