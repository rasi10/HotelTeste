package com.br.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.br.pages.LoginPage;

public class LoginTest{
	WebDriver driver ;
	private final String BASE_URL="http://rafa:8080/hotel/faces/login/login.xhtml";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		this.driver = new ChromeDriver();
		driver.get(BASE_URL);
	}
		
	
	@Test
	public void testLogin() {		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	    loginPage.informUserName("marc");
		loginPage.informPassword("1010");
		loginPage.clickLoginButton();
		//include some kind of assertion		
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
