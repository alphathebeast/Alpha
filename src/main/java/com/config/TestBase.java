package com.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.firstpackage.UIKeywords;

public class TestBase {

	@Parameters("browser-name")
	@BeforeMethod
	public void setUp(@Optional String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.isEmpty()) {
			browserName = "Chrome";
			System.out.println("Setting default browser as chrome");
		}
		UIKeywords.openBrowser(browserName);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		UIKeywords.closeBrowser();
	}
}
