package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
    String currentWorkingDir = System.getProperty("user.dir");

	// By Locators

	private By LoginPageTitle = By.xpath("//h1[@align='center']");
	private By userErrMsg = By.id("userErrMsg");
	private By pwdErrMsg = By.id("pwdErrMsg");
	private By userName = By.name("userName");
	private By userPwd = By.name("userPwd");
	private By LoginButton = By.cssSelector("input[value='Login']");
	
	// Constructor for Page class
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void launchUrl() {

		driver.get(currentWorkingDir+"/CaseStudyUrls/login.html");
//		driver.get("file:///F:/soft/eclipse/Casestudy_HotelBooking/login.html");
	}
	
	//Page actions
	public String getLoginPageTitle() {
		return driver.findElement(LoginPageTitle).getText();
	}
	
	public String getUsernameErrorMessage() {
		return driver.findElement(userErrMsg).getText();
	}
	
	public String getPasswordErrorMessage() {
		return driver.findElement(pwdErrMsg).getText();
	}
	
	public void enterUsername(String Username) {
		driver.findElement(userName).sendKeys(Username);
	}
	
	public void enterPassword(String Password) {
		driver.findElement(userPwd).sendKeys(Password);
	}
	
	public void selectLogin() {
		driver.findElement(LoginButton).click();
	}

	public void closeBrowser() {
		driver.close();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	public HotelbookingPage navigateToHotelbookingPage() {
		driver.get(currentWorkingDir+"/CaseStudyUrls/login.html");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("userPwd")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		System.out.println(driver.getTitle());
		return new HotelbookingPage(driver);
	}
	
}
