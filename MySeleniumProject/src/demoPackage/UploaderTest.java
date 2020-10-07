package demoPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploaderTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath(".//div[@id='file_wraper0']/input[@name='uploadfile_0']")).sendKeys("D:\\Divya-New\\UploadFile\\test.txt");
		//driver.findElement(By.xpath(".//div[@class='upload_options']/div[@id='file_options0']")).click();
		driver.findElement(By.xpath(".//span[@class='btn btn-success fileinput-button']")).click();
		
       // Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Divya-New\\AutoITScript.exe");
	}

}
