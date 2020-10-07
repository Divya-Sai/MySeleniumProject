package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[@id='custom-button']/button[contains(.,'Login')]")).click();
		
		List<WebElement> list =driver.findElements(By.xpath(".//div[@class='radio-parent']/div"));
		System.out.println(list.size());
		
		//Method 1
		list.get(2).click();
		
		
		/*
		 * //Method 2 to click on specefic radio button for(WebElement e:list) {
		 * System.out.println(e.getAttribute("value"));
		 * System.out.println(e.isSelected());
		 * 
		 * if(e.getAttribute("value").equals("3")) { e.click(); } }
		 */
		
         driver.findElement(By.xpath(".//div[@class='login-button-options']/a[contains(.,'Login')]")).click();

	}

}
