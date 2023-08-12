package com.dataprovider;

import org.testng.annotations.Test;

public class StudentsData {

	@Test(dataProvider = "Students Data" , dataProviderClass = DataProviderDemo.class)
	public void m1(String StudentName, String Section) {
		System.out.println("Student Name: " + StudentName + "\t" + "Section: " + Section);
	}
}
