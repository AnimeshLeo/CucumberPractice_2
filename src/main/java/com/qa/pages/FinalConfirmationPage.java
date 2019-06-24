package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FinalConfirmationPage extends TestBase {
	
	@FindBy(xpath="//font[contains(text(),'Your ')]")
	WebElement confirmMsg;

	public FinalConfirmationPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void branchTest() {
		System.out.println("hello test");
	}
	
	public boolean confirmmationDetails() {
		boolean msg= confirmMsg.isDisplayed();
		return msg;
		
	}
}
