package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelbookingPage {

	private WebDriver driver;

	// By Locators
	private By txtFirstName= By.id("txtFirstName");
	private By txtLastName= By.id("txtLastName");
	private By txtEmail= By.id("txtEmail");
	private By txtPhone= By.id("txtPhone");
	private By AddressTextBox= By.cssSelector("textarea");
	private By City= By.name("city");
	private By State= By.name("state");
	private By NoOfPersons= By.name("persons");
	private By txtCardholderName= By.id("txtCardholderName");
	private By txtDebit= By.id("txtDebit");
	private By txtCvv= By.id("txtCvv");
	private By txtMonth= By.id("txtMonth");
	private By txtYear= By.id("txtYear");
	private By btnPayment= By.id("btnPayment");
	private By PageHeading = By.xpath("//h1[@align='center']");
	
	// Constructor for Page class
	
	public HotelbookingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page actions
	
	public void enterFirstName(String Firstname) {
		driver.findElement(txtFirstName).sendKeys(Firstname);
	}

	public void enterLastName(String Lastname) {
		driver.findElement(txtLastName).sendKeys(Lastname);
	}
	
	public void enterEmail(String Email) {
		driver.findElement(txtEmail).sendKeys(Email);
	}
	
	public void enterMobileNo(int MobileNo) {
		String MobileNo1=String.valueOf(MobileNo);
		driver.findElement(txtPhone).sendKeys(MobileNo1);
	}
	
	public void enterMobileNo(String MobileNo2) {
		driver.findElement(txtPhone).sendKeys(MobileNo2);
	}	
	
	public void enterAddressTextBox(String Textbox) {
		driver.findElement(AddressTextBox).sendKeys(Textbox);
	}

	public void enterCardholderName(String CardholderName) {
		driver.findElement(txtCardholderName).sendKeys(CardholderName);
	}
	
	public void enterDebit(String Debit) {
		driver.findElement(txtDebit).sendKeys(Debit);
	}
	
	public void enterCvv(String Cvv) {
		driver.findElement(txtCvv).sendKeys(Cvv);
	}

	public void enterMonth(String Month) {
		driver.findElement(txtMonth).sendKeys(Month);
	}
	
	public void enterYear(String Year) {
		driver.findElement(txtYear).sendKeys(Year);
	}
	
	public void confirmBooking () {
		driver.findElement(btnPayment).click();
	}
	
	public void selectCity(String City2) {
		Select City1=new Select(driver.findElement(City));
		City1.selectByVisibleText(City2);
	}
	
	public void selectState(String State2) {
		Select State1=new Select(driver.findElement(State));
		State1.selectByVisibleText(State2);
	}
	
	public void selectNoOfPersons(String PersonCount) {
		Select Count=new Select(driver.findElement(NoOfPersons));
		Count.selectByVisibleText(PersonCount);		
	}
	
	public String getAlertText_and_Close() {
		String alert=driver.switchTo().alert().getText();
		System.out.println("Alert text-"+alert);
		driver.switchTo().alert().accept();
		return alert;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getHeading() {
		return driver.findElement(PageHeading).getText();
	}
}
