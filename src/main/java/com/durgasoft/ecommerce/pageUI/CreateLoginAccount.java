package com.durgasoft.ecommerce.pageUI;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.durgasoft.ecommerce.basePage.BasePage;

public class CreateLoginAccount extends BasePage{
	public static final Logger log=Logger.getLogger(CreateLoginAccount.class.getName());
	@FindBy(linkText="Sign in")WebElement linkSignIN;
	@FindBy(id="email_create")WebElement txtEmailID;
	@FindBy(id="SubmitCreate")WebElement btnCreateAnAccount;
	@FindBy(xpath = "//h1[text()='create an account']")WebElement txtCreateAnAccount;
	public CreateLoginAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createAccount()throws Exception
	{
		Thread.sleep(1000);
		linkSignIN.click();
		log.info("Clicked on SignIN button with objects:"+linkSignIN.toString());
		txtEmailID.sendKeys(getData("firstName")+getData("lastName")+randomNumber()+getData("domainName"));
		
		btnCreateAnAccount.click();
	}
	
	
	
	
}
