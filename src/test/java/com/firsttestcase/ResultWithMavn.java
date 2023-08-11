package com.firsttestcase;

import org.testng.annotations.Test;
import com.config.TestBase;
import com.firstpackage.UIKeywords;

public class ResultWithMavn extends TestBase {

	@Test
	public void yashResult() {
		UIKeywords.enterRollNumber("972704");
	}

	@Test
	public void sapanaResult() {
		UIKeywords.enterRollNumber("972555");

	}

	@Test
	public void chunnuResult() {
		UIKeywords.enterRollNumber("972582");
	}

	@Test
	public void snehallResult() {
		UIKeywords.enterRollNumber("972576");
	}
}
