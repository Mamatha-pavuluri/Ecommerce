package com.durgasoft.ecommerce.basePage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;



public class BasePage {
	public WebDriver driver;
	public static final String path="./config.properties";
	public String log4jpath="log4j.properties";
	public void selectOption(WebElement element,int option) {
		Select s=new Select(element);
		s.selectByIndex(option);
			
		}
	public int randomNumber()
	{
		Random r=new Random();
		int random=r.nextInt(9999);
		return random;
		
	}
	public String getData(String key)throws Exception {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
	}
	
	public void browserLaunch(String browser,String url) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
           driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer.exe");

			driver=new InternetExplorerDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		PropertyConfigurator.configure(log4jpath);
	}

}
