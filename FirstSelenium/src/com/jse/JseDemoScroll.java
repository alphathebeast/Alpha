package com.jse;

import org.openqa.selenium.chrome.ChromeDriver;

public class JseDemoScroll {
	public static void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chrome\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/clothing-and-accessories/topwear/pr?sid=clo,ash&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_dd3443b0-f388-429f-baab-db247c60f109_1_372UD5BXDFYS_MC.6XNZG1FYFBZT&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear_6XNZG1FYFBZT&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&cid=6XNZG1FYFBZT");
		driver.manage().window().maximize();
		driver.executeAsyncScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		demo();
	}
}
