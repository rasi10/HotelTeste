package com.br.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.br.pages.CreateNewBedroomForm;
import com.br.pages.LoginPage;
import com.br.pages.MenuPage;

public class CreateBedroomTest {
	WebDriver driver ;
	private final String BASE_URL="http://rafa:8080/hotel/faces/login/login.xhtml";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		this.driver = new ChromeDriver();
		driver.get(BASE_URL);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	    loginPage.informUserName("marc");
		loginPage.informPassword("1010");
		loginPage.clickLoginButton();
	}
		
	
	@Test
	public void testCreateNewBedroom() {
		CreateNewBedroomForm createBedroomForm =  PageFactory.initElements(driver, CreateNewBedroomForm.class);
		createBedroomForm.clickMenuBedroom();
		createBedroomForm.clickCreateNewBedroom();
		createBedroomForm.clickGoToIndexFromBedroomPage();
		
			
		//fill in the form
		//add a findby to all the fields and elements on the bedroom form page
		//add methods, for example, fill in form where you use the elements from bedroom form page
		//include your assertions
				
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
