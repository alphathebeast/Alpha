package com.firstpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.prprt.util.Environment;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Yashpal Malkhede
 */
public class UIKeywords {

	private static final Logger log = Logger.getLogger(UIKeywords.class);
	public static RemoteWebDriver driver;

	public static void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		log.info(browserName + " is launched successfully");
	}

	public static void launchURL(String url) {
		driver.get(url);
		log.info("URL launched successfully: " + url);
	}

	public static void closeBrowser() {
		driver.quit();
		log.info("Browser is closed succesfully: ");
	}

	public static void switchToWindow(String byTitle) {
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		String title = driver.getTitle();
		for (String window : windows) {
			if (driver.switchTo().window(window).getTitle().equals(byTitle)) {
				System.out.println("Switched to window: " + byTitle);
				break;
			}
		}
	}

	public static void enterText(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	public static void hitButton(int keyCode) {
		Robot robo = null;
		try {
			robo = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robo.keyPress(keyCode);
	}

	public static List<String> getTexts(By element) {
		List<WebElement> elements = driver.findElements(element);
		List<String> texts = new ArrayList<String>();
		for (WebElement wbel : elements) {
			texts.add(wbel.getText());
		}
		return texts;

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void dropDown(By element, String text) {
		WebElement w = driver.findElement(element);
		Select s = new Select(w);
		s.selectByVisibleText(text);
	}

	public static void mouseClick(By path) {
		driver.findElement(path).click();
	}

	public void mouseClick(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("tagName")) {
			driver.findElement(By.tagName(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("className")) {
			driver.findElement(By.className(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("linkText")) {
			driver.findElement(By.linkText(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("partialLinkText")) {
			driver.findElement(By.partialLinkText(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(locatorValue)).click();
		} else {
			log.error("Invalid locator enetered: " + locatorType);
		}
	}

	public static void mouseMove(By xpath) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(xpath)).build().perform();
	}

	public static void waitFor() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			log.info("wait for 5 secs");
		}
	}

	public static String enterRollNumber(String rollNo) {
		UIKeywords.launchURL(Environment.Result);
		UIKeywords.maximize();
		UIKeywords.dropDown(By.xpath("//select[contains(@name,'ddlselectfaculty')]"),
				"Faculty of Commerce & Management");
		UIKeywords.dropDown(By.xpath("//select[contains(@name,'ddlselectexam')]"),
				"Master of Business Administration Fourth Semester [CBCS] (Out Come Based)");
		UIKeywords.enterText(By.xpath("//input[contains(@name,'txtrollno')]"), rollNo);
		UIKeywords.mouseClick(By.xpath("//input[contains(@name,'imgbtnviewmarksheet')]"));
		UIKeywords.waitFor();
		return rollNo;
	}
}
