package com.eoxys.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class EquSelinium1Application {

	public static void main(String[] args) {
	
		System.out.println("Hello.........World.....");
		System.setProperty("webdriver.chrome.driver","C:/Users/New/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://54.144.210.255:8081");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("info@roboapp.com");
		 driver.findElement(By.name("password")).sendKeys("Super123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("//button[@type='submit']")).submit();
	 
		//driver.quit();

	}
}
