package com.stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pojo.FacebookLoginPage;
import com.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookLoginSteps extends BaseClass {
	FacebookLoginPage f;

	@Given("User launch the Facebook url")
	public void user_launch_the_Facebook_url() {
		launchUrl("https://www.facebook.com/");
	}

	@When("User enters the username and password in facebook page")
	public void user_enters_the_username_and_password_in_facebook_page(DataTable table) {
		f = new FacebookLoginPage();
		/*
		 * List<String> asList = table.asList(); insertType(f.getTxtUserName(),
		 * asList.get(0));//Greens insertType(f.getTxtPass(), asList.get(1));//345678
		 * System.out.println(asList.get(0)); System.out.println(asList.get(1));
		 */

		/*
		 * List<List<String>> asLists = table.asLists(); insertType(f.getTxtUserName(),
		 * asLists.get(2).get(0));// Greens13 insertType(f.getTxtPass(),
		 * asLists.get(1).get(1));// 344578 System.out.println(asLists.get(2).get(0));
		 * System.out.println(asLists.get(1).get(1));
		 */

/*		Map<String, String> asMap = table.asMap(String.class, String.class);

		insertType(f.getTxtUserName(), asMap.get("UserName"));// Greens13
		insertType(f.getTxtPass(), asMap.get("Password"));// 344578
		System.out.println(asMap.get("UserName"));
		System.out.println(asMap.get("Password"));
		*/
		List<Map<String, String>> asMaps = table.asMaps();
		insertType(f.getTxtUserName(), asMaps.get(1).get("UserName"));// Greens13
		insertType(f.getTxtPass(), asMaps.get(0).get("Password"));// 344578
		System.out.println(asMaps.get(1).get("UserName"));
		System.out.println(asMaps.get(1).get("UserName"));
	}

	@When("User clicks the login button in facebook page")
	public void user_clicks_the_login_button_in_facebook_page() {
		f = new FacebookLoginPage();
		click(f.getBtnLogin());
	}

	@Then("User validates the login failure of facebook page")
	public void user_validates_the_login_failure_of_facebook_page() throws InterruptedException {
		Thread.sleep(3000);
		String currentUrl = getCurrentUrl();
		Assert.assertTrue("User is not navigated to login failure page", currentUrl.contains("login"));
		
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\" in facebook page$")
	public void user_enters_the_something_and_something_in_facebook_page(String userName, String password)
			throws Throwable {
		f = new FacebookLoginPage();
		insertType(f.getTxtUserName(), userName);
		insertType(f.getTxtPass(), password);
	}
}
