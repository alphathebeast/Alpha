package com.testbrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSusingSel {

	public static void main(String[] args) throws InterruptedException {
		try {
			scrnsht();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void scrnsht() throws IOException, InterruptedException {
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
		File file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("usingSelenium.jpg"));
		Thread.sleep(5000);
		driver.quit();
	}

}
