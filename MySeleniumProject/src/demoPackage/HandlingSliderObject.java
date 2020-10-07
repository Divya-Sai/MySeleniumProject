package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingSliderObject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		List<WebElement> frame =driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath(".//div[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		action.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
	}

}
