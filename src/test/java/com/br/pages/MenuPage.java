package com.br.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	private static final Logger LOG = Logger.getLogger(AddBedroomPage.class.getName());
	
	@FindBy(xpath = "//a[text()='Hotel Accommodadion']")
	private WebElement mnTopMenu;
	
	@FindBy(xpath =	"//input[@placeholder='Search...']" )
	private WebElement txSearch;
	
	@FindBy(xpath =	"//button[@class='btn btn-default']" )
	private WebElement btnSearch;
		
	@FindBy(xpath = "//i[@class='fa fa-dashboard fa-fw']")
	private WebElement mnDashboard;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-bed fa-fw']")
	private WebElement mnBedroom;
	
	@FindBy(xpath = "//i[@class='fa fa-credit-card fa-fw']")
	private WebElement mnBill;
	
	@FindBy(xpath = "//i[@class='fa fa-male fa-fw']")
	private WebElement mnClient;
	
	@FindBy(xpath = "//i[@class='fa fa-university fa-fw']")
	private WebElement mnReservation;
	
	@FindBy(xpath = "//i[@class='fa fa-user fa-fw']")
	private WebElement mnUser;
	
	
	public void clickTopMenu(){
		LOG.info("Clicking the top menu 'Hotel Accommodadion'");
		mnTopMenu.click();
	}
	
	public void performSearch(String searchString){
		LOG.info("performing a search with the string"+searchString);
		txSearch.clear();
		txSearch.sendKeys(searchString);
		btnSearch.click();
	}	
	
	public void clickMenuDashboard(){
		LOG.info("Clicking the side menu dashboard");
		mnDashboard.click();
	}
	
	public void clickMenuBedroom(){
		LOG.info("Clicking the side menu bedroom");
		mnBedroom.click();
	}
	
	public void clickMenuBill(){
		LOG.info("Clicking the side menu bill");
		mnBill.click();
	}
	
	public void clickMenuClient(){
		LOG.info("Clicking the side menu client");
		mnClient.click();
	}
	
	public void clickMenuReservation(){
		LOG.info("Clicking the side menu reservation");
		mnReservation.click();
	}
	
	public void clickMenuUser(){
		LOG.info("Clicking the side menu user");
		mnUser.click();
	}
	
	
	

}
