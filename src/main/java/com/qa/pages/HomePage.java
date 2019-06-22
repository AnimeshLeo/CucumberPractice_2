package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement typeOfTrip;
	
	@FindBy(name="passCount")
	WebElement numberOfPass;
	
	@FindBy(name="fromPort")
	WebElement deprtFrom;
	
	@FindBy(name="fromMonth")
	WebElement dateOfDepart;
	
	@FindBy(name="fromDay")
	WebElement dateofDay;
	
	@FindBy(name="toPort")
	WebElement destination;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
			+ "td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/"
			+ "tr[9]/td[2]/font/font/input[1]")
	WebElement serviceClass;
	
	@FindBy(name="airline")
	WebElement airlineName;
	
	@FindBy(name="toMonth")
	WebElement dateOfReturn;
	
	@FindBy(name="toDay")
	WebElement dayOfReturn;
	
	@FindBy(name="findFlights")
	WebElement findFlight;
	
	public HomePage() throws FileNotFoundException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
  public String verifyTitle() {
	  return driver.getTitle();
	  
  }
  public void typeofTripDetails() {
	  typeOfTrip.click();
  }
 public void numberOfPassenger() {
	 Select dropDown=new Select(numberOfPass);
	 dropDown.selectByVisibleText("2");
 }
 public void departureDetails() {
	 Select dropDown=new Select(deprtFrom);
	 dropDown.selectByVisibleText("London");
 }
 public void departureDate(){
	 Select dropDown=new Select(dateOfDepart);
	 dropDown.selectByVisibleText("August");
 }
 public void departureDay() {
	 Select dropDown=new Select(dateofDay);
	 dropDown.selectByVisibleText("13");
 }
 public void arrivalDetails() {
	 Select dropDown=new Select(destination);
	 dropDown.selectByVisibleText("New York");
 }
 public void airlineClass() {
	 serviceClass.click();
 }
 public void preferredAirline() {
	 Select dropDown=new Select(airlineName);
	 dropDown.selectByVisibleText("Blue Skies Airlines");
 }
 public FlightSelectionPage submitBtn() throws FileNotFoundException {
	 findFlight.click();
	 return new FlightSelectionPage();
 }
}
