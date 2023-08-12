package com.testbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pepperfry {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.pepperfry.com");
		String s = driver.getTitle();
		System.out.println(s);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys("table");
		Robot r = new Robot();
		r.mouseMove(200, 150);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.quit();
	}
}
