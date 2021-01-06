package stepdefinitions;

import org.junit.Assert;

import com.Driver.Driver;
import com.Pages.HotelbookingPage;
import com.Pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelbookingPageSteps {

	private LoginPage driver1 = new LoginPage(Driver.Chrome());
	private HotelbookingPage driver;

//	@After
//	public void closeBrowser() {
//		driver.closeBrowser();
//	}

	@Given("User is on Hotel Booking Application-Hotel Booking Page")
	public void user_is_on_hotel_booking_application_hotel_booking_page() {
		driver = driver1.navigateToHotelbookingPage();
	}

	@When("User clicks Confirm Booking button without giving {string}")
	public void user_clicks_confirm_booking_button_without_giving(String string) {
		driver.confirmBooking();

	}

	@Then("Should get Alert message {string}")
	public void should_get_alert_message(String Alert_msg) {
		Assert.assertTrue(driver.getAlertText_and_Close().contains(Alert_msg));
		driver.closeBrowser();
	}

	@Given("User entered Firstname {string}")
	public void user_entered_firstname(String Firstname) {
		driver.enterFirstName(Firstname);

	}

	@Given("User entered Lastname {string}")
	public void User_entered_lastname(String Lastname) {
		driver.enterLastName(Lastname);

	}

	@When("User enters invalid mailID format {string}")
	public void user_enters_invalid_mail_id_format(String invalid_mailID) {
		driver.enterEmail(invalid_mailID);

	}

	@When("User clicks Confirm Booking button")
	public void user_clicks_confirm_booking_button() {
		driver.confirmBooking();

	}

	@Given("User entered valid mailID {string}")
	public void user_entered_valid_mail_id(String mailID) {
		driver.enterEmail(mailID);

	}

	@When("User enters invalid mobile number {string}")
	public void user_enters_invalid_mobile_number(String invalid_PhNo) {
		driver.enterMobileNo(invalid_PhNo);

	}

	@Given("User entered valid mobile number {string}")
	public void user_entered_valid_mobile_number(String Mobile_no) {
		driver.enterMobileNo(Mobile_no);

	}

	@Given("User entered Number of Guest staying {string}")
	public void user_entered_number_of_guest_staying(String Guest) {
		driver.selectNoOfPersons(Guest);

	}

	@Given("User filled the Address text box {string}")
	public void user_filled_the_address_text_box(String Address) {
		driver.enterAddressTextBox(Address);

	}

	@Given("User selects the City {string}")
	public void user_selects_the_city(String City) {
		driver.selectCity(City);

	}

	@Given("User selects the state {string}")
	public void user_selects_the_state(String State) {
		driver.selectState(State);

	}

	@Given("User entered Card holder name {string}")
	public void user_entered_card_holder_name(String Card_name) {
		driver.enterCardholderName(Card_name);

	}

	@Given("User entered Debit card Number {string}")
	public void user_entered_debit_card_number(String Debit_no) {
		driver.enterDebit(Debit_no);

	}

	@Given("User entered CVV {string}")
	public void user_entered_cvv(String CVV) {
		driver.enterCvv(CVV);

	}

	@Given("User entered Expiration Month {string}")
	public void user_entered_expiration_month(String Month) {
		driver.enterMonth(Month);
	}

	@Given("User entered Expiration Year {string}")
	public void user_entered_expiration_year(String Year) {
		driver.enterYear(Year);

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title1) {

		Assert.assertTrue(driver.getPageTitle().contains(title1));
		driver.closeBrowser();
	}

	@Then("Page should display {string}")
	public void page_should_display(String title1) {

		Assert.assertTrue(driver.getHeading().contains(title1));

	}
}
