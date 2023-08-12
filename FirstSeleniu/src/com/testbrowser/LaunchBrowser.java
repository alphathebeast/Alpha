package com.testbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "E:\\jars\\chrome\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("www.google.com");
	}
}
