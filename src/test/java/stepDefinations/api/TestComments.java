package stepDefinations.api;
import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import steps.api.APICommonActions;

public class TestComments {

	@Steps
	APICommonActions api_Actions;

	@Given("^I have access to API$")
	public void i_have_access_to_API() throws Throwable {
	}

	@When("^I perform a GET request on \"([^\"]*)\"$")
	public void i_perform_a_GET_request_on(String strAPIURL) throws Throwable {
		api_Actions.getCall(strAPIURL);
	}


	@SuppressWarnings("deprecation")
	@Then("^I get a (\\d+) http status code$")
	public void i_get_a_http_status_code(int code) throws Throwable {
		Assert.assertEquals(api_Actions.getStatusCode(), code);
	}

	@SuppressWarnings("deprecation")
	@Then("^the response collections contains comments as \"([^\"]*)\"$")
	public void the_response_collections_contains_comments_as(String expectedComment) throws Throwable {
		   Assert.assertEquals(api_Actions.getComments(),expectedComment);	   
	}
	
	

}

