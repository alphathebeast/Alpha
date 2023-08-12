package com.firsttestng;

import org.testng.annotations.Test;

public class A {

	@Test(groups = { "Sanity" })
	public void m1() {
		System.out.println("i am m1 from A");
	}

	@Test(groups = { "Sanity" })
	public void m2() {
		System.out.println("i am m2 from A");
	}

	@Test(groups = { "Smoke" })
	public void m3() {
		System.out.println("i am m3 from A");
	}

	@Test(groups = { "Sanity" })
	public void m4() {
		System.out.println("i am m4 from A");
	}

	@Test(groups = { "Smoke" })
	public void m5() {
		System.out.println("i am m5 from A");
	}

}
