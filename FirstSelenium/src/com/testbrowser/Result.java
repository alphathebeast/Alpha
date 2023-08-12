package com.testbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Result {
	public static void main(String[] args) throws InterruptedException {
		getResult();
	}

	public static void getResult() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rtmnuresults.org");
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath("//select[contains(@name,'ddlselectfaculty')]"));
		Select s = new Select(w);
		s.selectByVisibleText("Faculty of Commerce & Management");
		driver.findElement(By.xpath("//select[contains(@name,'ddlselectexam')]")).click();
		driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[3]/select/option[18]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'txtrollno')]")).sendKeys("972555" + Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@name,'imgbtnviewmarksheet')]")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
