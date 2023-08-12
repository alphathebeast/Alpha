package com.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@DataProvider(name = "Students Data")
	public Object[][] dataClass() {
		Object[][] obj = { { "Yashpal", "Sanchi" }, { "Ashutosh", "Sanchi" }, { "Swastika", "Nalanda" },
				{ "Sapana", "Nalanda" }, { "Snehal", "Patliputra" } };

		return obj;
	}
}
