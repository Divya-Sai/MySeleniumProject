package demoPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> checkbox =driver.findElements(By.xpath(".//div[@class='display'][1]/input[@name='sports']"));
		System.out.println(checkbox.size());
		
		for(WebElement e:checkbox) {
			System.out.println(e.isSelected());
			System.out.println(e.getAttribute("value"));
			
			if(e.getAttribute("value").equals("soccer"))
			{
			   e.click();
			}
		}
		System.out.println("=========================");
		for(WebElement e:checkbox) {
			System.out.println(e.isSelected());
		}
		
		
		  /*for(int i=0;i<=checkbox.size();i++) {
			  String e = checkbox.get(i).getAttribute("value");
				if(checkbox.equals("baseball")) {
					checkbox.get(i).click();
		  
		  }*/
		 
	}
	

}
 