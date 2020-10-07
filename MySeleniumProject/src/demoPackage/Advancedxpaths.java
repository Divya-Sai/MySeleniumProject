package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancedxpaths {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		/*
		 * driver.findElement(By.xpath(".//div[@id='accept-choices']")).click();
		 * driver.findElement(By.
		 * xpath(".//div[@class='w3-bar-block']/a[contains(.,'Learn AngularJS')]")).
		 * click();
		 */
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//span[@class='CwaK9']/span[contains(.,'I agree')]")).click();

	}

}
