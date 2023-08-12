package com.firsttestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {

	@Test
	public static void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();

	}
}
