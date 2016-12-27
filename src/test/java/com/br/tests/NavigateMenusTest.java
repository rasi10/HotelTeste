package com.br.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.br.pages.LoginPage;
import com.br.pages.MenuPage;

public class NavigateMenusTest {

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
	public void testNavigation() {		
		MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
		menuPage.clickMenuDashboard();
		menuPage.clickMenuBedroom();
		menuPage.clickMenuBill();
		menuPage.clickMenuClient();
		menuPage.clickMenuReservation();
		menuPage.clickMenuUser();
		menuPage.clickTopMenu();
		
		//include your assertions
				
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
