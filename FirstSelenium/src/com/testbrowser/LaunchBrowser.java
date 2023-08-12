package com.testbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement ele = driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[2]/div/input"));
		ele.sendKeys("shirt" + Keys.ENTER);
		driver.quit();
		ChromeDriver driv = new ChromeDriver();
		driv.get("https://www.flipkart.com");
		driv.findElement(By.xpath("//div[text() = 'Monitors']")).click();
		Thread.sleep(4000);
		driv.quit();
	}
}
