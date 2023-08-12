package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySite {

	@Test
	public static void letsTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java/login.html");
		System.out.println("Chrome launched succesfully");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter User ID\"]")).sendKeys("abcd" + Keys.ENTER);
		System.out.println("Id entered succcesfully");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Password\"]")).sendKeys("1234");
		System.out.println("Password entered succesfully");
		driver.findElement(By.xpath("//button[@onclick=\"login()\"]")).click();
		System.out.println("click on login button is succesfull");
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Browser is closed sucessfully");

	}

	public static void main(String[] args) throws InterruptedException {
		letsTest();
	}
}
