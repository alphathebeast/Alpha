package com.testbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.Rectangle;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {

	public static void ResultSS() throws AWTException, IOException, InterruptedException {
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

		Robot r = new Robot();
		Rectangle rec = new Rectangle();
		rec.setSize(1200, 800);
		BufferedImage img = r.createScreenCapture(rec);
		File output = new File("image.jpg");
		ImageIO.write(img, "jpg", output);
		Thread.sleep(5000);
		driver.quit();

	}

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		ResultSS();

	}
}
