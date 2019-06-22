package com.qa.stepDefinition;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.qa.pages.FinalConfirmationPage;
import com.qa.pages.FlightPaymentPage;
import com.qa.pages.FlightSelectionPage;
import com.qa.pages.HomePage;
import com.qa.pages.RegisterPage;
import com.qa.pages.SignInPage;
import com.qa.testBase.TestBase;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef_1 extends TestBase{

	public StepDef_1() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	RegisterPage register;
	SignInPage signin;
	HomePage homepg;
	FlightSelectionPage flightsel;
	FlightPaymentPage flightPayment;
	FinalConfirmationPage flightConfirm;
	
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	    TestBase.Initialize();
	    String title=driver.getTitle();
	    Assert.assertEquals("Welcome: Mercury Tours", title);
	   TestBase.tearDown();
	}

	@When("^the user moves to registration page$")
	public void the_user_moves_to_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.Initialize();
		register=new RegisterPage();
		register.RegistrationBtnClick();
		String title=register.ValidateTitle();
		Assert.assertEquals("Register: Mercury Tours", title);
		TestBase.tearDown();
	}
	
	
	@When("^the user register by filling the details and submit$")
	public void the_user_register_by_filling_the_details(DataTable details) throws Throwable {
		TestBase.Initialize();
		register=new RegisterPage();
		for (Map<String, String> data : details.asMaps(String.class, String.class)){
			register.RegistrationBtnClick();
			register.CreateNewCustomer(data.get("firstname"), data.get("lastname"),data.get("phone"), data.get("email"),
					data.get("address"), data.get("city"), data.get("state"), data.get("postalCode"), data.get("country"), data.get("username"),
					data.get("password"), data.get("confirm_password"));
		}
		TestBase.tearDown();	
	}

	@When("^the user types username and password after registration and clicks on login$")
	public void the_user_types_username_and_password_after_registration_and_clicks_on_login(DataTable credentials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.Initialize();
		signin=new SignInPage();
		for (Map<String, String> value : credentials.asMaps(String.class, String.class)){
			homepg=signin.signThePage(value.get("username"), value.get("password"));
			driver.findElement(By.linkText("SIGN-OFF")).click();
		}
		TestBase.tearDown();	
	}
	

	@Then("^the user types again username and password to get to the homepage$")
	public void the_user_is_on_the_homepage(DataTable initials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.Initialize();
		signin=new SignInPage();
		List<List<String>> damna=initials.raw();
		homepg=signin.signThePage(damna.get(0).get(1), damna.get(1).get(1));
		String title=homepg.verifyTitle();
		Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		homepg.typeofTripDetails();
		homepg.numberOfPassenger();
		homepg.departureDetails();
		homepg.departureDate();
		homepg.departureDay();
		homepg.arrivalDetails();
		homepg.airlineClass();
		homepg.preferredAirline();
		flightsel=homepg.submitBtn();
	}

	@When("^the user tries to books a flight$")
	public void the_user_tries_to_books_a_flight() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		flightsel.departureFlightSelect();
		flightsel.returnFlightSelect();
		flightPayment=flightsel.reservationConfirm();
	}

	@When("^Fills the customer details on the passenger details page and clicks on submit$")
	public void fills_the_customer_details_on_the_passenger_details_page_and_clicks_on_submit(DataTable payment) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<List<String>> bulls=payment.raw();
		flightPayment.passengerdetails(bulls.get(0).get(1), bulls.get(1).get(1), bulls.get(2).get(1),
				bulls.get(3).get(1), bulls.get(4).get(1), bulls.get(5).get(1));
		flightConfirm=flightPayment.cardDetails();
	}

	@Then("^the flight is booked successfully$")
	public void the_flight_is_booked_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean msg=flightConfirm.confirmmationDetails();
		Assert.assertTrue(msg);
		TestBase.tearDown();
	}
  
}
