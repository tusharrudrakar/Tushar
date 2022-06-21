package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZerodhaLoginPageTest {
	
    @Test
    public void test1() {
	    System.out.println("Test1 executed");
}
	@Test
	public void test2() {
		System.out.println("Test2 executed");
}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class is executed");
}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class is executed");
}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method is executed");
}
	@AfterMethod()
		public void afterMethod() {
			System.out.println("After Method is executed");
}
	@BeforeTest()
	public void beforeTest() {
		System.out.println("Before Test is executed");
}  
	@AfterTest()
	public void afterTest( ) {
		System.out.println("After Test is exeuted");
 }
}
