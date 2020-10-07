package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//div[@id='accept-choices']")).click();
		List<WebElement> list = driver.findElements(By.xpath(".//a[@class='w3-bar-item w3-button']"));
		System.out.println(list.size());
		
		for(int i=0;i<=200;i++)
		{
			System.out.println(list.get(i).getText());
		}
		driver.close();
	}

}
