package stepDefination;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import PageObjects.CheckOutPage;
import PageObjects.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class MyStepDefinitions{
	public WebDriver driver;
	public HomePage h;
	public CheckOutPage cp;
    @Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver = Base.getDriver();
    	
    }
    
//    @When("^User searched for \"([^\"]*)\" vegetable$")
//    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
//    	h = new HomePage(driver);
//    	h.getSearch().sendKeys(strArg1); 
//        Thread.sleep(3000);
//    }
//    cette méthode a été remplacé par une aute qui utilise data, Scénario Outline
    
    @Then("^\"([^\"]*)\" result are displayed$")
    public void something_result_are_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }  
   
    @And("^added items to cart$")
    public void added_items_to_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^User proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }
    
//    @Then("^verify selected \"([^\"]*)\" items are displayed in check out page$")
//    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
//    	 cp = new CheckOutPage(driver);
//    	 Assert.assertTrue(cp.getProductName().getText().contains(strArg1));
//    }
//    cette méthode a été remplacé par une aute qui utilise data, Scénario Outline    
    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_vegetable(String name) throws Throwable {
    	h = new HomePage(driver);
    	h.getSearch().sendKeys(name); 
        Thread.sleep(3000);
    }
    @Then("^verify selected (.+) items are displayed in check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
    	cp = new CheckOutPage(driver);
    	Assert.assertTrue(cp.getProductName().getText().contains(name));
    }

}