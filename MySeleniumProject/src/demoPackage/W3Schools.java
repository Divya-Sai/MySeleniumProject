package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//div[@id='accept-choices']")).click();
		//driver.findElement(By.xpath(".//a[@id='w3loginbtn']")).click();
		driver.findElement(By.xpath(".//div[@class='w3-bar-block']/a[contains(.,'Learn HTML')]")).click();
	   String getTitle= driver.getTitle();
	   System.out.println("title of the page is ......"+getTitle);
	   

	}

}
