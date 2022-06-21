package Test;

import org.testng.annotations.Test;

public class KeywordsinTestNG {
	@Test(invocationCount = 2)
	public void Testa() {
		System.out.println("Testa executed");
	}
	
	@Test(priority = -1,dependsOnMethods = {"Test1"})
	public void Testb() {     
		System.out.println("Testb executed");
	}
     
	@Test(priority = 0,enabled = false)
	public void Testc() {
		System.out.println("Testc executed");
	}
	
	@Test(priority = 1,timeOut = 1000)
	public void Testd() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Testd executed");
	}
}
//priority, it gives preference to the test where '-' comes 1st, then 0 and then '+'.
//invocationCount = 2, it repeats the test 2 times.
//enabled = false,skips the test/
//timeOut gives time limit to the test, if it proceed with in a time then test pass otherwise fails.
//dependOnMethods mean this test is depends on another test if that test fails it also fails and viceversa.
	
