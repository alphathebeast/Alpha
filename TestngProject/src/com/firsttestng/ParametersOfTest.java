package com.firsttestng;

import org.testng.annotations.Test;

public class ParametersOfTest {
	@Test(enabled = false)
	public void m2() {
		System.out.println("I am m2 method");
	}

	@Test(priority = 1)
	public void m4() {
		System.out.println("I am m4 method");
	}

	@Test(priority = 2)
	public void m1() {
		System.out.println("I am m1 method");
	}

	@Test(invocationCount = 6)
	public void m5() {
		System.out.println("I am m5 method");
	}

	@Test(invocationCount = 0)
	public void m3() {
		System.out.println("I am m3 method");
	}

	@Test(priority = 152)
	public void m6() {
		System.out.println("I am m6 method");
	}

}
