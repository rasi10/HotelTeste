package com.br.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddBedroomPage extends MenuPage {
	private static final Logger LOG = Logger.getLogger(AddBedroomPage.class.getName());
	
	
	
	@FindBy(xpath = "//a[text()='Create New Bedroom']")
	private WebElement btnCreateNewBedroom;
	
	
	@FindBy(xpath = "//a[text()='Index']")
	private WebElement btnIndexFromAddBedromPage;
	
	
	public void clickCreateNewBedroom(){
		LOG.info("clicking the button create new bedroom");
		btnCreateNewBedroom.click();
		
	}
	
	public void clickGoToIndexFromBedroomPage(){
		LOG.info("clicking the button index from add bedroom page");
		btnIndexFromAddBedromPage.click();
		
	}
	
}
