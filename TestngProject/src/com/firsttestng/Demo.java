package com.firsttestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	ChromeDriver driver;
	WebElement w;
	Select s;

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chrome\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rtmnuresults.org");
		driver.manage().window().maximize();
		w = driver.findElement(By.xpath("//select[contains(@name,'ddlselectfaculty')]"));
		s = new Select(w);
		s.selectByVisibleText("Faculty of Commerce & Management");
		w = driver.findElement(By.xpath("//select[contains(@name,'ddlselectexam')]"));
		s = new Select(w);
		s.selectByVisibleText("Master of Business Administration Fourth Semester [CBCS] (Out Come Based)");
	}

	@Test
	public void yashResult() {
		driver.findElement(By.xpath("//input[contains(@name,'txtrollno')]")).sendKeys("972704" + Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@name,'imgbtnviewmarksheet')]")).click();
	}

	@Test
	public void sapanaResult() {
		driver.findElement(By.xpath("//input[contains(@name,'txtrollno')]")).sendKeys("972555" + Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@name,'imgbtnviewmarksheet')]")).click();
	}

	@Test
	public void swastikaResult() {
		driver.findElement(By.xpath("//input[contains(@name,'txtrollno')]")).sendKeys("972582" + Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@name,'imgbtnviewmarksheet')]")).click();
	}

	@AfterMethod
	private void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
