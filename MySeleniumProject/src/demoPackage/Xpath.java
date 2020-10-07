package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//div[@class='cell topicons']/a[contains(.,'Rediffmail')]")).click();
		driver.findElement(By.xpath(".//input[@name='login']")).sendKeys("D@fjjjjjjjy");
	}

}
