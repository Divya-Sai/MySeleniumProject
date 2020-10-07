package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//div[@class='cell topicons']/a[contains(.,'Rediffmail')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[@title='Create new Rediffmail account']")).click();
		
		WebElement day = driver.findElement(By.xpath(".//select[contains(@name,'DOB_Day')]"));
		List<WebElement> dayoptions =day.findElements(By.tagName("option"));
		System.out.println(dayoptions.size());
		
		
		for(int i=0;i<=dayoptions.size();i++)
		{
			String element = dayoptions.get(i).getAttribute("value");
			if(element.equals("25")) {
				dayoptions.get(i).click();
			}
		}
		
		WebElement month = driver.findElement(By.xpath(".//select[contains(@name,'DOB_Month')]"));
		List<WebElement>  monthoptions = month.findElements(By.tagName("option"));
		System.out.println(monthoptions.size());
	}

}
