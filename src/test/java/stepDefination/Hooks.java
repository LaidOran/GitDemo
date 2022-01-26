package stepDefination;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

		@Before("@Test")
		public void beforevalidation()
		{
			System.out.println("Methode modifier");	
		}
		@Before("@Test")
		public void beforevalidation1()
		{
			System.out.println("Methode modifier1");	
		}
		 
		@After("@SeleniumTest")
		public void afterSeleniumTest()
		{
			driver.close();
		}
		@After("@smog")
		public void aftersmog()
		{
			driver.close();
		}
}
