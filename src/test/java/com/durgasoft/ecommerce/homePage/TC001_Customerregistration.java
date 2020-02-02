package com.durgasoft.ecommerce.homePage;

import org.testng.annotations.Test;

import com.durgasoft.ecommerce.basePage.BasePage;
import com.durgasoft.ecommerce.pageUI.CreateLoginAccount;

import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;

public class TC001_Customerregistration extends BasePage {
	public static final Logger log=Logger.getLogger(TC001_Customerregistration.class.getName());
  @Test
  public void customerRegistration()throws Exception{
	  log.info("********Starting TC001_Customerregistration********");
	  CreateLoginAccount login=new CreateLoginAccount(driver);
	  login.createAccount();
	  log.info("******End of TC001_Customerregistration*******");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 browserLaunch("ie","http://automationpractice.com/");
	  //browserLaunch(getData("browser"),getData("url"));

  
  }
  

  @AfterTest
  public void afterTest() {

  }

}
