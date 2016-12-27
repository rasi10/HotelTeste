package com.br.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewBedroomForm extends AddBedroomPage {
	private static final Logger LOG = Logger.getLogger(AddBedroomPage.class.getName());
	
	@FindBy(xpath = "//a[text()='Save']")
	private WebElement btnSave;	
	
	@FindBy(xpath = "//a[text()='Show All Bedrooms']")
	private WebElement btnShowAllBedrooms;
	
	
	@FindBy(xpath = "//a[text()='Index']")
	private WebElement btnIndexFromBedromFormPage;
	
	public void clickGoToIndexFromBedroomPage(){
		LOG.info("clicking the button index from add bedroom page");
		btnIndexFromBedromFormPage.click();
		
	}
	
}
