package Org.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	@BeforeSuite
	private void beforesuite() {
		System.out.println("beforesuite");
	}

	@AfterSuite

	private void aftersuite() {
		System.out.println("aftersuite");

	}

	@BeforeClass

	private void beforeclass() {
		System.out.println("beforeclass");

	}

	@AfterClass

	private void afterclass() {
		System.out.println("afterclass");

	}

	@BeforeTest

	private void beforetest() {
		System.out.println("aftertest");

	}

	@AfterTest

	private void aftertest() {
		System.out.println("aftertest");

	}

	@AfterMethod

	private void aftermethod() {
		System.out.println("aftermethod");

	}

	@BeforeMethod

	private void beforemethod() {
		System.out.println("beforemethod");

	}

	@Test

	private void test() {
		System.out.println("test");

	}

}
