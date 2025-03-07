package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest{
	@Test
	public void testcase1() {
		System.out.println("\t Executing test case 1");
	}
	@Test
	public void testcase2() {
		System.out.println("\t Executing test case 2");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("\t\t\t Executing before testcase");
		}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("\t\t\t Executing after testcase");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("\t\t Executed as first method in the class ");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("\t\t Executed as last method in the class");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("\t Executed before a test in a suite");

	}
	@AfterTest
	public void aftertest() {
		System.out.println("\t Executed after a test in a suite");
		}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("\t\t\t Before a suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("\t\t\t After a suite");
	}

}

