package com.firsttestcase;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.config.TestBase;
import com.firstpackage.UIKeywords;
import com.prprt.util.Environment;
import com.prprt.util.PropUtility;

public class PoloTestCase extends TestBase {

	@Test
	public void verifySearchResultForPoloMen() {

		PropUtility repository = new PropUtility();
		UIKeywords.launchURL(Environment.URL);
		UIKeywords.maximize();
		UIKeywords.hitButton(KeyEvent.VK_ENTER);
		
	}

	@Test
	public void verifyCategoryForTopWear() {
		List<String> expected = new ArrayList<String>();
		expected.add("Tshirts");
		expected.add("Shirts");
		expected.add("Kurtas");
		expected.add("Sweatshirts");
		expected.add("Jackets");
		expected.add("Sweaters");
		expected.add("Blazers");

		PropUtility repository = new PropUtility();
		UIKeywords.launchURL(Environment.URL);
		UIKeywords.mouseMove(By.xpath(repository.getLocator("men_menu")[0]));

	}
}
