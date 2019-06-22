package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FlightSelectionPage extends TestBase{

	@FindBy(xpath="//table//table//table//table//table[1]//tbody[1]//tr[5]//td[1]//input[1]")
	WebElement departFlight;
	
	@FindBy(xpath="//table[2]//tbody[1]//tr[5]//td[1]//input[1]")
	WebElement returnFlight;
	
	@FindBy(name="reserveFlights")
	WebElement reserveBtn;
	
	public FlightSelectionPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);;
		// TODO Auto-generated constructor stub
	}
	
	public void departureFlightSelect() {
		departFlight.click();
	}
	
	public void returnFlightSelect() {
		returnFlight.click();
	}
	public FlightPaymentPage reservationConfirm() throws FileNotFoundException {
		reserveBtn.click();
		return new FlightPaymentPage();
	}
	

}
