package stepdefinitions;

import com.Driver.Driver;
import com.Pages.LoginPage;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private static String title;
	private LoginPage driver = new LoginPage(Driver.Chrome());

//	@After
//	public void closeBrowser() {
//		driver.closeBrowser();
//	}

	@Given("User is on Hotel Booking Application-Login page")
	public void user_is_on_hotel_booking_application_login_page() {
		driver.launchUrl();
		title = driver.getLoginPageTitle();
		System.out.println("Page Title-" + title);
	}

	@Then("Verify Page heading is {string} using Xpath")
	public void verify_page_heading_is_using_xpath(String PageTitle1) {
		Assert.assertTrue(title.contains(PageTitle1));
		driver.closeBrowser();
	}

	@When("User clicks Login button without entering {string}")
	public void user_clicks_login_button_without_entering(String Username_Pwd) {
		driver.selectLogin();
	}

	@Then("Should get username error message {string}")
	public void should_get_username_error_message(String Usr_err) {
		Assert.assertTrue(driver.getUsernameErrorMessage().contains(Usr_err));
		driver.closeBrowser();
	}

	@Then("Should get password error message {string}")
	public void should_get_password_error_message(String Pwd_err) {
		Assert.assertTrue(driver.getPasswordErrorMessage().contains(Pwd_err));
		driver.closeBrowser();
	}

	@When("User enters username {string}")
	public void user_enters_username(String Username) {
		driver.enterUsername(Username);
	}

	@When("User enters Password {string}")
	public void user_enters_password(String Password) {
		driver.enterPassword(Password);
	}

	@When("User clicks Login")
	public void user_clicks_login() {
		driver.selectLogin();
	}

	@Then("User should be navigated to hotelbooking Page")
	public void user_should_be_navigated_to_hotelbooking_page() {
		driver.closeBrowser();

	}

}
