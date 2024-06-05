package saisanth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class Selenium {
	public static void main(String[] args)throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\eclipse-workspace\\saisanth\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\java from pendrive\\img.jpg");
		FileUtils.copyFile(src,dest);
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		username.sendKeys("9551224043");
		//TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\java from pendrive\\img1.jpg");
		FileUtils.copyFile(src1,dest1);
				//how to use get attribute
		String string = username.getAttribute("value");
		System.out.println(string);			
		//
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("iphone@1411S");
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\java from pendrive\\img2.jpg");
		FileUtils.copyFile(src2,dest2);
		//
		String string2 = password.getAttribute("value");
		System.out.println(string2);
		//
		WebElement textprint = driver.findElement(By.xpath("//span[text()='© 2024 Instagram from Meta']"));
		String string3 = textprint.getText();
		System.out.println(string3);
		//
		WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
		login.click();
		Thread.sleep(2000);
		File src3 = ts.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\java from pendrive\\img3.jpg");
		FileUtils.copyFile(src3,dest3);
		
		
		driver.quit();
		
		

}}
