package stepDefination;



import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefination {
	
	@Given("^User in on NetBanking landing page$")
    public void user_in_on_netbanking_landing_page() throws Throwable {
        //code1
		System.out.println("navigated to login url");
    }
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Deciding the browser to open");
    }

    @When("^Broser is triggered$")
    public void broser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check if browser in started$")
    public void check_if_browser_in_started() throws Throwable {
    	System.out.println("Browser is started");
    }

    @When("^User login into application with username and passeword$")
    public void user_login_into_application_with_username_and_passeword() throws Throwable {
    	//code2
    	System.out.println("Logged success");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//code3
    	System.out.println("validated home page");
    }
    @When("^User login first into application with \"([^\"]*)\" and passeword \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_passeword_something(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }

    @And("^Card displayed are \"([^\"]*)\"$")
    public void card_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    List<List<String>> obj = data.asLists();  
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
    
    } 
    
    @When("^User login into application with (.+) and passeword (.+)$")
    public void user_login_into_application_with_and_passeword(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

}
