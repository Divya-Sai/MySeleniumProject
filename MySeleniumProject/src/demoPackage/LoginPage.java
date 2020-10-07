package demoPackage;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath(".//input[@aria-label='Email address or phone number']")).sendKeys("divya.santhoshi2000@gmail.com");
		driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("Sanjana@2009");
		driver.findElement(By.xpath(".//button[@name='login']")).click();

	}
	
	

}
